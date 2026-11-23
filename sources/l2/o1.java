package l2;

import hi.t5;
import j$.util.Objects;
public final class o1 {
    public static final o1 f19549b;
    public final h9.t0 f19550a;

    static {
        t5 t5Var = new t5(10);
        t5Var.f15508b = h9.t0.p(2, 1, 5);
        f19549b = new o1(t5Var);
    }

    public o1(t5 t5Var) {
        this.f19550a = (h9.t0) t5Var.f15508b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o1) && this.f19550a.equals(((o1) obj).f19550a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f19550a, null, null, bool, bool, bool, bool, bool);
    }
}
