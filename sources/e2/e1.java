package e2;

import a8.ma;
import android.os.Bundle;
import j$.util.Objects;
public final class e1 extends d1 {
    public static final String d;
    public static final String f10377e;
    public final int f10378b;
    public final float f10379c;

    static {
        String str = h2.l0.f13778a;
        d = Integer.toString(1, 36);
        f10377e = Integer.toString(2, 36);
    }

    public e1(int i7) {
        ma.e("maxStars must be a positive integer", i7 > 0);
        this.f10378b = i7;
        this.f10379c = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f10379c != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10358a, 2);
        bundle.putInt(d, this.f10378b);
        bundle.putFloat(f10377e, this.f10379c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        if (this.f10378b != e1Var.f10378b || this.f10379c != e1Var.f10379c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f10378b), Float.valueOf(this.f10379c));
    }

    public e1(int i7, float f10) {
        boolean z10 = false;
        ma.e("maxStars must be a positive integer", i7 > 0);
        if (f10 >= 0.0f && f10 <= i7) {
            z10 = true;
        }
        ma.e("starRating is out of range [0, maxStars]", z10);
        this.f10378b = i7;
        this.f10379c = f10;
    }
}
