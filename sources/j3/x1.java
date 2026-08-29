package j3;

import java.util.Locale;
public final class x1 implements g {
    public static final x1 d = new x1(1.0f, 1.0f);
    public final float f10848a;
    public final float f10849b;
    public final int f10850c;

    static {
        int i10 = f5.d0.f6579a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public x1(float f9, float f10) {
        boolean z10;
        if (f9 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.f(z10);
        f5.a.f(f10 > 0.0f);
        this.f10848a = f9;
        this.f10849b = f10;
        this.f10850c = Math.round(f9 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x1.class == obj.getClass()) {
            x1 x1Var = (x1) obj;
            if (this.f10848a == x1Var.f10848a && this.f10849b == x1Var.f10849b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f10849b) + ((Float.floatToRawIntBits(this.f10848a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f10848a), Float.valueOf(this.f10849b)};
        int i10 = f5.d0.f6579a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
