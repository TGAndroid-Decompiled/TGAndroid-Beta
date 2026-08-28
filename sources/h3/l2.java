package h3;

import fh.y5;
import java.util.Arrays;
public final class l2 extends g2 {
    public static final String f9582e;
    public static final String f9583f;
    public static final y5 h;
    public final int f9584c;
    public final float d;

    static {
        int i9 = d5.f0.f4349a;
        f9582e = Integer.toString(1, 36);
        f9583f = Integer.toString(2, 36);
        h = new y5(23);
    }

    public l2(int i9) {
        d5.a.e("maxStars must be a positive integer", i9 > 0);
        this.f9584c = i9;
        this.d = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        if (this.f9584c != l2Var.f9584c || this.d != l2Var.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9584c), Float.valueOf(this.d)});
    }

    public l2(int i9, float f10) {
        boolean z10 = false;
        d5.a.e("maxStars must be a positive integer", i9 > 0);
        if (f10 >= 0.0f && f10 <= i9) {
            z10 = true;
        }
        d5.a.e("starRating is out of range [0, maxStars]", z10);
        this.f9584c = i9;
        this.d = f10;
    }
}
