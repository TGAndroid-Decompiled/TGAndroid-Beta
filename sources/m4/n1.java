package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class n1 {
    public static final String d;
    public static final String e;
    public static final String f14845f;
    public final int f14846a;
    public final String f14847b;
    public final Bundle f14848c;

    static {
        String str = e2.d0.f7888a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f14845f = Integer.toString(2, 36);
    }

    public n1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f14846a);
        bundle.putString(e, this.f14847b);
        Bundle bundle2 = this.f14848c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f14845f, bundle2);
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
        if (this.f14846a == n1Var.f14846a && Objects.equals(this.f14847b, n1Var.f14847b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14846a), this.f14847b);
    }

    public n1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        e2.d.b(z10);
        this.f14846a = i10;
        this.f14847b = str;
        this.f14848c = bundle;
    }
}
