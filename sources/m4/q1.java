package m4;

import android.os.Bundle;
import j$.util.Objects;
import v7.u6;
public final class q1 {
    public static final String d;
    public static final String e;
    public static final String f16679f;
    public final int f16680a;
    public final String f16681b;
    public final Bundle f16682c;

    static {
        String str = e2.m0.f8254a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f16679f = Integer.toString(2, 36);
    }

    public q1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f16680a);
        bundle.putString(e, this.f16681b);
        Bundle bundle2 = this.f16682c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f16679f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        if (this.f16680a == q1Var.f16680a && Objects.equals(this.f16681b, q1Var.f16681b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16680a), this.f16681b);
    }

    public q1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        u6.g(z10);
        this.f16680a = i10;
        this.f16681b = str;
        this.f16682c = bundle;
    }
}
