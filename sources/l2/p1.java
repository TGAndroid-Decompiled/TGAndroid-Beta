package l2;

import j$.util.Objects;
public final class p1 {
    public static final p1 f19619b;
    public final h9.t0 f19620a;

    static {
        hi.u0 u0Var = new hi.u0(11);
        u0Var.f15482b = h9.t0.p(2, 1, 5);
        f19619b = new p1(u0Var);
    }

    public p1(hi.u0 u0Var) {
        this.f19620a = (h9.t0) u0Var.f15482b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof p1) && this.f19620a.equals(((p1) obj).f19620a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f19620a, null, null, bool, bool, bool, bool, bool);
    }
}
