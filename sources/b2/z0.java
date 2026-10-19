package b2;

import java.util.Locale;
import v7.u6;
public final class z0 {
    public static final z0 d = new z0(1.0f, 1.0f);
    public static final String e;
    public static final String f4151f;
    public final float f4152a;
    public final float f4153b;
    public final int f4154c;

    static {
        String str = e2.m0.f8252a;
        e = Integer.toString(0, 36);
        f4151f = Integer.toString(1, 36);
    }

    public z0(float f7, float f10) {
        boolean z10;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        u6.g(f10 > 0.0f);
        this.f4152a = f7;
        this.f4153b = f10;
        this.f4154c = Math.round(f7 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z0.class == obj.getClass()) {
            z0 z0Var = (z0) obj;
            if (this.f4152a == z0Var.f4152a && this.f4153b == z0Var.f4153b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f4153b) + ((Float.floatToRawIntBits(this.f4152a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f4152a), Float.valueOf(this.f4153b)};
        String str = e2.m0.f8252a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
