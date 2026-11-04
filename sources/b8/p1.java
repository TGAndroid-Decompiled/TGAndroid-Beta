package b8;

import java.util.Arrays;
public final class p1 {
    public final nb f2998a;
    public final Boolean f2999b;
    public final cf f3000c;

    public p1(android.support.v4.media.session.a0 a0Var) {
        this.f2998a = (nb) a0Var.f1186b;
        this.f2999b = (Boolean) a0Var.f1187c;
        this.f3000c = (cf) a0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        if (p6.m.k(this.f2998a, p1Var.f2998a) && p6.m.k(this.f2999b, p1Var.f2999b) && p6.m.k(null, null) && p6.m.k(this.f3000c, p1Var.f3000c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2998a, this.f2999b, null, this.f3000c});
    }
}
