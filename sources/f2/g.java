package f2;

import b2.q0;
import b2.s0;
import v7.u6;
public final class g implements s0 {
    public final float f10288a;
    public final float f10289b;

    public g(float f7, float f10) {
        boolean z10;
        if (f7 >= -90.0f && f7 <= 90.0f && f10 >= -180.0f && f10 <= 180.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.f("Invalid latitude or longitude", z10);
        this.f10288a = f7;
        this.f10289b = f10;
    }

    @Override
    public final b2.w a() {
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
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f10288a == gVar.f10288a && this.f10289b == gVar.f10289b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f10289b).hashCode() + ((Float.valueOf(this.f10288a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f10288a + ", longitude=" + this.f10289b;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
