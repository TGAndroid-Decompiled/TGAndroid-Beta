package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class d1 extends c1 {
    public static final String d;
    public static final String f3189e;
    public final int f3190b;
    public final float f3191c;

    static {
        String str = e2.d0.f8537a;
        d = Integer.toString(1, 36);
        f3189e = Integer.toString(2, 36);
    }

    public d1(int i10) {
        e2.d.a("maxStars must be a positive integer", i10 > 0);
        this.f3190b = i10;
        this.f3191c = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f3191c != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f3184a, 2);
        bundle.putInt(d, this.f3190b);
        bundle.putFloat(f3189e, this.f3191c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (this.f3190b != d1Var.f3190b || this.f3191c != d1Var.f3191c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3190b), Float.valueOf(this.f3191c));
    }

    public d1(int i10, float f7) {
        boolean z10 = false;
        e2.d.a("maxStars must be a positive integer", i10 > 0);
        if (f7 >= 0.0f && f7 <= i10) {
            z10 = true;
        }
        e2.d.a("starRating is out of range [0, maxStars]", z10);
        this.f3190b = i10;
        this.f3191c = f7;
    }
}
