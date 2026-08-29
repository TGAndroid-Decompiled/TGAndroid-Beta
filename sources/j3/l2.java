package j3;

import java.util.Arrays;
public final class l2 extends g2 {
    public static final String f10619e;
    public static final String f10620f;
    public static final d0 h;
    public final int f10621c;
    public final float d;

    static {
        int i10 = f5.d0.f6579a;
        f10619e = Integer.toString(1, 36);
        f10620f = Integer.toString(2, 36);
        h = new d0(10);
    }

    public l2(int i10) {
        f5.a.e("maxStars must be a positive integer", i10 > 0);
        this.f10621c = i10;
        this.d = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        if (this.f10621c != l2Var.f10621c || this.d != l2Var.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10621c), Float.valueOf(this.d)});
    }

    public l2(int i10, float f9) {
        boolean z10 = false;
        f5.a.e("maxStars must be a positive integer", i10 > 0);
        if (f9 >= 0.0f && f9 <= i10) {
            z10 = true;
        }
        f5.a.e("starRating is out of range [0, maxStars]", z10);
        this.f10621c = i10;
        this.d = f9;
    }
}
