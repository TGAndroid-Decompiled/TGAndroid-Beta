package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class t0 extends c1 {
    public static final String f3324c;
    public final float f3325b;

    static {
        String str = e2.d0.f7887a;
        f3324c = Integer.toString(1, 36);
    }

    public t0() {
        this.f3325b = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f3325b != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f2956a, 1);
        bundle.putFloat(f3324c, this.f3325b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t0)) {
            return false;
        }
        if (this.f3325b != ((t0) obj).f3325b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.f3325b));
    }

    public t0(float f7) {
        e2.d.a("percent must be in the range of [0, 100]", f7 >= 0.0f && f7 <= 100.0f);
        this.f3325b = f7;
    }
}
