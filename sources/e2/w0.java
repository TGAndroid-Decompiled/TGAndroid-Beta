package e2;

import a8.ma;
import java.util.Locale;
public final class w0 {
    public static final w0 d = new w0(1.0f, 1.0f);
    public static final String f10780e;
    public static final String f10781f;
    public final float f10782a;
    public final float f10783b;
    public final int f10784c;

    static {
        String str = h2.l0.f13778a;
        f10780e = Integer.toString(0, 36);
        f10781f = Integer.toString(1, 36);
    }

    public w0(float f10, float f11) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        ma.f(f11 > 0.0f);
        this.f10782a = f10;
        this.f10783b = f11;
        this.f10784c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass()) {
            w0 w0Var = (w0) obj;
            if (this.f10782a == w0Var.f10782a && this.f10783b == w0Var.f10783b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f10783b) + ((Float.floatToRawIntBits(this.f10782a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f10782a), Float.valueOf(this.f10783b)};
        String str = h2.l0.f13778a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
