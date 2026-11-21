package da;
public final class p1 {
    public final q1 f8166a;
    public final s1 f8167b;
    public final r1 f8168c;

    public p1(q1 q1Var, s1 s1Var, r1 r1Var) {
        this.f8166a = q1Var;
        this.f8167b = s1Var;
        this.f8168c = r1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (this.f8166a.equals(p1Var.f8166a) && this.f8167b.equals(p1Var.f8167b) && this.f8168c.equals(p1Var.f8168c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8166a.hashCode() ^ 1000003) * 1000003) ^ this.f8167b.hashCode()) * 1000003) ^ this.f8168c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f8166a + ", osData=" + this.f8167b + ", deviceData=" + this.f8168c + "}";
    }
}
