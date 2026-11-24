package defpackage;
public final class ma0 {
    public final na0 a;
    public final pa0 b;
    public final oa0 c;

    public ma0(na0 na0Var, pa0 pa0Var, oa0 oa0Var) {
        this.a = na0Var;
        this.b = pa0Var;
        this.c = oa0Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ma0) {
                ma0 ma0Var = (ma0) obj;
                if (this.a.equals(ma0Var.a) && this.b.equals(ma0Var.b) && this.c.equals(ma0Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
