package b2;

import android.os.Bundle;
import j$.util.Objects;
import v7.u6;
public final class y0 extends h1 {
    public static final String f2535c;
    public final float f2536b;

    static {
        String str = e2.m0.f8375a;
        f2535c = Integer.toString(1, 36);
    }

    public y0() {
        this.f2536b = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f2536b != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(h1.f2163a, 1);
        bundle.putFloat(f2535c, this.f2536b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        if (this.f2536b != ((y0) obj).f2536b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.f2536b));
    }

    public y0(float f7) {
        u6.f("percent must be in the range of [0, 100]", f7 >= 0.0f && f7 <= 100.0f);
        this.f2536b = f7;
    }
}
