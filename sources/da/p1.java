package da;
public final class p1 {
    public final q1 f7855a;
    public final s1 f7856b;
    public final r1 f7857c;

    public p1(q1 q1Var, s1 s1Var, r1 r1Var) {
        this.f7855a = q1Var;
        this.f7856b = s1Var;
        this.f7857c = r1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (this.f7855a.equals(p1Var.f7855a) && this.f7856b.equals(p1Var.f7856b) && this.f7857c.equals(p1Var.f7857c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7855a.hashCode() ^ 1000003) * 1000003) ^ this.f7856b.hashCode()) * 1000003) ^ this.f7857c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f7855a + ", osData=" + this.f7856b + ", deviceData=" + this.f7857c + "}";
    }
}
