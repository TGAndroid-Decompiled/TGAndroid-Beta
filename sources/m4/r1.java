package m4;

import android.os.Bundle;
import j$.util.Objects;
import v7.t6;
public final class r1 {
    public static final String d;
    public static final String e;
    public static final String f12911f;
    public final int f12912a;
    public final String f12913b;
    public final Bundle f12914c;

    static {
        String str = e2.l0.f6165a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f12911f = Integer.toString(2, 36);
    }

    public r1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f12912a);
        bundle.putString(e, this.f12913b);
        Bundle bundle2 = this.f12914c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f12911f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        if (this.f12912a == r1Var.f12912a && Objects.equals(this.f12913b, r1Var.f12913b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f12912a), this.f12913b);
    }

    public r1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        t6.f(z10);
        this.f12912a = i10;
        this.f12913b = str;
        this.f12914c = bundle;
    }
}
