package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class n1 {
    public static final String d;
    public static final String e;
    public static final String f14809f;
    public final int f14810a;
    public final String f14811b;
    public final Bundle f14812c;

    static {
        String str = e2.d0.f7887a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f14809f = Integer.toString(2, 36);
    }

    public n1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f14810a);
        bundle.putString(e, this.f14811b);
        Bundle bundle2 = this.f14812c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f14809f, bundle2);
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
        if (this.f14810a == n1Var.f14810a && Objects.equals(this.f14811b, n1Var.f14811b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14810a), this.f14811b);
    }

    public n1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        e2.d.b(z10);
        this.f14810a = i10;
        this.f14811b = str;
        this.f14812c = bundle;
    }
}
