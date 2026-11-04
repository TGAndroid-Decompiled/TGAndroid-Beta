package d2;

import android.os.Bundle;
import b8.zb;
import j$.util.Objects;
public final class g1 extends f1 {
    public static final String d;
    public static final String f8112e;
    public final int f8113b;
    public final float f8114c;

    static {
        String str = g2.n0.f11873a;
        d = Integer.toString(1, 36);
        f8112e = Integer.toString(2, 36);
    }

    public g1(int i3) {
        zb.e("maxStars must be a positive integer", i3 > 0);
        this.f8113b = i3;
        this.f8114c = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f8114c != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(f1.f8107a, 2);
        bundle.putInt(d, this.f8113b);
        bundle.putFloat(f8112e, this.f8114c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        if (this.f8113b != g1Var.f8113b || this.f8114c != g1Var.f8114c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f8113b), Float.valueOf(this.f8114c));
    }

    public g1(int i3, float f10) {
        boolean z10 = false;
        zb.e("maxStars must be a positive integer", i3 > 0);
        if (f10 >= 0.0f && f10 <= i3) {
            z10 = true;
        }
        zb.e("starRating is out of range [0, maxStars]", z10);
        this.f8113b = i3;
        this.f8114c = f10;
    }
}
