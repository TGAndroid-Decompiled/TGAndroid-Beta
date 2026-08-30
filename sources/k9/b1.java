package k9;
public final class b1 {
    public final c1 f10090a;
    public final e1 f10091b;
    public final d1 f10092c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f10090a = c1Var;
        this.f10091b = e1Var;
        this.f10092c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f10090a.equals(b1Var.f10090a) && this.f10091b.equals(b1Var.f10091b) && this.f10092c.equals(b1Var.f10092c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10090a.hashCode() ^ 1000003) * 1000003) ^ this.f10091b.hashCode()) * 1000003) ^ this.f10092c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f10090a + ", osData=" + this.f10091b + ", deviceData=" + this.f10092c + "}";
    }
}
