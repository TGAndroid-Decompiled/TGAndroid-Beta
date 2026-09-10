package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class p1 {
    public static final String d;
    public static final String e;
    public static final String f13473f;
    public final int f13474a;
    public final String f13475b;
    public final Bundle f13476c;

    static {
        String str = e2.d0.f7188a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f13473f = Integer.toString(2, 36);
    }

    public p1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f13474a);
        bundle.putString(e, this.f13475b);
        Bundle bundle2 = this.f13476c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f13473f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        if (this.f13474a == p1Var.f13474a && Objects.equals(this.f13475b, p1Var.f13475b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f13474a), this.f13475b);
    }

    public p1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        e2.d.b(z10);
        this.f13474a = i10;
        this.f13475b = str;
        this.f13476c = bundle;
    }
}
