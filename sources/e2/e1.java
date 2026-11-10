package e2;

import a8.ia;
import android.os.Bundle;
import j$.util.Objects;
public final class e1 extends d1 {
    public static final String d;
    public static final String f10238e;
    public final int f10239b;
    public final float f10240c;

    static {
        String str = h2.m0.f14114a;
        d = Integer.toString(1, 36);
        f10238e = Integer.toString(2, 36);
    }

    public e1(int i7) {
        ia.e("maxStars must be a positive integer", i7 > 0);
        this.f10239b = i7;
        this.f10240c = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f10240c != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10219a, 2);
        bundle.putInt(d, this.f10239b);
        bundle.putFloat(f10238e, this.f10240c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        if (this.f10239b != e1Var.f10239b || this.f10240c != e1Var.f10240c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f10239b), Float.valueOf(this.f10240c));
    }

    public e1(int i7, float f10) {
        boolean z9 = false;
        ia.e("maxStars must be a positive integer", i7 > 0);
        if (f10 >= 0.0f && f10 <= i7) {
            z9 = true;
        }
        ia.e("starRating is out of range [0, maxStars]", z9);
        this.f10239b = i7;
        this.f10240c = f10;
    }
}
