package defpackage;
public final class k00 {
    public static final k00 d = new Object().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public k00(j00 j00Var) {
        this.a = j00Var.a;
        this.b = j00Var.b;
        this.c = j00Var.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && k00.class == obj.getClass()) {
                k00 k00Var = (k00) obj;
                if (this.a == k00Var.a && this.b == k00Var.b && this.c == k00Var.c) {
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
