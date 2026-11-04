package d2;

import b8.zb;
import java.util.Locale;
public final class y0 {
    public static final y0 d = new y0(1.0f, 1.0f);
    public static final String f8515e;
    public static final String f8516f;
    public final float f8517a;
    public final float f8518b;
    public final int f8519c;

    static {
        String str = g2.n0.f11873a;
        f8515e = Integer.toString(0, 36);
        f8516f = Integer.toString(1, 36);
    }

    public y0(float f10, float f11) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        zb.f(f11 > 0.0f);
        this.f8517a = f10;
        this.f8518b = f11;
        this.f8519c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass()) {
            y0 y0Var = (y0) obj;
            if (this.f8517a == y0Var.f8517a && this.f8518b == y0Var.f8518b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f8518b) + ((Float.floatToRawIntBits(this.f8517a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f8517a), Float.valueOf(this.f8518b)};
        String str = g2.n0.f11873a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
