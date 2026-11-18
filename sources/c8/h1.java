package c8;

import java.util.Arrays;
public final class h1 {
    public final eb f4804a;
    public final Boolean f4805b;
    public final te f4806c;

    public h1(android.support.v4.media.session.a0 a0Var) {
        this.f4804a = (eb) a0Var.f1705b;
        this.f4805b = (Boolean) a0Var.f1706c;
        this.f4806c = (te) a0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (q6.m.l(this.f4804a, h1Var.f4804a) && q6.m.l(this.f4805b, h1Var.f4805b) && q6.m.l(null, null) && q6.m.l(this.f4806c, h1Var.f4806c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4804a, this.f4805b, null, this.f4806c});
    }
}
