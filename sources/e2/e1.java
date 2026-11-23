package e2;

import a8.ma;
import android.os.Bundle;
import j$.util.Objects;
public final class e1 extends d1 {
    public static final String d;
    public static final String f10379e;
    public final int f10380b;
    public final float f10381c;

    static {
        String str = h2.l0.f13778a;
        d = Integer.toString(1, 36);
        f10379e = Integer.toString(2, 36);
    }

    public e1(int i7) {
        ma.e("maxStars must be a positive integer", i7 > 0);
        this.f10380b = i7;
        this.f10381c = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f10381c != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10360a, 2);
        bundle.putInt(d, this.f10380b);
        bundle.putFloat(f10379e, this.f10381c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        if (this.f10380b != e1Var.f10380b || this.f10381c != e1Var.f10381c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f10380b), Float.valueOf(this.f10381c));
    }

    public e1(int i7, float f10) {
        boolean z10 = false;
        ma.e("maxStars must be a positive integer", i7 > 0);
        if (f10 >= 0.0f && f10 <= i7) {
            z10 = true;
        }
        ma.e("starRating is out of range [0, maxStars]", z10);
        this.f10380b = i7;
        this.f10381c = f10;
    }
}
