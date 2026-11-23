package e2;

import a8.ma;
import java.util.Locale;
public final class w0 {
    public static final w0 d = new w0(1.0f, 1.0f);
    public static final String f10782e;
    public static final String f10783f;
    public final float f10784a;
    public final float f10785b;
    public final int f10786c;

    static {
        String str = h2.l0.f13778a;
        f10782e = Integer.toString(0, 36);
        f10783f = Integer.toString(1, 36);
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
        this.f10784a = f10;
        this.f10785b = f11;
        this.f10786c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass()) {
            w0 w0Var = (w0) obj;
            if (this.f10784a == w0Var.f10784a && this.f10785b == w0Var.f10785b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f10785b) + ((Float.floatToRawIntBits(this.f10784a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f10784a), Float.valueOf(this.f10785b)};
        String str = h2.l0.f13778a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
