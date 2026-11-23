package da;
public final class p1 {
    public final q1 f8131a;
    public final s1 f8132b;
    public final r1 f8133c;

    public p1(q1 q1Var, s1 s1Var, r1 r1Var) {
        this.f8131a = q1Var;
        this.f8132b = s1Var;
        this.f8133c = r1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (this.f8131a.equals(p1Var.f8131a) && this.f8132b.equals(p1Var.f8132b) && this.f8133c.equals(p1Var.f8133c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8131a.hashCode() ^ 1000003) * 1000003) ^ this.f8132b.hashCode()) * 1000003) ^ this.f8133c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f8131a + ", osData=" + this.f8132b + ", deviceData=" + this.f8133c + "}";
    }
}
