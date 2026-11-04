package b8;

import java.util.Arrays;
public final class cf {
    public final Boolean f2518a;
    public final Boolean f2519b;
    public final Boolean f2520c;
    public final Boolean d;
    public final Boolean f2521e;

    public cf(ke keVar) {
        this.f2518a = (Boolean) keVar.f2716b;
        this.f2519b = (Boolean) keVar.f2717c;
        this.f2520c = (Boolean) keVar.d;
        this.d = (Boolean) keVar.f2718e;
        this.f2521e = (Boolean) keVar.f2719f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cf)) {
            return false;
        }
        cf cfVar = (cf) obj;
        if (p6.m.k(this.f2518a, cfVar.f2518a) && p6.m.k(this.f2519b, cfVar.f2519b) && p6.m.k(this.f2520c, cfVar.f2520c) && p6.m.k(this.d, cfVar.d) && p6.m.k(this.f2521e, cfVar.f2521e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2518a, this.f2519b, this.f2520c, this.d, this.f2521e});
    }
}
