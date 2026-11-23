package e2;

import a8.ma;
import android.os.Bundle;
import j$.util.Objects;
public final class u0 extends d1 {
    public static final String f10768c;
    public final float f10769b;

    static {
        String str = h2.l0.f13778a;
        f10768c = Integer.toString(1, 36);
    }

    public u0() {
        this.f10769b = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f10769b != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10360a, 1);
        bundle.putFloat(f10768c, this.f10769b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        if (this.f10769b != ((u0) obj).f10769b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.f10769b));
    }

    public u0(float f10) {
        ma.e("percent must be in the range of [0, 100]", f10 >= 0.0f && f10 <= 100.0f);
        this.f10769b = f10;
    }
}
