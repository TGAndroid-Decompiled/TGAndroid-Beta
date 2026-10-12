package m4;

import android.os.Bundle;
import j$.util.Objects;
import v7.u6;
public final class r1 {
    public static final String d;
    public static final String e;
    public static final String f15597f;
    public final int f15598a;
    public final String f15599b;
    public final Bundle f15600c;

    static {
        String str = e2.m0.f8372a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f15597f = Integer.toString(2, 36);
    }

    public r1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f15598a);
        bundle.putString(e, this.f15599b);
        Bundle bundle2 = this.f15600c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f15597f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        if (this.f15598a == r1Var.f15598a && Objects.equals(this.f15599b, r1Var.f15599b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f15598a), this.f15599b);
    }

    public r1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        u6.g(z10);
        this.f15598a = i10;
        this.f15599b = str;
        this.f15600c = bundle;
    }
}
