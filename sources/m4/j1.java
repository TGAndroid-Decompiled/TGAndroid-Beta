package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class j1 {
    public static final String d;
    public static final String e;
    public static final String f14577f;
    public final int f14578a;
    public final String f14579b;
    public final Bundle f14580c;

    static {
        String str = e2.d0.f7871a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f14577f = Integer.toString(2, 36);
    }

    public j1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f14578a);
        bundle.putString(e, this.f14579b);
        Bundle bundle2 = this.f14580c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f14577f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        if (this.f14578a == j1Var.f14578a && Objects.equals(this.f14579b, j1Var.f14579b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14578a), this.f14579b);
    }

    public j1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        e2.d.b(z10);
        this.f14578a = i10;
        this.f14579b = str;
        this.f14580c = bundle;
    }
}
