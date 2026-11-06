package da;
public final class p1 {
    public final q1 f8468a;
    public final s1 f8469b;
    public final r1 f8470c;

    public p1(q1 q1Var, s1 s1Var, r1 r1Var) {
        this.f8468a = q1Var;
        this.f8469b = s1Var;
        this.f8470c = r1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (this.f8468a.equals(p1Var.f8468a) && this.f8469b.equals(p1Var.f8469b) && this.f8470c.equals(p1Var.f8470c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8468a.hashCode() ^ 1000003) * 1000003) ^ this.f8469b.hashCode()) * 1000003) ^ this.f8470c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f8468a + ", osData=" + this.f8469b + ", deviceData=" + this.f8470c + "}";
    }
}
