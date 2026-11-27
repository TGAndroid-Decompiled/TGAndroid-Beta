package defpackage;
public final class l00 {
    public static final l00 d = new Object().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public l00(k00 k00Var) {
        this.a = k00Var.a;
        this.b = k00Var.b;
        this.c = k00Var.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && l00.class == obj.getClass()) {
                l00 l00Var = (l00) obj;
                if (this.a == l00Var.a && this.b == l00Var.b && this.c == l00Var.c) {
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
