package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class t0 extends c1 {
    public static final String f3319c;
    public final float f3320b;

    static {
        String str = e2.d0.f7883a;
        f3319c = Integer.toString(1, 36);
    }

    public t0() {
        this.f3320b = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f3320b != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f2951a, 1);
        bundle.putFloat(f3319c, this.f3320b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t0)) {
            return false;
        }
        if (this.f3320b != ((t0) obj).f3320b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.f3320b));
    }

    public t0(float f7) {
        e2.d.a("percent must be in the range of [0, 100]", f7 >= 0.0f && f7 <= 100.0f);
        this.f3320b = f7;
    }
}
