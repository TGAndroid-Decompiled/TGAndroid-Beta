package c8;

import java.util.Arrays;
public final class h1 {
    public final eb f4797a;
    public final Boolean f4798b;
    public final te f4799c;

    public h1(android.support.v4.media.session.a0 a0Var) {
        this.f4797a = (eb) a0Var.f1676b;
        this.f4798b = (Boolean) a0Var.f1677c;
        this.f4799c = (te) a0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (q6.m.l(this.f4797a, h1Var.f4797a) && q6.m.l(this.f4798b, h1Var.f4798b) && q6.m.l(null, null) && q6.m.l(this.f4799c, h1Var.f4799c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4797a, this.f4798b, null, this.f4799c});
    }
}
