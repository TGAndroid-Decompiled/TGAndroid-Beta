package f2;

import b2.m0;
import b2.o0;
public final class e implements o0 {
    public final float f8798a;
    public final float f8799b;

    public e(float f7, float f10) {
        boolean z10;
        if (f7 >= -90.0f && f7 <= 90.0f && f10 >= -180.0f && f10 <= 180.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.a("Invalid latitude or longitude", z10);
        this.f8798a = f7;
        this.f8799b = f10;
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
            if (this.f8798a == eVar.f8798a && this.f8799b == eVar.f8799b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f8799b).hashCode() + ((Float.valueOf(this.f8798a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f8798a + ", longitude=" + this.f8799b;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
