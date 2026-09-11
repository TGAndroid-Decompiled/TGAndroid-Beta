package b2;

import java.util.Locale;
public final class v0 {
    public static final v0 d = new v0(1.0f, 1.0f);
    public static final String f2398e;
    public static final String f2399f;
    public final float f2400a;
    public final float f2401b;
    public final int f2402c;

    static {
        String str = e2.d0.f8737a;
        f2398e = Integer.toString(0, 36);
        f2399f = Integer.toString(1, 36);
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
        this.f2400a = f7;
        this.f2401b = f10;
        this.f2402c = Math.round(f7 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f2400a == v0Var.f2400a && this.f2401b == v0Var.f2401b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f2401b) + ((Float.floatToRawIntBits(this.f2400a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f2400a), Float.valueOf(this.f2401b)};
        String str = e2.d0.f8737a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
