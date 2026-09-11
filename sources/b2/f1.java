package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class f1 extends c1 {
    public static final String d;
    public static final String f2038e;
    public final boolean f2039b;
    public final boolean f2040c;

    static {
        String str = e2.d0.f8737a;
        d = Integer.toString(1, 36);
        f2038e = Integer.toString(2, 36);
    }

    public f1() {
        this.f2039b = false;
        this.f2040c = false;
    }

    @Override
    public final boolean b() {
        return this.f2039b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f1990a, 3);
        bundle.putBoolean(d, this.f2039b);
        bundle.putBoolean(f2038e, this.f2040c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            if (this.f2040c == f1Var.f2040c && this.f2039b == f1Var.f2039b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f2039b), Boolean.valueOf(this.f2040c));
    }

    public f1(boolean z10) {
        this.f2039b = true;
        this.f2040c = z10;
    }
}
