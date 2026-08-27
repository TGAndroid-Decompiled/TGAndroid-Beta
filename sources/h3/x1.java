package h3;

import java.util.Locale;

public final class x1 implements g {
    public static final x1 d = new x1(1.0f, 1.0f);

    public final float f8242a;

    public final float f8243b;

    public final int f8244c;

    static {
        int i10 = d5.g0.f4795a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public x1(float f10, float f11) {
        d5.a.f(f10 > 0.0f);
        d5.a.f(f11 > 0.0f);
        this.f8242a = f10;
        this.f8243b = f11;
        this.f8244c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x1.class == obj.getClass()) {
            x1 x1Var = (x1) obj;
            if (this.f8242a == x1Var.f8242a && this.f8243b == x1Var.f8243b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f8243b) + ((Float.floatToRawIntBits(this.f8242a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f8242a), Float.valueOf(this.f8243b)};
        int i10 = d5.g0.f4795a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
