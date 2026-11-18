package da;
public final class p1 {
    public final q1 f8140a;
    public final s1 f8141b;
    public final r1 f8142c;

    public p1(q1 q1Var, s1 s1Var, r1 r1Var) {
        this.f8140a = q1Var;
        this.f8141b = s1Var;
        this.f8142c = r1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (this.f8140a.equals(p1Var.f8140a) && this.f8141b.equals(p1Var.f8141b) && this.f8142c.equals(p1Var.f8142c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8140a.hashCode() ^ 1000003) * 1000003) ^ this.f8141b.hashCode()) * 1000003) ^ this.f8142c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f8140a + ", osData=" + this.f8141b + ", deviceData=" + this.f8142c + "}";
    }
}
