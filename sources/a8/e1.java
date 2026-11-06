package a8;

import java.util.Arrays;
public final class e1 {
    public final z7 f375a;
    public final Boolean f376b;
    public final t8 f377c;

    public e1(android.support.v4.media.session.a0 a0Var) {
        this.f375a = (z7) a0Var.f1763b;
        this.f376b = (Boolean) a0Var.f1764c;
        this.f377c = (t8) a0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        if (q6.m.k(this.f375a, e1Var.f375a) && q6.m.k(this.f376b, e1Var.f376b) && q6.m.k(null, null) && q6.m.k(this.f377c, e1Var.f377c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f375a, this.f376b, null, this.f377c});
    }
}
