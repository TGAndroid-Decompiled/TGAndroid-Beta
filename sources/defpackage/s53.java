package defpackage;
public final class s53 {
    public final h09 a;
    public final boolean b;

    public s53(h09 h09Var, boolean z) {
        this.a = h09Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s53) {
            s53 s53Var = (s53) obj;
            if (s53Var.a.equals(this.a) && s53Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
    }
}
