package b2;

import java.util.Locale;
public final class v0 {
    public static final v0 d = new v0(1.0f, 1.0f);
    public static final String e;
    public static final String f3329f;
    public final float f3330a;
    public final float f3331b;
    public final int f3332c;

    static {
        String str = e2.d0.f7872a;
        e = Integer.toString(0, 36);
        f3329f = Integer.toString(1, 36);
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
        this.f3330a = f7;
        this.f3331b = f10;
        this.f3332c = Math.round(f7 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f3330a == v0Var.f3330a && this.f3331b == v0Var.f3331b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3331b) + ((Float.floatToRawIntBits(this.f3330a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f3330a), Float.valueOf(this.f3331b)};
        String str = e2.d0.f7872a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
