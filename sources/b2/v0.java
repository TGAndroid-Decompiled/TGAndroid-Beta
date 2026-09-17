package b2;

import java.util.Locale;
public final class v0 {
    public static final v0 d = new v0(1.0f, 1.0f);
    public static final String f2425e;
    public static final String f2426f;
    public final float f2427a;
    public final float f2428b;
    public final int f2429c;

    static {
        String str = e2.d0.f8765a;
        f2425e = Integer.toString(0, 36);
        f2426f = Integer.toString(1, 36);
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
        this.f2427a = f7;
        this.f2428b = f10;
        this.f2429c = Math.round(f7 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f2427a == v0Var.f2427a && this.f2428b == v0Var.f2428b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f2428b) + ((Float.floatToRawIntBits(this.f2427a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f2427a), Float.valueOf(this.f2428b)};
        String str = e2.d0.f8765a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
