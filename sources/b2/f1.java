package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class f1 extends c1 {
    public static final String d;
    public static final String e;
    public final boolean f2990b;
    public final boolean f2991c;

    static {
        String str = e2.d0.f7870a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public f1() {
        this.f2990b = false;
        this.f2991c = false;
    }

    @Override
    public final boolean b() {
        return this.f2990b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f2948a, 3);
        bundle.putBoolean(d, this.f2990b);
        bundle.putBoolean(e, this.f2991c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            if (this.f2991c == f1Var.f2991c && this.f2990b == f1Var.f2990b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f2990b), Boolean.valueOf(this.f2991c));
    }

    public f1(boolean z10) {
        this.f2990b = true;
        this.f2991c = z10;
    }
}
