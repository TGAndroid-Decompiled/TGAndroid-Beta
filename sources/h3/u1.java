package h3;

import java.util.Arrays;

public final class u1 extends g2 {
    public static final String d;

    public static final f9.z f8208e;

    public final float f8209c;

    static {
        int i10 = d5.g0.f4795a;
        d = Integer.toString(1, 36);
        f8208e = new f9.z(25);
    }

    public u1() {
        this.f8209c = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u1) {
            return this.f8209c == ((u1) obj).f8209c;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8209c)});
    }

    public u1(float f10) {
        d5.a.e("percent must be in the range of [0, 100]", f10 >= 0.0f && f10 <= 100.0f);
        this.f8209c = f10;
    }
}
