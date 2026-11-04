package o4;

import android.os.Bundle;
import b8.zb;
import j$.util.Objects;
public final class p1 {
    public static final String d;
    public static final String f20795e;
    public static final String f20796f;
    public final int f20797a;
    public final String f20798b;
    public final Bundle f20799c;

    static {
        String str = g2.n0.f11873a;
        d = Integer.toString(0, 36);
        f20795e = Integer.toString(1, 36);
        f20796f = Integer.toString(2, 36);
    }

    public p1(int i3) {
        this("no error message provided", i3, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f20797a);
        bundle.putString(f20795e, this.f20798b);
        Bundle bundle2 = this.f20799c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f20796f, bundle2);
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
        if (this.f20797a == p1Var.f20797a && Objects.equals(this.f20798b, p1Var.f20798b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f20797a), this.f20798b);
    }

    public p1(String str, int i3, Bundle bundle) {
        boolean z10 = true;
        if (i3 >= 0 && i3 != 1) {
            z10 = false;
        }
        zb.f(z10);
        this.f20797a = i3;
        this.f20798b = str;
        this.f20799c = bundle;
    }
}
