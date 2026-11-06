package e2;

import a8.ia;
import java.util.Locale;
public final class w0 {
    public static final w0 d = new w0(1.0f, 1.0f);
    public static final String f10636e;
    public static final String f10637f;
    public final float f10638a;
    public final float f10639b;
    public final int f10640c;

    static {
        String str = h2.m0.f14112a;
        f10636e = Integer.toString(0, 36);
        f10637f = Integer.toString(1, 36);
    }

    public w0(float f10, float f11) {
        boolean z9;
        if (f10 > 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        ia.f(f11 > 0.0f);
        this.f10638a = f10;
        this.f10639b = f11;
        this.f10640c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass()) {
            w0 w0Var = (w0) obj;
            if (this.f10638a == w0Var.f10638a && this.f10639b == w0Var.f10639b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f10639b) + ((Float.floatToRawIntBits(this.f10638a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f10638a), Float.valueOf(this.f10639b)};
        String str = h2.m0.f14112a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
