package i2;

import a8.la;
import e2.n0;
import e2.p0;
public final class e implements p0 {
    public final float f15951a;
    public final float f15952b;

    public e(float f10, float f11) {
        boolean z10;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.e("Invalid latitude or longitude", z10);
        this.f15951a = f10;
        this.f15952b = f11;
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
            if (this.f15951a == eVar.f15951a && this.f15952b == eVar.f15952b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f15952b).hashCode() + ((Float.valueOf(this.f15951a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f15951a + ", longitude=" + this.f15952b;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
