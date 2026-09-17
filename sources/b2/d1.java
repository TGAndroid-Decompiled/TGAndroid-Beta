package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class d1 extends c1 {
    public static final String d;
    public static final String f2022e;
    public final int f2023b;
    public final float f2024c;

    static {
        String str = e2.d0.f8765a;
        d = Integer.toString(1, 36);
        f2022e = Integer.toString(2, 36);
    }

    public d1(int i10) {
        e2.d.a("maxStars must be a positive integer", i10 > 0);
        this.f2023b = i10;
        this.f2024c = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f2024c != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f2017a, 2);
        bundle.putInt(d, this.f2023b);
        bundle.putFloat(f2022e, this.f2024c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (this.f2023b != d1Var.f2023b || this.f2024c != d1Var.f2024c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2023b), Float.valueOf(this.f2024c));
    }

    public d1(int i10, float f7) {
        boolean z10 = false;
        e2.d.a("maxStars must be a positive integer", i10 > 0);
        if (f7 >= 0.0f && f7 <= i10) {
            z10 = true;
        }
        e2.d.a("starRating is out of range [0, maxStars]", z10);
        this.f2023b = i10;
        this.f2024c = f7;
    }
}
