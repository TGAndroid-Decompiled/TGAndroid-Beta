package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class n1 {
    public static final String d;
    public static final String f16011e;
    public static final String f16012f;
    public final int f16013a;
    public final String f16014b;
    public final Bundle f16015c;

    static {
        String str = e2.d0.f8737a;
        d = Integer.toString(0, 36);
        f16011e = Integer.toString(1, 36);
        f16012f = Integer.toString(2, 36);
    }

    public n1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f16013a);
        bundle.putString(f16011e, this.f16014b);
        Bundle bundle2 = this.f16015c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f16012f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        if (this.f16013a == n1Var.f16013a && Objects.equals(this.f16014b, n1Var.f16014b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16013a), this.f16014b);
    }

    public n1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        e2.d.b(z10);
        this.f16013a = i10;
        this.f16014b = str;
        this.f16015c = bundle;
    }
}
