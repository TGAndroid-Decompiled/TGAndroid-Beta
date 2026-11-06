package e2;

import a8.ia;
import android.os.Bundle;
import j$.util.Objects;
public final class e1 extends d1 {
    public static final String d;
    public static final String f10233e;
    public final int f10234b;
    public final float f10235c;

    static {
        String str = h2.m0.f14112a;
        d = Integer.toString(1, 36);
        f10233e = Integer.toString(2, 36);
    }

    public e1(int i7) {
        ia.e("maxStars must be a positive integer", i7 > 0);
        this.f10234b = i7;
        this.f10235c = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f10235c != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10214a, 2);
        bundle.putInt(d, this.f10234b);
        bundle.putFloat(f10233e, this.f10235c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        if (this.f10234b != e1Var.f10234b || this.f10235c != e1Var.f10235c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f10234b), Float.valueOf(this.f10235c));
    }

    public e1(int i7, float f10) {
        boolean z9 = false;
        ia.e("maxStars must be a positive integer", i7 > 0);
        if (f10 >= 0.0f && f10 <= i7) {
            z9 = true;
        }
        ia.e("starRating is out of range [0, maxStars]", z9);
        this.f10234b = i7;
        this.f10235c = f10;
    }
}
