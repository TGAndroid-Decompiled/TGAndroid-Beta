package d2;

import android.os.Bundle;
import b8.zb;
import j$.util.Objects;
public final class w0 extends f1 {
    public static final String f8502c;
    public final float f8503b;

    static {
        String str = g2.n0.f11873a;
        f8502c = Integer.toString(1, 36);
    }

    public w0() {
        this.f8503b = -1.0f;
    }

    @Override
    public final boolean b() {
        if (this.f8503b != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(f1.f8107a, 1);
        bundle.putFloat(f8502c, this.f8503b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        if (this.f8503b != ((w0) obj).f8503b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.f8503b));
    }

    public w0(float f10) {
        zb.e("percent must be in the range of [0, 100]", f10 >= 0.0f && f10 <= 100.0f);
        this.f8503b = f10;
    }
}
