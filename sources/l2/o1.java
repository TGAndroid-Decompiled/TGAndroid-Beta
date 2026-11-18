package l2;

import hi.u5;
import j$.util.Objects;
public final class o1 {
    public static final o1 f19518b;
    public final h9.t0 f19519a;

    static {
        u5 u5Var = new u5(10);
        u5Var.f15536b = h9.t0.p(2, 1, 5);
        f19518b = new o1(u5Var);
    }

    public o1(u5 u5Var) {
        this.f19519a = (h9.t0) u5Var.f15536b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o1) && this.f19519a.equals(((o1) obj).f19519a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f19519a, null, null, bool, bool, bool, bool, bool);
    }
}
