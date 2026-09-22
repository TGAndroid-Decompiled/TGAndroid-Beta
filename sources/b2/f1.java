package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class f1 extends c1 {
    public static final String d;
    public static final String e;
    public final boolean f2997b;
    public final boolean f2998c;

    static {
        String str = e2.d0.f7887a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public f1() {
        this.f2997b = false;
        this.f2998c = false;
    }

    @Override
    public final boolean b() {
        return this.f2997b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f2955a, 3);
        bundle.putBoolean(d, this.f2997b);
        bundle.putBoolean(e, this.f2998c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            if (this.f2998c == f1Var.f2998c && this.f2997b == f1Var.f2997b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f2997b), Boolean.valueOf(this.f2998c));
    }

    public f1(boolean z10) {
        this.f2997b = true;
        this.f2998c = z10;
    }
}
