package b2;

import android.os.Bundle;
import j$.util.Objects;
import v7.t6;
public final class x0 extends g1 {
    public static final String f2430c;
    public final float f2431b;

    static {
        String str = e2.l0.f6165a;
        f2430c = Integer.toString(1, 36);
    }

    public x0() {
        this.f2431b = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f2431b != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.f2046a, 1);
        bundle.putFloat(f2430c, this.f2431b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        if (this.f2431b != ((x0) obj).f2431b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.f2431b));
    }

    public x0(float f7) {
        t6.e("percent must be in the range of [0, 100]", f7 >= 0.0f && f7 <= 100.0f);
        this.f2431b = f7;
    }
}
