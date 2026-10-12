package b2;

import java.util.Locale;
public final class v0 {
    public static final v0 d = new v0(1.0f, 1.0f);
    public static final String f3669e;
    public static final String f3670f;
    public final float f3671a;
    public final float f3672b;
    public final int f3673c;

    static {
        String str = e2.d0.f8529a;
        f3669e = Integer.toString(0, 36);
        f3670f = Integer.toString(1, 36);
    }

    public v0(float f7, float f10) {
        boolean z10;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        e2.d.b(f10 > 0.0f);
        this.f3671a = f7;
        this.f3672b = f10;
        this.f3673c = Math.round(f7 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f3671a == v0Var.f3671a && this.f3672b == v0Var.f3672b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3672b) + ((Float.floatToRawIntBits(this.f3671a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f3671a), Float.valueOf(this.f3672b)};
        String str = e2.d0.f8529a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
