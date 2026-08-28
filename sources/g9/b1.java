package g9;
public final class b1 {
    public final c1 f7474a;
    public final e1 f7475b;
    public final d1 f7476c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f7474a = c1Var;
        this.f7475b = e1Var;
        this.f7476c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f7474a.equals(b1Var.f7474a) && this.f7475b.equals(b1Var.f7475b) && this.f7476c.equals(b1Var.f7476c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7474a.hashCode() ^ 1000003) * 1000003) ^ this.f7475b.hashCode()) * 1000003) ^ this.f7476c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f7474a + ", osData=" + this.f7475b + ", deviceData=" + this.f7476c + "}";
    }
}
