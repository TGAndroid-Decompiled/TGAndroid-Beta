package i2;

import a8.ia;
import e2.n0;
import e2.p0;
public final class e implements p0 {
    public final float f15154a;
    public final float f15155b;

    public e(float f10, float f11) {
        boolean z9;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.e("Invalid latitude or longitude", z9);
        this.f15154a = f10;
        this.f15155b = f11;
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
            if (this.f15154a == eVar.f15154a && this.f15155b == eVar.f15155b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f15155b).hashCode() + ((Float.valueOf(this.f15154a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f15154a + ", longitude=" + this.f15155b;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
