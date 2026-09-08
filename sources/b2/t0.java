package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class t0 extends c1 {
    public static final String f2412c;
    public final float f2413b;

    static {
        String str = e2.d0.f8765a;
        f2412c = Integer.toString(1, 36);
    }

    public t0() {
        this.f2413b = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f2413b != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f2017a, 1);
        bundle.putFloat(f2412c, this.f2413b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t0)) {
            return false;
        }
        if (this.f2413b != ((t0) obj).f2413b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.f2413b));
    }

    public t0(float f7) {
        e2.d.a("percent must be in the range of [0, 100]", f7 >= 0.0f && f7 <= 100.0f);
        this.f2413b = f7;
    }
}
