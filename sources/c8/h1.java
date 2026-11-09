package c8;

import java.util.Arrays;
public final class h1 {
    public final eb f5693a;
    public final Boolean f5694b;
    public final te f5695c;

    public h1(android.support.v4.media.session.a0 a0Var) {
        this.f5693a = (eb) a0Var.f1763b;
        this.f5694b = (Boolean) a0Var.f1764c;
        this.f5695c = (te) a0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (q6.m.k(this.f5693a, h1Var.f5693a) && q6.m.k(this.f5694b, h1Var.f5694b) && q6.m.k(null, null) && q6.m.k(this.f5695c, h1Var.f5695c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5693a, this.f5694b, null, this.f5695c});
    }
}
