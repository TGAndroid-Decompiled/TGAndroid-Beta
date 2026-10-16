package m4;

import android.os.Bundle;
import j$.util.Objects;
import v7.u6;
public final class q1 {
    public static final String d;
    public static final String e;
    public static final String f15327f;
    public final int f15328a;
    public final String f15329b;
    public final Bundle f15330c;

    static {
        String str = e2.m0.f8375a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f15327f = Integer.toString(2, 36);
    }

    public q1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f15328a);
        bundle.putString(e, this.f15329b);
        Bundle bundle2 = this.f15330c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f15327f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        if (this.f15328a == q1Var.f15328a && Objects.equals(this.f15329b, q1Var.f15329b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f15328a), this.f15329b);
    }

    public q1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        u6.g(z10);
        this.f15328a = i10;
        this.f15329b = str;
        this.f15330c = bundle;
    }
}
