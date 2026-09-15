package b2;

import java.util.Locale;
public final class v0 {
    public static final v0 d = new v0(1.0f, 1.0f);
    public static final String e;
    public static final String f3330f;
    public final float f3331a;
    public final float f3332b;
    public final int f3333c;

    static {
        String str = e2.d0.f7883a;
        e = Integer.toString(0, 36);
        f3330f = Integer.toString(1, 36);
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
        this.f3331a = f7;
        this.f3332b = f10;
        this.f3333c = Math.round(f7 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f3331a == v0Var.f3331a && this.f3332b == v0Var.f3332b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3332b) + ((Float.floatToRawIntBits(this.f3331a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f3331a), Float.valueOf(this.f3332b)};
        String str = e2.d0.f7883a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
