package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class f1 extends c1 {
    public static final String d;
    public static final String e;
    public final boolean f2998b;
    public final boolean f2999c;

    static {
        String str = e2.d0.f7888a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public f1() {
        this.f2998b = false;
        this.f2999c = false;
    }

    @Override
    public final boolean b() {
        return this.f2998b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f2956a, 3);
        bundle.putBoolean(d, this.f2998b);
        bundle.putBoolean(e, this.f2999c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            if (this.f2999c == f1Var.f2999c && this.f2998b == f1Var.f2998b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f2998b), Boolean.valueOf(this.f2999c));
    }

    public f1(boolean z10) {
        this.f2998b = true;
        this.f2999c = z10;
    }
}
