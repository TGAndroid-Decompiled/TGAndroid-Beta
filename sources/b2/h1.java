package b2;

import android.os.Bundle;
import j$.util.Objects;
import v7.u6;
public final class h1 extends g1 {
    public static final String d;
    public static final String e;
    public final int f3780b;
    public final float f3781c;

    static {
        String str = e2.m0.f8259a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public h1(int i10) {
        u6.f("maxStars must be a positive integer", i10 > 0);
        this.f3780b = i10;
        this.f3781c = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f3781c != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.f3775a, 2);
        bundle.putInt(d, this.f3780b);
        bundle.putFloat(e, this.f3781c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (this.f3780b != h1Var.f3780b || this.f3781c != h1Var.f3781c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3780b), Float.valueOf(this.f3781c));
    }

    public h1(int i10, float f7) {
        boolean z10 = false;
        u6.f("maxStars must be a positive integer", i10 > 0);
        if (f7 >= 0.0f && f7 <= i10) {
            z10 = true;
        }
        u6.f("starRating is out of range [0, maxStars]", z10);
        this.f3780b = i10;
        this.f3781c = f7;
    }
}
