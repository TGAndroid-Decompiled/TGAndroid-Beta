package f2;

import b2.m0;
import b2.o0;
public final class e implements o0 {
    public final float f8785a;
    public final float f8786b;

    public e(float f7, float f10) {
        boolean z10;
        if (f7 >= -90.0f && f7 <= 90.0f && f10 >= -180.0f && f10 <= 180.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.a("Invalid latitude or longitude", z10);
        this.f8785a = f7;
        this.f8786b = f10;
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
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f8785a == eVar.f8785a && this.f8786b == eVar.f8786b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f8786b).hashCode() + ((Float.valueOf(this.f8785a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f8785a + ", longitude=" + this.f8786b;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
