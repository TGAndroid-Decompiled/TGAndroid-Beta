package b2;

import java.util.Locale;
public final class v0 {
    public static final v0 d = new v0(1.0f, 1.0f);
    public static final String f3671e;
    public static final String f3672f;
    public final float f3673a;
    public final float f3674b;
    public final int f3675c;

    static {
        String str = e2.d0.f8532a;
        f3671e = Integer.toString(0, 36);
        f3672f = Integer.toString(1, 36);
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
        this.f3673a = f7;
        this.f3674b = f10;
        this.f3675c = Math.round(f7 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f3673a == v0Var.f3673a && this.f3674b == v0Var.f3674b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3674b) + ((Float.floatToRawIntBits(this.f3673a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f3673a), Float.valueOf(this.f3674b)};
        String str = e2.d0.f8532a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
