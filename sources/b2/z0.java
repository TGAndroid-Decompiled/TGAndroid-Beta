package b2;

import java.util.Locale;
import v7.u6;
public final class z0 {
    public static final z0 d = new z0(1.0f, 1.0f);
    public static final String e;
    public static final String f4155f;
    public final float f4156a;
    public final float f4157b;
    public final int f4158c;

    static {
        String str = e2.m0.f8253a;
        e = Integer.toString(0, 36);
        f4155f = Integer.toString(1, 36);
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
        this.f4156a = f7;
        this.f4157b = f10;
        this.f4158c = Math.round(f7 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z0.class == obj.getClass()) {
            z0 z0Var = (z0) obj;
            if (this.f4156a == z0Var.f4156a && this.f4157b == z0Var.f4157b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f4157b) + ((Float.floatToRawIntBits(this.f4156a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f4156a), Float.valueOf(this.f4157b)};
        String str = e2.m0.f8253a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
