package f2;

import a8.yb;
import b2.r0;
import b2.t0;
import b2.x;
public final class g implements t0 {
    public final float f10064a;
    public final float f10065b;

    public g(float f7, float f10) {
        boolean z10;
        if (f7 >= -90.0f && f7 <= 90.0f && f10 >= -180.0f && f10 <= 180.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.f("Invalid latitude or longitude", z10);
        this.f10064a = f7;
        this.f10065b = f10;
    }

    @Override
    public final x a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f10064a == gVar.f10064a && this.f10065b == gVar.f10065b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f10065b).hashCode() + ((Float.valueOf(this.f10064a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f10064a + ", longitude=" + this.f10065b;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
