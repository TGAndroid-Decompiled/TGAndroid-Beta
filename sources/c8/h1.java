package c8;

import java.util.Arrays;
public final class h1 {
    public final eb f4833a;
    public final Boolean f4834b;
    public final te f4835c;

    public h1(android.support.v4.media.session.a0 a0Var) {
        this.f4833a = (eb) a0Var.f1717b;
        this.f4834b = (Boolean) a0Var.f1718c;
        this.f4835c = (te) a0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (q6.m.l(this.f4833a, h1Var.f4833a) && q6.m.l(this.f4834b, h1Var.f4834b) && q6.m.l(null, null) && q6.m.l(this.f4835c, h1Var.f4835c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4833a, this.f4834b, null, this.f4835c});
    }
}
