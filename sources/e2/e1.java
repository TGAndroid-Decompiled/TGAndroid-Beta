package e2;

import a8.la;
import android.os.Bundle;
import j$.util.Objects;
public final class e1 extends d1 {
    public static final String d;
    public static final String f10413e;
    public final int f10414b;
    public final float f10415c;

    static {
        String str = h2.l0.f13812a;
        d = Integer.toString(1, 36);
        f10413e = Integer.toString(2, 36);
    }

    public e1(int i7) {
        la.e("maxStars must be a positive integer", i7 > 0);
        this.f10414b = i7;
        this.f10415c = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f10415c != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10394a, 2);
        bundle.putInt(d, this.f10414b);
        bundle.putFloat(f10413e, this.f10415c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        if (this.f10414b != e1Var.f10414b || this.f10415c != e1Var.f10415c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f10414b), Float.valueOf(this.f10415c));
    }

    public e1(int i7, float f10) {
        boolean z10 = false;
        la.e("maxStars must be a positive integer", i7 > 0);
        if (f10 >= 0.0f && f10 <= i7) {
            z10 = true;
        }
        la.e("starRating is out of range [0, maxStars]", z10);
        this.f10414b = i7;
        this.f10415c = f10;
    }
}
