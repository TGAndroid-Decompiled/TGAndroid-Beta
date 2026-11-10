package c8;

import java.util.Arrays;
public final class h1 {
    public final eb f5698a;
    public final Boolean f5699b;
    public final te f5700c;

    public h1(android.support.v4.media.session.a0 a0Var) {
        this.f5698a = (eb) a0Var.f1763b;
        this.f5699b = (Boolean) a0Var.f1764c;
        this.f5700c = (te) a0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (q6.m.k(this.f5698a, h1Var.f5698a) && q6.m.k(this.f5699b, h1Var.f5699b) && q6.m.k(null, null) && q6.m.k(this.f5700c, h1Var.f5700c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5698a, this.f5699b, null, this.f5700c});
    }
}
