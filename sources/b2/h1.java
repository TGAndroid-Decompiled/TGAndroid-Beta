package b2;

import android.os.Bundle;
import j$.util.Objects;
import v7.t6;
public final class h1 extends g1 {
    public static final String d;
    public static final String e;
    public final int f2061b;
    public final float f2062c;

    static {
        String str = e2.l0.f6165a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public h1(int i10) {
        t6.e("maxStars must be a positive integer", i10 > 0);
        this.f2061b = i10;
        this.f2062c = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f2062c != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.f2046a, 2);
        bundle.putInt(d, this.f2061b);
        bundle.putFloat(e, this.f2062c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (this.f2061b != h1Var.f2061b || this.f2062c != h1Var.f2062c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2061b), Float.valueOf(this.f2062c));
    }

    public h1(int i10, float f7) {
        boolean z10 = false;
        t6.e("maxStars must be a positive integer", i10 > 0);
        if (f7 >= 0.0f && f7 <= i10) {
            z10 = true;
        }
        t6.e("starRating is out of range [0, maxStars]", z10);
        this.f2061b = i10;
        this.f2062c = f7;
    }
}
