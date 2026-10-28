package b2;

import a8.yb;
import android.os.Bundle;
import j$.util.Objects;
public final class y0 extends h1 {
    public static final String f3598c;
    public final float f3599b;

    static {
        String str = e2.n0.f9691a;
        f3598c = Integer.toString(1, 36);
    }

    public y0() {
        this.f3599b = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f3599b != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(h1.f3226a, 1);
        bundle.putFloat(f3598c, this.f3599b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        if (this.f3599b != ((y0) obj).f3599b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.f3599b));
    }

    public y0(float f7) {
        yb.f("percent must be in the range of [0, 100]", f7 >= 0.0f && f7 <= 100.0f);
        this.f3599b = f7;
    }
}
