
package com.wellsfargo.counselor.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long advisorId;

    private String name;
    private String username;
    private String password;

    @OneToMany(mappedBy = "financialAdvisor")
    private List<Client> clients;

    // Constructors, getters, setters
    public FinancialAdvisor() {
    }

    public FinancialAdvisor(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
