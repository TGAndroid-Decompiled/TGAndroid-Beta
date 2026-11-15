package e2;

import a8.ja;
import java.util.Locale;
public final class w0 {
    public static final w0 d = new w0(1.0f, 1.0f);
    public static final String f10472e;
    public static final String f10473f;
    public final float f10474a;
    public final float f10475b;
    public final int f10476c;

    static {
        String str = h2.l0.f13471a;
        f10472e = Integer.toString(0, 36);
        f10473f = Integer.toString(1, 36);
    }

    public w0(float f10, float f11) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        ja.f(f11 > 0.0f);
        this.f10474a = f10;
        this.f10475b = f11;
        this.f10476c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass()) {
            w0 w0Var = (w0) obj;
            if (this.f10474a == w0Var.f10474a && this.f10475b == w0Var.f10475b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f10475b) + ((Float.floatToRawIntBits(this.f10474a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f10474a), Float.valueOf(this.f10475b)};
        String str = h2.l0.f13471a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
