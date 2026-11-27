package defpackage;

import android.os.Bundle;
import j$.util.Objects;
public final class fva extends s29 {
    public static final String d;
    public static final String e;
    public final int b;
    public final float c;

    static {
        String str = gcc.a;
        d = "1";
        e = "2";
    }

    public fva(int i, float f) {
        boolean z;
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        yve.e("maxStars must be a positive integer", z);
        if (f >= 0.0f && f <= i) {
            z2 = true;
        }
        yve.e("starRating is out of range [0, maxStars]", z2);
        this.b = i;
        this.c = f;
    }

    @Override
    public final boolean b() {
        if (this.c != -1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(s29.a, 2);
        bundle.putInt(d, this.b);
        bundle.putFloat(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fva)) {
            return false;
        }
        fva fvaVar = (fva) obj;
        if (this.b != fvaVar.b || this.c != fvaVar.c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public fva(int i) {
        yve.e("maxStars must be a positive integer", i > 0);
        this.b = i;
        this.c = -1.0f;
    }
}
