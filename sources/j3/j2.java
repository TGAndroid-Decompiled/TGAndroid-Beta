package j3;

import java.util.Arrays;
public final class j2 extends f2 {
    public static final String e;
    public static final String f8621f;
    public static final q0 h;
    public final int f8622c;
    public final float d;

    static {
        int i10 = h5.d0.f6924a;
        e = Integer.toString(1, 36);
        f8621f = Integer.toString(2, 36);
        h = new q0(11);
    }

    public j2(int i10) {
        h5.a.e("maxStars must be a positive integer", i10 > 0);
        this.f8622c = i10;
        this.d = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        if (this.f8622c != j2Var.f8622c || this.d != j2Var.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8622c), Float.valueOf(this.d)});
    }

    public j2(int i10, float f10) {
        boolean z4 = false;
        h5.a.e("maxStars must be a positive integer", i10 > 0);
        if (f10 >= 0.0f && f10 <= i10) {
            z4 = true;
        }
        h5.a.e("starRating is out of range [0, maxStars]", z4);
        this.f8622c = i10;
        this.d = f10;
    }
}
