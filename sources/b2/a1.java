package b2;

import a8.yb;
import java.util.Locale;
public final class a1 {
    public static final a1 d = new a1(1.0f, 1.0f);
    public static final String e;
    public static final String f3139f;
    public final float f3140a;
    public final float f3141b;
    public final int f3142c;

    static {
        String str = e2.n0.f9692a;
        e = Integer.toString(0, 36);
        f3139f = Integer.toString(1, 36);
    }

    public a1(float f7, float f10) {
        boolean z10;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        yb.g(f10 > 0.0f);
        this.f3140a = f7;
        this.f3141b = f10;
        this.f3142c = Math.round(f7 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f3140a == a1Var.f3140a && this.f3141b == a1Var.f3141b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3141b) + ((Float.floatToRawIntBits(this.f3140a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f3140a), Float.valueOf(this.f3141b)};
        String str = e2.n0.f9692a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
