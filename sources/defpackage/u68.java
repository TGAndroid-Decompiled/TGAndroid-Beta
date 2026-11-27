package defpackage;

import android.os.Bundle;
import j$.util.Objects;
public final class u68 extends s29 {
    public static final String c;
    public final float b;

    static {
        String str = gcc.a;
        c = "1";
    }

    public u68(float f) {
        boolean z;
        if (f >= 0.0f && f <= 100.0f) {
            z = true;
        } else {
            z = false;
        }
        yve.e("percent must be in the range of [0, 100]", z);
        this.b = f;
    }

    @Override
    public final boolean b() {
        if (this.b != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(s29.a, 1);
        bundle.putFloat(c, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u68)) {
            return false;
        }
        if (this.b != ((u68) obj).b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.b));
    }

    public u68() {
        this.b = -1.0f;
    }
}
