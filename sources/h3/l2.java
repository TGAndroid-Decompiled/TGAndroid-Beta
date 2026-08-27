package h3;

import java.util.Arrays;

public final class l2 extends g2 {

    public static final String f8012e;

    public static final String f8013f;
    public static final f9.z h;

    public final int f8014c;
    public final float d;

    static {
        int i10 = d5.g0.f4795a;
        f8012e = Integer.toString(1, 36);
        f8013f = Integer.toString(2, 36);
        h = new f9.z(27);
    }

    public l2(int i10) {
        d5.a.e("maxStars must be a positive integer", i10 > 0);
        this.f8014c = i10;
        this.d = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return this.f8014c == l2Var.f8014c && this.d == l2Var.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8014c), Float.valueOf(this.d)});
    }

    public l2(int i10, float f10) {
        boolean z10 = false;
        d5.a.e("maxStars must be a positive integer", i10 > 0);
        if (f10 >= 0.0f && f10 <= i10) {
            z10 = true;
        }
        d5.a.e("starRating is out of range [0, maxStars]", z10);
        this.f8014c = i10;
        this.d = f10;
    }
}
