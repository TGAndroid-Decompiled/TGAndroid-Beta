package k2;

import gi.w5;
import j$.util.Objects;
public final class s1 {
    public static final s1 f16732b;
    public final g9.t0 f16733a;

    static {
        w5 w5Var = new w5(6, false);
        w5Var.f13798b = g9.t0.p(2, 1, 5);
        f16732b = new s1(w5Var);
    }

    public s1(w5 w5Var) {
        this.f16733a = (g9.t0) w5Var.f13798b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof s1) && this.f16733a.equals(((s1) obj).f16733a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f16733a, null, null, bool, bool, bool, bool, bool);
    }
}
