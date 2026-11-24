package defpackage;
public final class l63 {
    public final yy8 a;
    public final boolean b;

    public l63(yy8 yy8Var, boolean z) {
        this.a = yy8Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l63) {
            l63 l63Var = (l63) obj;
            if (l63Var.a.equals(this.a) && l63Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
    }
}
