package b2;

import android.os.Bundle;
import j$.util.Objects;
import v7.u6;
public final class i1 extends h1 {
    public static final String d;
    public static final String e;
    public final int f2168b;
    public final float f2169c;

    static {
        String str = e2.m0.f8375a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public i1(int i10) {
        u6.f("maxStars must be a positive integer", i10 > 0);
        this.f2168b = i10;
        this.f2169c = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f2169c != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(h1.f2163a, 2);
        bundle.putInt(d, this.f2168b);
        bundle.putFloat(e, this.f2169c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (this.f2168b != i1Var.f2168b || this.f2169c != i1Var.f2169c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2168b), Float.valueOf(this.f2169c));
    }

    public i1(int i10, float f7) {
        boolean z10 = false;
        u6.f("maxStars must be a positive integer", i10 > 0);
        if (f7 >= 0.0f && f7 <= i10) {
            z10 = true;
        }
        u6.f("starRating is out of range [0, maxStars]", z10);
        this.f2168b = i10;
        this.f2169c = f7;
    }
}
