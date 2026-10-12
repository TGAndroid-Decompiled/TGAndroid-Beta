package f2;

import b2.r0;
import b2.t0;
import b2.x;
import v7.u6;
public final class f implements t0 {
    public final float f8842a;
    public final float f8843b;

    public f(float f7, float f10) {
        boolean z10;
        if (f7 >= -90.0f && f7 <= 90.0f && f10 >= -180.0f && f10 <= 180.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.f("Invalid latitude or longitude", z10);
        this.f8842a = f7;
        this.f8843b = f10;
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
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f8842a == fVar.f8842a && this.f8843b == fVar.f8843b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f8843b).hashCode() + ((Float.valueOf(this.f8842a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f8842a + ", longitude=" + this.f8843b;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
