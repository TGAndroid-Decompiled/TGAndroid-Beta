package c8;

import java.util.Arrays;
public final class h1 {
    public final eb f4836a;
    public final Boolean f4837b;
    public final te f4838c;

    public h1(android.support.v4.media.session.a0 a0Var) {
        this.f4836a = (eb) a0Var.f1724b;
        this.f4837b = (Boolean) a0Var.f1725c;
        this.f4838c = (te) a0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (q6.m.l(this.f4836a, h1Var.f4836a) && q6.m.l(this.f4837b, h1Var.f4837b) && q6.m.l(null, null) && q6.m.l(this.f4838c, h1Var.f4838c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4836a, this.f4837b, null, this.f4838c});
    }
}
