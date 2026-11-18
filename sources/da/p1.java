package da;
public final class p1 {
    public final q1 f8137a;
    public final s1 f8138b;
    public final r1 f8139c;

    public p1(q1 q1Var, s1 s1Var, r1 r1Var) {
        this.f8137a = q1Var;
        this.f8138b = s1Var;
        this.f8139c = r1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (this.f8137a.equals(p1Var.f8137a) && this.f8138b.equals(p1Var.f8138b) && this.f8139c.equals(p1Var.f8139c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8137a.hashCode() ^ 1000003) * 1000003) ^ this.f8138b.hashCode()) * 1000003) ^ this.f8139c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f8137a + ", osData=" + this.f8138b + ", deviceData=" + this.f8139c + "}";
    }
}
