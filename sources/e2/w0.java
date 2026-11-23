package e2;

import a8.la;
import java.util.Locale;
public final class w0 {
    public static final w0 d = new w0(1.0f, 1.0f);
    public static final String f10819e;
    public static final String f10820f;
    public final float f10821a;
    public final float f10822b;
    public final int f10823c;

    static {
        String str = h2.l0.f13815a;
        f10819e = Integer.toString(0, 36);
        f10820f = Integer.toString(1, 36);
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
        this.f10821a = f10;
        this.f10822b = f11;
        this.f10823c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass()) {
            w0 w0Var = (w0) obj;
            if (this.f10821a == w0Var.f10821a && this.f10822b == w0Var.f10822b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f10822b) + ((Float.floatToRawIntBits(this.f10821a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f10821a), Float.valueOf(this.f10822b)};
        String str = h2.l0.f13815a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
