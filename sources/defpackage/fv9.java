package defpackage;

import j$.util.Objects;
public final class fv9 {
    public static final fv9 b;
    public final bp5 a;

    static {
        l09 l09Var = new l09((byte) 7);
        l09Var.b = bp5.p(2, 1, 5);
        b = new fv9(l09Var);
    }

    public fv9(l09 l09Var) {
        this.a = (bp5) l09Var.b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fv9) && this.a.equals(((fv9) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
