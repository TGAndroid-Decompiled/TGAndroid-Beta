package defpackage;
public final class oa0 {
    public final pa0 a;
    public final ra0 b;
    public final qa0 c;

    public oa0(pa0 pa0Var, ra0 ra0Var, qa0 qa0Var) {
        this.a = pa0Var;
        this.b = ra0Var;
        this.c = qa0Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof oa0) {
                oa0 oa0Var = (oa0) obj;
                if (this.a.equals(oa0Var.a) && this.b.equals(oa0Var.b) && this.c.equals(oa0Var.c)) {
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
