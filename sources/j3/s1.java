package j3;

import java.util.Arrays;
public final class s1 extends f2 {
    public static final String d;
    public static final q0 f9409e;
    public final float f9410c;

    static {
        int i10 = h5.d0.f7237a;
        d = Integer.toString(1, 36);
        f9409e = new q0(9);
    }

    public s1() {
        this.f9410c = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s1)) {
            return false;
        }
        if (this.f9410c != ((s1) obj).f9410c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f9410c)});
    }

    public s1(float f10) {
        h5.a.e("percent must be in the range of [0, 100]", f10 >= 0.0f && f10 <= 100.0f);
        this.f9410c = f10;
    }
}
