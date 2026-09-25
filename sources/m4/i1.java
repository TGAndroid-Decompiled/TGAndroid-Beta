package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class i1 {
    public static final String d;
    public static final String e;
    public static final String f14827f;
    public final int f14828a;
    public final String f14829b;
    public final Bundle f14830c;

    static {
        String str = e2.d0.f7870a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f14827f = Integer.toString(2, 36);
    }

    public i1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f14828a);
        bundle.putString(e, this.f14829b);
        Bundle bundle2 = this.f14830c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f14827f, bundle2);
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
        if (this.f14828a == i1Var.f14828a && Objects.equals(this.f14829b, i1Var.f14829b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14828a), this.f14829b);
    }

    public i1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        e2.d.b(z10);
        this.f14828a = i10;
        this.f14829b = str;
        this.f14830c = bundle;
    }
}
