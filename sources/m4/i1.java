package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class i1 {
    public static final String d;
    public static final String f16181e;
    public static final String f16182f;
    public final int f16183a;
    public final String f16184b;
    public final Bundle f16185c;

    static {
        String str = e2.d0.f8537a;
        d = Integer.toString(0, 36);
        f16181e = Integer.toString(1, 36);
        f16182f = Integer.toString(2, 36);
    }

    public i1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f16183a);
        bundle.putString(f16181e, this.f16184b);
        Bundle bundle2 = this.f16185c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f16182f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (this.f16183a == i1Var.f16183a && Objects.equals(this.f16184b, i1Var.f16184b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16183a), this.f16184b);
    }

    public i1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        e2.d.b(z10);
        this.f16183a = i10;
        this.f16184b = str;
        this.f16185c = bundle;
    }
}
