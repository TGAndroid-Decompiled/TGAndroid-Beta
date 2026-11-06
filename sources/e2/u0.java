package e2;

import a8.ia;
import android.os.Bundle;
import j$.util.Objects;
public final class u0 extends d1 {
    public static final String f10622c;
    public final float f10623b;

    static {
        String str = h2.m0.f14112a;
        f10622c = Integer.toString(1, 36);
    }

    public u0() {
        this.f10623b = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f10623b != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10214a, 1);
        bundle.putFloat(f10622c, this.f10623b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        if (this.f10623b != ((u0) obj).f10623b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.f10623b));
    }

    public u0(float f10) {
        ia.e("percent must be in the range of [0, 100]", f10 >= 0.0f && f10 <= 100.0f);
        this.f10623b = f10;
    }
}
