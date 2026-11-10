package da;
public final class p1 {
    public final q1 f8471a;
    public final s1 f8472b;
    public final r1 f8473c;

    public p1(q1 q1Var, s1 s1Var, r1 r1Var) {
        this.f8471a = q1Var;
        this.f8472b = s1Var;
        this.f8473c = r1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (this.f8471a.equals(p1Var.f8471a) && this.f8472b.equals(p1Var.f8472b) && this.f8473c.equals(p1Var.f8473c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8471a.hashCode() ^ 1000003) * 1000003) ^ this.f8472b.hashCode()) * 1000003) ^ this.f8473c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f8471a + ", osData=" + this.f8472b + ", deviceData=" + this.f8473c + "}";
    }
}
