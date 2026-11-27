package defpackage;

import j$.util.Objects;
public final class fv9 {
    public static final fv9 b;
    public final bp5 a;

    static {
        k09 k09Var = new k09((byte) 7);
        k09Var.b = bp5.p(2, 1, 5);
        b = new fv9(k09Var);
    }

    public fv9(k09 k09Var) {
        this.a = (bp5) k09Var.b;
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
