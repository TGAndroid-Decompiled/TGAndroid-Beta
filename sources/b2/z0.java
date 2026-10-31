package b2;

import java.util.Locale;
import v7.t6;
public final class z0 {
    public static final z0 d = new z0(1.0f, 1.0f);
    public static final String e;
    public static final String f2442f;
    public final float f2443a;
    public final float f2444b;
    public final int f2445c;

    static {
        String str = e2.l0.f6165a;
        e = Integer.toString(0, 36);
        f2442f = Integer.toString(1, 36);
    }

    public z0(float f7, float f10) {
        boolean z10;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        t6.f(f10 > 0.0f);
        this.f2443a = f7;
        this.f2444b = f10;
        this.f2445c = Math.round(f7 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z0.class == obj.getClass()) {
            z0 z0Var = (z0) obj;
            if (this.f2443a == z0Var.f2443a && this.f2444b == z0Var.f2444b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f2444b) + ((Float.floatToRawIntBits(this.f2443a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f2443a), Float.valueOf(this.f2444b)};
        String str = e2.l0.f6165a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
