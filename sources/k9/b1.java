package k9;
public final class b1 {
    public final c1 f10829a;
    public final e1 f10830b;
    public final d1 f10831c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f10829a = c1Var;
        this.f10830b = e1Var;
        this.f10831c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f10829a.equals(b1Var.f10829a) && this.f10830b.equals(b1Var.f10830b) && this.f10831c.equals(b1Var.f10831c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10829a.hashCode() ^ 1000003) * 1000003) ^ this.f10830b.hashCode()) * 1000003) ^ this.f10831c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f10829a + ", osData=" + this.f10830b + ", deviceData=" + this.f10831c + "}";
    }
}
