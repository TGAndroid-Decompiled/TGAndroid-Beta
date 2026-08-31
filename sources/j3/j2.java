package j3;

import java.util.Arrays;
public final class j2 extends f2 {
    public static final String f9214e;
    public static final String f9215f;
    public static final q0 h;
    public final int f9216c;
    public final float d;

    static {
        int i10 = h5.d0.f7237a;
        f9214e = Integer.toString(1, 36);
        f9215f = Integer.toString(2, 36);
        h = new q0(11);
    }

    public j2(int i10) {
        h5.a.e("maxStars must be a positive integer", i10 > 0);
        this.f9216c = i10;
        this.d = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        if (this.f9216c != j2Var.f9216c || this.d != j2Var.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9216c), Float.valueOf(this.d)});
    }

    public j2(int i10, float f10) {
        boolean z4 = false;
        h5.a.e("maxStars must be a positive integer", i10 > 0);
        if (f10 >= 0.0f && f10 <= i10) {
            z4 = true;
        }
        h5.a.e("starRating is out of range [0, maxStars]", z4);
        this.f9216c = i10;
        this.d = f10;
    }
}
