package defpackage;
public final class k10 {
    public static final k10 d = new Object().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public k10(j10 j10Var) {
        this.a = j10Var.a;
        this.b = j10Var.b;
        this.c = j10Var.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && k10.class == obj.getClass()) {
                k10 k10Var = (k10) obj;
                if (this.a == k10Var.a && this.b == k10Var.b && this.c == k10Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
