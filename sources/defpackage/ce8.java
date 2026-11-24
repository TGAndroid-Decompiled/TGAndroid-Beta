package defpackage;

import java.util.Locale;
public final class ce8 {
    public static final ce8 d = new ce8(1.0f);
    public static final String e;
    public static final String f;
    public final float a;
    public final float b;
    public final int c;

    static {
        String str = hac.a;
        e = "0";
        f = "1";
    }

    public ce8(float f2, float f3) {
        boolean z;
        if (f2 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        jte.f(f3 > 0.0f);
        this.a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ce8.class == obj.getClass()) {
            ce8 ce8Var = (ce8) obj;
            if (this.a == ce8Var.a && this.b == ce8Var.b) {
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
        String str = hac.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public ce8(float f2) {
        this(f2, 1.0f);
    }
}
