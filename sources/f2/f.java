package f2;

import b2.r0;
import b2.t0;
import b2.x;
import v7.u6;
public final class f implements t0 {
    public final float f8845a;
    public final float f8846b;

    public f(float f7, float f10) {
        boolean z10;
        if (f7 >= -90.0f && f7 <= 90.0f && f10 >= -180.0f && f10 <= 180.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.f("Invalid latitude or longitude", z10);
        this.f8845a = f7;
        this.f8846b = f10;
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
            if (this.f8845a == fVar.f8845a && this.f8846b == fVar.f8846b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f8846b).hashCode() + ((Float.valueOf(this.f8845a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f8845a + ", longitude=" + this.f8846b;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
