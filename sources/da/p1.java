package da;
public final class p1 {
    public final q1 f8466a;
    public final s1 f8467b;
    public final r1 f8468c;

    public p1(q1 q1Var, s1 s1Var, r1 r1Var) {
        this.f8466a = q1Var;
        this.f8467b = s1Var;
        this.f8468c = r1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (this.f8466a.equals(p1Var.f8466a) && this.f8467b.equals(p1Var.f8467b) && this.f8468c.equals(p1Var.f8468c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8466a.hashCode() ^ 1000003) * 1000003) ^ this.f8467b.hashCode()) * 1000003) ^ this.f8468c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f8466a + ", osData=" + this.f8467b + ", deviceData=" + this.f8468c + "}";
    }
}
