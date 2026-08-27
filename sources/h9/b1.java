package h9;

public final class b1 {

    public final c1 f8645a;

    public final e1 f8646b;

    public final d1 f8647c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f8645a = c1Var;
        this.f8646b = e1Var;
        this.f8647c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f8645a.equals(b1Var.f8645a) && this.f8646b.equals(b1Var.f8646b) && this.f8647c.equals(b1Var.f8647c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8645a.hashCode() ^ 1000003) * 1000003) ^ this.f8646b.hashCode()) * 1000003) ^ this.f8647c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f8645a + ", osData=" + this.f8646b + ", deviceData=" + this.f8647c + "}";
    }
}
