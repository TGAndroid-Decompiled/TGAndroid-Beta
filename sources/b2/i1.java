package b2;

import a8.yb;
import android.os.Bundle;
import j$.util.Objects;
public final class i1 extends h1 {
    public static final String d;
    public static final String e;
    public final int f3231b;
    public final float f3232c;

    static {
        String str = e2.n0.f9692a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public i1(int i10) {
        yb.f("maxStars must be a positive integer", i10 > 0);
        this.f3231b = i10;
        this.f3232c = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f3232c != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(h1.f3226a, 2);
        bundle.putInt(d, this.f3231b);
        bundle.putFloat(e, this.f3232c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (this.f3231b != i1Var.f3231b || this.f3232c != i1Var.f3232c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3231b), Float.valueOf(this.f3232c));
    }

    public i1(int i10, float f7) {
        boolean z10 = false;
        yb.f("maxStars must be a positive integer", i10 > 0);
        if (f7 >= 0.0f && f7 <= i10) {
            z10 = true;
        }
        yb.f("starRating is out of range [0, maxStars]", z10);
        this.f3231b = i10;
        this.f3232c = f7;
    }
}
