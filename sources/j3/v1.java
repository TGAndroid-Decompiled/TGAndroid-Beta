package j3;

import java.util.Locale;
public final class v1 implements g {
    public static final v1 d = new v1(1.0f, 1.0f);
    public final float f9452a;
    public final float f9453b;
    public final int f9454c;

    static {
        int i10 = h5.d0.f7237a;
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
        this.f9452a = f10;
        this.f9453b = f11;
        this.f9454c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v1.class == obj.getClass()) {
            v1 v1Var = (v1) obj;
            if (this.f9452a == v1Var.f9452a && this.f9453b == v1Var.f9453b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f9453b) + ((Float.floatToRawIntBits(this.f9452a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f9452a), Float.valueOf(this.f9453b)};
        int i10 = h5.d0.f7237a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
