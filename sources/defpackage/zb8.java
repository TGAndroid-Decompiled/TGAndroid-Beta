package defpackage;

import java.util.Locale;
public final class zb8 {
    public static final zb8 d = new zb8(1.0f);
    public static final String e;
    public static final String f;
    public final float a;
    public final float b;
    public final int c;

    static {
        String str = g8c.a;
        e = "0";
        f = "1";
    }

    public zb8(float f2, float f3) {
        boolean z;
        if (f2 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        gre.f(f3 > 0.0f);
        this.a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zb8.class == obj.getClass()) {
            zb8 zb8Var = (zb8) obj;
            if (this.a == zb8Var.a && this.b == zb8Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        String str = g8c.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public zb8(float f2) {
        this(f2, 1.0f);
    }
}
