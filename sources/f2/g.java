package f2;

import b2.r0;
import b2.t0;
import b2.x;
import v7.t6;
public final class g implements t0 {
    public final float f6736a;
    public final float f6737b;

    public g(float f7, float f10) {
        boolean z10;
        if (f7 >= -90.0f && f7 <= 90.0f && f10 >= -180.0f && f10 <= 180.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.e("Invalid latitude or longitude", z10);
        this.f6736a = f7;
        this.f6737b = f10;
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
            if (this.f6736a == gVar.f6736a && this.f6737b == gVar.f6737b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f6737b).hashCode() + ((Float.valueOf(this.f6736a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f6736a + ", longitude=" + this.f6737b;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
