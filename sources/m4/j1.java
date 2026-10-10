package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class j1 {
    public static final String d;
    public static final String f16127e;
    public static final String f16128f;
    public final int f16129a;
    public final String f16130b;
    public final Bundle f16131c;

    static {
        String str = e2.d0.f8532a;
        d = Integer.toString(0, 36);
        f16127e = Integer.toString(1, 36);
        f16128f = Integer.toString(2, 36);
    }

    public j1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f16129a);
        bundle.putString(f16127e, this.f16130b);
        Bundle bundle2 = this.f16131c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f16128f, bundle2);
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
        if (this.f16129a == j1Var.f16129a && Objects.equals(this.f16130b, j1Var.f16130b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16129a), this.f16130b);
    }

    public j1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        e2.d.b(z10);
        this.f16129a = i10;
        this.f16130b = str;
        this.f16131c = bundle;
    }
}
