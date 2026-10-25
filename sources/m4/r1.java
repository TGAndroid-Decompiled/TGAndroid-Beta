package m4;

import a8.yb;
import android.os.Bundle;
import j$.util.Objects;
public final class r1 {
    public static final String d;
    public static final String e;
    public static final String f18213f;
    public final int f18214a;
    public final String f18215b;
    public final Bundle f18216c;

    static {
        String str = e2.n0.f9692a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f18213f = Integer.toString(2, 36);
    }

    public r1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f18214a);
        bundle.putString(e, this.f18215b);
        Bundle bundle2 = this.f18216c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f18213f, bundle2);
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
        if (this.f18214a == r1Var.f18214a && Objects.equals(this.f18215b, r1Var.f18215b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f18214a), this.f18215b);
    }

    public r1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        yb.g(z10);
        this.f18214a = i10;
        this.f18215b = str;
        this.f18216c = bundle;
    }
}
