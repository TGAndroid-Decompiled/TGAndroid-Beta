package i2;

import a8.la;
import e2.n0;
import e2.p0;
public final class e implements p0 {
    public final float f15926a;
    public final float f15927b;

    public e(float f10, float f11) {
        boolean z10;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.e("Invalid latitude or longitude", z10);
        this.f15926a = f10;
        this.f15927b = f11;
    }

    @Override
    public final e2.u a() {
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
            if (this.f15926a == eVar.f15926a && this.f15927b == eVar.f15927b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f15927b).hashCode() + ((Float.valueOf(this.f15926a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f15926a + ", longitude=" + this.f15927b;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
