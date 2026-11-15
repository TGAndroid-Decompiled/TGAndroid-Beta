package c8;

import java.util.Arrays;
public final class h1 {
    public final eb f4521a;
    public final Boolean f4522b;
    public final te f4523c;

    public h1(android.support.v4.media.session.a0 a0Var) {
        this.f4521a = (eb) a0Var.f1706b;
        this.f4522b = (Boolean) a0Var.f1707c;
        this.f4523c = (te) a0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (q6.m.k(this.f4521a, h1Var.f4521a) && q6.m.k(this.f4522b, h1Var.f4522b) && q6.m.k(null, null) && q6.m.k(this.f4523c, h1Var.f4523c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4521a, this.f4522b, null, this.f4523c});
    }
}
