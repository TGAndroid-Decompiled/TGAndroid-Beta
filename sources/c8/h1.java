package c8;

import java.util.Arrays;
public final class h1 {
    public final eb f4524a;
    public final Boolean f4525b;
    public final te f4526c;

    public h1(android.support.v4.media.session.a0 a0Var) {
        this.f4524a = (eb) a0Var.f1713b;
        this.f4525b = (Boolean) a0Var.f1714c;
        this.f4526c = (te) a0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (q6.m.k(this.f4524a, h1Var.f4524a) && q6.m.k(this.f4525b, h1Var.f4525b) && q6.m.k(null, null) && q6.m.k(this.f4526c, h1Var.f4526c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4524a, this.f4525b, null, this.f4526c});
    }
}
