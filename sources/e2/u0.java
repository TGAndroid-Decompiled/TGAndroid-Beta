package e2;

import a8.ja;
import android.os.Bundle;
import j$.util.Objects;
public final class u0 extends d1 {
    public static final String f10458c;
    public final float f10459b;

    static {
        String str = h2.l0.f13471a;
        f10458c = Integer.toString(1, 36);
    }

    public u0() {
        this.f10459b = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f10459b != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10050a, 1);
        bundle.putFloat(f10458c, this.f10459b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        if (this.f10459b != ((u0) obj).f10459b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.f10459b));
    }

    public u0(float f10) {
        ja.e("percent must be in the range of [0, 100]", f10 >= 0.0f && f10 <= 100.0f);
        this.f10459b = f10;
    }
}
