package defpackage;

import java.util.Locale;
public final class of8 {
    public static final of8 d = new of8(1.0f);
    public static final String e;
    public static final String f;
    public final float a;
    public final float b;
    public final int c;

    static {
        String str = gcc.a;
        e = "0";
        f = "1";
    }

    public of8(float f2, float f3) {
        boolean z;
        if (f2 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        yve.f(f3 > 0.0f);
        this.a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && of8.class == obj.getClass()) {
            of8 of8Var = (of8) obj;
            if (this.a == of8Var.a && this.b == of8Var.b) {
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
        String str = gcc.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public of8(float f2) {
        this(f2, 1.0f);
    }
}
