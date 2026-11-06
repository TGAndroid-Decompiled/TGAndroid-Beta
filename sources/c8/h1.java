package c8;

import java.util.Arrays;
public final class h1 {
    public final eb f5697a;
    public final Boolean f5698b;
    public final te f5699c;

    public h1(android.support.v4.media.session.a0 a0Var) {
        this.f5697a = (eb) a0Var.f1763b;
        this.f5698b = (Boolean) a0Var.f1764c;
        this.f5699c = (te) a0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (q6.m.k(this.f5697a, h1Var.f5697a) && q6.m.k(this.f5698b, h1Var.f5698b) && q6.m.k(null, null) && q6.m.k(this.f5699c, h1Var.f5699c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5697a, this.f5698b, null, this.f5699c});
    }
}
