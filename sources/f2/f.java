package f2;

import b2.m0;
import b2.o0;
public final class f implements o0 {
    public final float f9566a;
    public final float f9567b;

    public f(float f7, float f10) {
        boolean z10;
        if (f7 >= -90.0f && f7 <= 90.0f && f10 >= -180.0f && f10 <= 180.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.a("Invalid latitude or longitude", z10);
        this.f9566a = f7;
        this.f9567b = f10;
    }

    @Override
    public final b2.s a() {
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
            if (this.f9566a == fVar.f9566a && this.f9567b == fVar.f9567b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f9567b).hashCode() + ((Float.valueOf(this.f9566a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f9566a + ", longitude=" + this.f9567b;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
