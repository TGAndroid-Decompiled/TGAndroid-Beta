package da;
public final class p1 {
    public final q1 f8132a;
    public final s1 f8133b;
    public final r1 f8134c;

    public p1(q1 q1Var, s1 s1Var, r1 r1Var) {
        this.f8132a = q1Var;
        this.f8133b = s1Var;
        this.f8134c = r1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (this.f8132a.equals(p1Var.f8132a) && this.f8133b.equals(p1Var.f8133b) && this.f8134c.equals(p1Var.f8134c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8132a.hashCode() ^ 1000003) * 1000003) ^ this.f8133b.hashCode()) * 1000003) ^ this.f8134c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f8132a + ", osData=" + this.f8133b + ", deviceData=" + this.f8134c + "}";
    }
}
