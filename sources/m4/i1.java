package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class i1 {
    public static final String d;
    public static final String f16182e;
    public static final String f16183f;
    public final int f16184a;
    public final String f16185b;
    public final Bundle f16186c;

    static {
        String str = e2.d0.f8537a;
        d = Integer.toString(0, 36);
        f16182e = Integer.toString(1, 36);
        f16183f = Integer.toString(2, 36);
    }

    public i1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f16184a);
        bundle.putString(f16182e, this.f16185b);
        Bundle bundle2 = this.f16186c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f16183f, bundle2);
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
        if (this.f16184a == i1Var.f16184a && Objects.equals(this.f16185b, i1Var.f16185b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16184a), this.f16185b);
    }

    public i1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        e2.d.b(z10);
        this.f16184a = i10;
        this.f16185b = str;
        this.f16186c = bundle;
    }
}
