package b2;

import java.util.Locale;
import v7.u6;
public final class a1 {
    public static final a1 d = new a1(1.0f, 1.0f);
    public static final String e;
    public static final String f2072f;
    public final float f2073a;
    public final float f2074b;
    public final int f2075c;

    static {
        String str = e2.m0.f8372a;
        e = Integer.toString(0, 36);
        f2072f = Integer.toString(1, 36);
    }

    public a1(float f7, float f10) {
        boolean z10;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        u6.g(f10 > 0.0f);
        this.f2073a = f7;
        this.f2074b = f10;
        this.f2075c = Math.round(f7 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f2073a == a1Var.f2073a && this.f2074b == a1Var.f2074b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f2074b) + ((Float.floatToRawIntBits(this.f2073a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f2073a), Float.valueOf(this.f2074b)};
        String str = e2.m0.f8372a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
