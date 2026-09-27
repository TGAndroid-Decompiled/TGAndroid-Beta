package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class i1 {
    public static final String d;
    public static final String e;
    public static final String f14854f;
    public final int f14855a;
    public final String f14856b;
    public final Bundle f14857c;

    static {
        String str = e2.d0.f7872a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f14854f = Integer.toString(2, 36);
    }

    public i1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f14855a);
        bundle.putString(e, this.f14856b);
        Bundle bundle2 = this.f14857c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f14854f, bundle2);
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
        if (this.f14855a == i1Var.f14855a && Objects.equals(this.f14856b, i1Var.f14856b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14855a), this.f14856b);
    }

    public i1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        e2.d.b(z10);
        this.f14855a = i10;
        this.f14856b = str;
        this.f14857c = bundle;
    }
}
