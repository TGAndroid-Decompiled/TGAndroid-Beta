package h3;

import java.util.Locale;
public final class x1 implements g {
    public static final x1 d = new x1(1.0f, 1.0f);
    public final float f9811a;
    public final float f9812b;
    public final int f9813c;

    static {
        int i9 = d5.f0.f4349a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public x1(float f10, float f11) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        d5.a.f(f11 > 0.0f);
        this.f9811a = f10;
        this.f9812b = f11;
        this.f9813c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x1.class == obj.getClass()) {
            x1 x1Var = (x1) obj;
            if (this.f9811a == x1Var.f9811a && this.f9812b == x1Var.f9812b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f9812b) + ((Float.floatToRawIntBits(this.f9811a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f9811a), Float.valueOf(this.f9812b)};
        int i9 = d5.f0.f4349a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
