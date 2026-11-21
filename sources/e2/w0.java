package e2;

import a8.la;
import java.util.Locale;
public final class w0 {
    public static final w0 d = new w0(1.0f, 1.0f);
    public static final String f10816e;
    public static final String f10817f;
    public final float f10818a;
    public final float f10819b;
    public final int f10820c;

    static {
        String str = h2.l0.f13812a;
        f10816e = Integer.toString(0, 36);
        f10817f = Integer.toString(1, 36);
    }

    public w0(float f10, float f11) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        la.f(f11 > 0.0f);
        this.f10818a = f10;
        this.f10819b = f11;
        this.f10820c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass()) {
            w0 w0Var = (w0) obj;
            if (this.f10818a == w0Var.f10818a && this.f10819b == w0Var.f10819b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f10819b) + ((Float.floatToRawIntBits(this.f10818a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f10818a), Float.valueOf(this.f10819b)};
        String str = h2.l0.f13812a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
