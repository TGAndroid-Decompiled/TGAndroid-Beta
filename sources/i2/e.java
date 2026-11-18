package i2;

import a8.la;
import e2.n0;
import e2.p0;
public final class e implements p0 {
    public final float f15923a;
    public final float f15924b;

    public e(float f10, float f11) {
        boolean z10;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.e("Invalid latitude or longitude", z10);
        this.f15923a = f10;
        this.f15924b = f11;
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
            if (this.f15923a == eVar.f15923a && this.f15924b == eVar.f15924b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f15924b).hashCode() + ((Float.valueOf(this.f15923a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f15923a + ", longitude=" + this.f15924b;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
