package m4;

import android.os.Bundle;
import j$.util.Objects;
import v7.t6;
public final class r1 {
    public static final String d;
    public static final String e;
    public static final String f12910f;
    public final int f12911a;
    public final String f12912b;
    public final Bundle f12913c;

    static {
        String str = e2.l0.f6165a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f12910f = Integer.toString(2, 36);
    }

    public r1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f12911a);
        bundle.putString(e, this.f12912b);
        Bundle bundle2 = this.f12913c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f12910f, bundle2);
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
        if (this.f12911a == r1Var.f12911a && Objects.equals(this.f12912b, r1Var.f12912b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f12911a), this.f12912b);
    }

    public r1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        t6.f(z10);
        this.f12911a = i10;
        this.f12912b = str;
        this.f12913c = bundle;
    }
}
