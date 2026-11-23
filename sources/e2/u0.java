package e2;

import a8.la;
import android.os.Bundle;
import j$.util.Objects;
public final class u0 extends d1 {
    public static final String f10805c;
    public final float f10806b;

    static {
        String str = h2.l0.f13815a;
        f10805c = Integer.toString(1, 36);
    }

    public u0() {
        this.f10806b = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f10806b != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10397a, 1);
        bundle.putFloat(f10805c, this.f10806b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        if (this.f10806b != ((u0) obj).f10806b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.f10806b));
    }

    public u0(float f10) {
        la.e("percent must be in the range of [0, 100]", f10 >= 0.0f && f10 <= 100.0f);
        this.f10806b = f10;
    }
}
