package k9;
public final class b1 {
    public final c1 f10070a;
    public final e1 f10071b;
    public final d1 f10072c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f10070a = c1Var;
        this.f10071b = e1Var;
        this.f10072c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f10070a.equals(b1Var.f10070a) && this.f10071b.equals(b1Var.f10071b) && this.f10072c.equals(b1Var.f10072c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10070a.hashCode() ^ 1000003) * 1000003) ^ this.f10071b.hashCode()) * 1000003) ^ this.f10072c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f10070a + ", osData=" + this.f10071b + ", deviceData=" + this.f10072c + "}";
    }
}
