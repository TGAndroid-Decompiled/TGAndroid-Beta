package c8;

import java.util.Arrays;
public final class h1 {
    public final eb f5695a;
    public final Boolean f5696b;
    public final te f5697c;

    public h1(android.support.v4.media.session.a0 a0Var) {
        this.f5695a = (eb) a0Var.f1763b;
        this.f5696b = (Boolean) a0Var.f1764c;
        this.f5697c = (te) a0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (q6.m.k(this.f5695a, h1Var.f5695a) && q6.m.k(this.f5696b, h1Var.f5696b) && q6.m.k(null, null) && q6.m.k(this.f5697c, h1Var.f5697c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5695a, this.f5696b, null, this.f5697c});
    }
}
