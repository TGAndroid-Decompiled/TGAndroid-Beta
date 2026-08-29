package i9;
public final class b1 {
    public final c1 f8609a;
    public final e1 f8610b;
    public final d1 f8611c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f8609a = c1Var;
        this.f8610b = e1Var;
        this.f8611c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f8609a.equals(b1Var.f8609a) && this.f8610b.equals(b1Var.f8610b) && this.f8611c.equals(b1Var.f8611c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8609a.hashCode() ^ 1000003) * 1000003) ^ this.f8610b.hashCode()) * 1000003) ^ this.f8611c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f8609a + ", osData=" + this.f8610b + ", deviceData=" + this.f8611c + "}";
    }
}
