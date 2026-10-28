package m4;

import a8.yb;
import android.os.Bundle;
import j$.util.Objects;
public final class r1 {
    public static final String d;
    public static final String e;
    public static final String f18212f;
    public final int f18213a;
    public final String f18214b;
    public final Bundle f18215c;

    static {
        String str = e2.n0.f9691a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f18212f = Integer.toString(2, 36);
    }

    public r1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f18213a);
        bundle.putString(e, this.f18214b);
        Bundle bundle2 = this.f18215c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f18212f, bundle2);
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
        if (this.f18213a == r1Var.f18213a && Objects.equals(this.f18214b, r1Var.f18214b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f18213a), this.f18214b);
    }

    public r1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        yb.g(z10);
        this.f18213a = i10;
        this.f18214b = str;
        this.f18215c = bundle;
    }
}
