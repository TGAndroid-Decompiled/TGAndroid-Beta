package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class d1 extends c1 {
    public static final String d;
    public static final String f1995e;
    public final int f1996b;
    public final float f1997c;

    static {
        String str = e2.d0.f8737a;
        d = Integer.toString(1, 36);
        f1995e = Integer.toString(2, 36);
    }

    public d1(int i10) {
        e2.d.a("maxStars must be a positive integer", i10 > 0);
        this.f1996b = i10;
        this.f1997c = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f1997c != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f1990a, 2);
        bundle.putInt(d, this.f1996b);
        bundle.putFloat(f1995e, this.f1997c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (this.f1996b != d1Var.f1996b || this.f1997c != d1Var.f1997c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1996b), Float.valueOf(this.f1997c));
    }

    public d1(int i10, float f7) {
        boolean z10 = false;
        e2.d.a("maxStars must be a positive integer", i10 > 0);
        if (f7 >= 0.0f && f7 <= i10) {
            z10 = true;
        }
        e2.d.a("starRating is out of range [0, maxStars]", z10);
        this.f1996b = i10;
        this.f1997c = f7;
    }
}
