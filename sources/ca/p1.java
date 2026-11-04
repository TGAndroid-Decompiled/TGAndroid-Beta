package ca;
public final class p1 {
    public final q1 f4494a;
    public final s1 f4495b;
    public final r1 f4496c;

    public p1(q1 q1Var, s1 s1Var, r1 r1Var) {
        this.f4494a = q1Var;
        this.f4495b = s1Var;
        this.f4496c = r1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (this.f4494a.equals(p1Var.f4494a) && this.f4495b.equals(p1Var.f4495b) && this.f4496c.equals(p1Var.f4496c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f4494a.hashCode() ^ 1000003) * 1000003) ^ this.f4495b.hashCode()) * 1000003) ^ this.f4496c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f4494a + ", osData=" + this.f4495b + ", deviceData=" + this.f4496c + "}";
    }
}
