package h2;

import b8.zb;
import d2.p0;
import d2.r0;
import d2.v;
public final class e implements r0 {
    public final float f14107a;
    public final float f14108b;

    public e(float f10, float f11) {
        boolean z10;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.e("Invalid latitude or longitude", z10);
        this.f14107a = f10;
        this.f14108b = f11;
    }

    @Override
    public final v b() {
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
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f14107a == eVar.f14107a && this.f14108b == eVar.f14108b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f14108b).hashCode() + ((Float.valueOf(this.f14107a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f14107a + ", longitude=" + this.f14108b;
    }

    @Override
    public final void a(p0 p0Var) {
    }
}
