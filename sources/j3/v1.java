package j3;

import java.util.Locale;
public final class v1 implements g {
    public static final v1 d = new v1(1.0f, 1.0f);
    public final float f8838a;
    public final float f8839b;
    public final int f8840c;

    static {
        int i10 = h5.d0.f6924a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public v1(float f10, float f11) {
        boolean z4;
        if (f10 > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        h5.a.f(f11 > 0.0f);
        this.f8838a = f10;
        this.f8839b = f11;
        this.f8840c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v1.class == obj.getClass()) {
            v1 v1Var = (v1) obj;
            if (this.f8838a == v1Var.f8838a && this.f8839b == v1Var.f8839b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f8839b) + ((Float.floatToRawIntBits(this.f8838a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f8838a), Float.valueOf(this.f8839b)};
        int i10 = h5.d0.f6924a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
