package j3;

import java.util.Arrays;
public final class u1 extends g2 {
    public static final String d;
    public static final d0 f10816e;
    public final float f10817c;

    static {
        int i10 = f5.d0.f6579a;
        d = Integer.toString(1, 36);
        f10816e = new d0(8);
    }

    public u1() {
        this.f10817c = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u1)) {
            return false;
        }
        if (this.f10817c != ((u1) obj).f10817c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f10817c)});
    }

    public u1(float f9) {
        f5.a.e("percent must be in the range of [0, 100]", f9 >= 0.0f && f9 <= 100.0f);
        this.f10817c = f9;
    }
}
