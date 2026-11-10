package e2;

import a8.ia;
import java.util.Locale;
public final class w0 {
    public static final w0 d = new w0(1.0f, 1.0f);
    public static final String f10641e;
    public static final String f10642f;
    public final float f10643a;
    public final float f10644b;
    public final int f10645c;

    static {
        String str = h2.m0.f14114a;
        f10641e = Integer.toString(0, 36);
        f10642f = Integer.toString(1, 36);
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
        this.f10643a = f10;
        this.f10644b = f11;
        this.f10645c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass()) {
            w0 w0Var = (w0) obj;
            if (this.f10643a == w0Var.f10643a && this.f10644b == w0Var.f10644b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f10644b) + ((Float.floatToRawIntBits(this.f10643a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f10643a), Float.valueOf(this.f10644b)};
        String str = h2.m0.f14114a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
