package c8;

import java.util.Arrays;
public final class h1 {
    public final eb f4807a;
    public final Boolean f4808b;
    public final te f4809c;

    public h1(android.support.v4.media.session.a0 a0Var) {
        this.f4807a = (eb) a0Var.f1704b;
        this.f4808b = (Boolean) a0Var.f1705c;
        this.f4809c = (te) a0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (q6.m.l(this.f4807a, h1Var.f4807a) && q6.m.l(this.f4808b, h1Var.f4808b) && q6.m.l(null, null) && q6.m.l(this.f4809c, h1Var.f4809c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4807a, this.f4808b, null, this.f4809c});
    }
}
