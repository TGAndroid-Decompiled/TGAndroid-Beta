package f2;

import b2.r0;
import b2.t0;
import b2.x;
import v7.t6;
public final class g implements t0 {
    public final float f6737a;
    public final float f6738b;

    public g(float f7, float f10) {
        boolean z10;
        if (f7 >= -90.0f && f7 <= 90.0f && f10 >= -180.0f && f10 <= 180.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.e("Invalid latitude or longitude", z10);
        this.f6737a = f7;
        this.f6738b = f10;
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
            if (this.f6737a == gVar.f6737a && this.f6738b == gVar.f6738b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f6738b).hashCode() + ((Float.valueOf(this.f6737a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f6737a + ", longitude=" + this.f6738b;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
