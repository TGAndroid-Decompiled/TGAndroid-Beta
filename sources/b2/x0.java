package b2;

import android.os.Bundle;
import j$.util.Objects;
import v7.u6;
public final class x0 extends g1 {
    public static final String f4144c;
    public final float f4145b;

    static {
        String str = e2.m0.f8255a;
        f4144c = Integer.toString(1, 36);
    }

    public x0() {
        this.f4145b = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f4145b != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.f3772a, 1);
        bundle.putFloat(f4144c, this.f4145b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        if (this.f4145b != ((x0) obj).f4145b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.f4145b));
    }

    public x0(float f7) {
        u6.f("percent must be in the range of [0, 100]", f7 >= 0.0f && f7 <= 100.0f);
        this.f4145b = f7;
    }
}
