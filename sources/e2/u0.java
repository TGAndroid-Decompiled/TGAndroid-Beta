package e2;

import a8.la;
import android.os.Bundle;
import j$.util.Objects;
public final class u0 extends d1 {
    public static final String f10802c;
    public final float f10803b;

    static {
        String str = h2.l0.f13812a;
        f10802c = Integer.toString(1, 36);
    }

    public u0() {
        this.f10803b = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f10803b != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10394a, 1);
        bundle.putFloat(f10802c, this.f10803b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        if (this.f10803b != ((u0) obj).f10803b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.f10803b));
    }

    public u0(float f10) {
        la.e("percent must be in the range of [0, 100]", f10 >= 0.0f && f10 <= 100.0f);
        this.f10803b = f10;
    }
}
