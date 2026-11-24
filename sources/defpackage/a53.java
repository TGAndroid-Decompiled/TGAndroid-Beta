package defpackage;
public final class a53 {
    public final xw8 a;
    public final boolean b;

    public a53(xw8 xw8Var, boolean z) {
        this.a = xw8Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a53) {
            a53 a53Var = (a53) obj;
            if (a53Var.a.equals(this.a) && a53Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
    }
}
