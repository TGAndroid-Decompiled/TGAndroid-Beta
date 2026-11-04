package d2;

import android.os.Bundle;
import j$.util.Objects;
public final class x extends f1 {
    public static final String d;
    public static final String f8505e;
    public final boolean f8506b;
    public final boolean f8507c;

    static {
        String str = g2.n0.f11873a;
        d = Integer.toString(1, 36);
        f8505e = Integer.toString(2, 36);
    }

    public x() {
        this.f8506b = false;
        this.f8507c = false;
    }

    @Override
    public final boolean b() {
        return this.f8506b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(f1.f8107a, 0);
        bundle.putBoolean(d, this.f8506b);
        bundle.putBoolean(f8505e, this.f8507c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f8507c == xVar.f8507c && this.f8506b == xVar.f8506b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f8506b), Boolean.valueOf(this.f8507c));
    }

    public x(boolean z10) {
        this.f8506b = true;
        this.f8507c = z10;
    }
}
