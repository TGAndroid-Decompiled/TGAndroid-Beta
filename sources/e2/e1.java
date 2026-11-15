package e2;

import a8.ja;
import android.os.Bundle;
import j$.util.Objects;
public final class e1 extends d1 {
    public static final String d;
    public static final String f10069e;
    public final int f10070b;
    public final float f10071c;

    static {
        String str = h2.l0.f13471a;
        d = Integer.toString(1, 36);
        f10069e = Integer.toString(2, 36);
    }

    public e1(int i7) {
        ja.e("maxStars must be a positive integer", i7 > 0);
        this.f10070b = i7;
        this.f10071c = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f10071c != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10050a, 2);
        bundle.putInt(d, this.f10070b);
        bundle.putFloat(f10069e, this.f10071c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        if (this.f10070b != e1Var.f10070b || this.f10071c != e1Var.f10071c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f10070b), Float.valueOf(this.f10071c));
    }

    public e1(int i7, float f10) {
        boolean z10 = false;
        ja.e("maxStars must be a positive integer", i7 > 0);
        if (f10 >= 0.0f && f10 <= i7) {
            z10 = true;
        }
        ja.e("starRating is out of range [0, maxStars]", z10);
        this.f10070b = i7;
        this.f10071c = f10;
    }
}
