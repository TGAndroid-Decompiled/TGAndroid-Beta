package f2;

import b2.m0;
import b2.o0;
public final class f implements o0 {
    public final float f9563a;
    public final float f9564b;

    public f(float f7, float f10) {
        boolean z10;
        if (f7 >= -90.0f && f7 <= 90.0f && f10 >= -180.0f && f10 <= 180.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.a("Invalid latitude or longitude", z10);
        this.f9563a = f7;
        this.f9564b = f10;
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
            if (this.f9563a == fVar.f9563a && this.f9564b == fVar.f9564b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f9564b).hashCode() + ((Float.valueOf(this.f9563a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f9563a + ", longitude=" + this.f9564b;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
