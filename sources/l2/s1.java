package l2;

import j$.util.Objects;
public final class s1 {
    public static final s1 f18045b;
    public final h9.t0 f18046a;

    static {
        h9.f1 f1Var = new h9.f1(7, false);
        f1Var.f14323b = h9.t0.p(2, 1, 5);
        f18045b = new s1(f1Var);
    }

    public s1(h9.f1 f1Var) {
        this.f18046a = (h9.t0) f1Var.f14323b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof s1) && this.f18046a.equals(((s1) obj).f18046a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f18046a, null, null, bool, bool, bool, bool, bool);
    }
}
