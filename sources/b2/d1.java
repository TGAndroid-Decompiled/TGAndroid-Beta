package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class d1 extends c1 {
    public static final String d;
    public static final String e;
    public final int f2959b;
    public final float f2960c;

    static {
        String str = e2.d0.f7887a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public d1(int i10) {
        e2.d.a("maxStars must be a positive integer", i10 > 0);
        this.f2959b = i10;
        this.f2960c = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f2960c != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f2955a, 2);
        bundle.putInt(d, this.f2959b);
        bundle.putFloat(e, this.f2960c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (this.f2959b != d1Var.f2959b || this.f2960c != d1Var.f2960c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2959b), Float.valueOf(this.f2960c));
    }

    public d1(int i10, float f7) {
        boolean z10 = false;
        e2.d.a("maxStars must be a positive integer", i10 > 0);
        if (f7 >= 0.0f && f7 <= i10) {
            z10 = true;
        }
        e2.d.a("starRating is out of range [0, maxStars]", z10);
        this.f2959b = i10;
        this.f2960c = f7;
    }
}
