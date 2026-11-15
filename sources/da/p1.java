package da;
public final class p1 {
    public final q1 f7858a;
    public final s1 f7859b;
    public final r1 f7860c;

    public p1(q1 q1Var, s1 s1Var, r1 r1Var) {
        this.f7858a = q1Var;
        this.f7859b = s1Var;
        this.f7860c = r1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (this.f7858a.equals(p1Var.f7858a) && this.f7859b.equals(p1Var.f7859b) && this.f7860c.equals(p1Var.f7860c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7858a.hashCode() ^ 1000003) * 1000003) ^ this.f7859b.hashCode()) * 1000003) ^ this.f7860c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f7858a + ", osData=" + this.f7859b + ", deviceData=" + this.f7860c + "}";
    }
}
