package aa;
public final class d1 {
    public final e1 f1062a;
    public final g1 f1063b;
    public final f1 f1064c;

    public d1(e1 e1Var, g1 g1Var, f1 f1Var) {
        this.f1062a = e1Var;
        this.f1063b = g1Var;
        this.f1064c = f1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d1) {
            d1 d1Var = (d1) obj;
            if (this.f1062a.equals(d1Var.f1062a) && this.f1063b.equals(d1Var.f1063b) && this.f1064c.equals(d1Var.f1064c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f1062a.hashCode() ^ 1000003) * 1000003) ^ this.f1063b.hashCode()) * 1000003) ^ this.f1064c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f1062a + ", osData=" + this.f1063b + ", deviceData=" + this.f1064c + "}";
    }
}
