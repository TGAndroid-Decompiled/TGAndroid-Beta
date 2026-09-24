package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class i1 {
    public static final String d;
    public static final String e;
    public static final String f14812f;
    public final int f14813a;
    public final String f14814b;
    public final Bundle f14815c;

    static {
        String str = e2.d0.f7870a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f14812f = Integer.toString(2, 36);
    }

    public i1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f14813a);
        bundle.putString(e, this.f14814b);
        Bundle bundle2 = this.f14815c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f14812f, bundle2);
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
        if (this.f14813a == i1Var.f14813a && Objects.equals(this.f14814b, i1Var.f14814b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14813a), this.f14814b);
    }

    public i1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        e2.d.b(z10);
        this.f14813a = i10;
        this.f14814b = str;
        this.f14815c = bundle;
    }
}
