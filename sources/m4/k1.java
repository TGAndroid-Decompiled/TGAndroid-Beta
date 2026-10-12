package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class k1 {
    public static final String d;
    public static final String f15874e;
    public static final String f15875f;
    public final int f15876a;
    public final String f15877b;
    public final Bundle f15878c;

    static {
        String str = e2.d0.f8529a;
        d = Integer.toString(0, 36);
        f15874e = Integer.toString(1, 36);
        f15875f = Integer.toString(2, 36);
    }

    public k1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f15876a);
        bundle.putString(f15874e, this.f15877b);
        Bundle bundle2 = this.f15878c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f15875f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        if (this.f15876a == k1Var.f15876a && Objects.equals(this.f15877b, k1Var.f15877b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f15876a), this.f15877b);
    }

    public k1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        e2.d.b(z10);
        this.f15876a = i10;
        this.f15877b = str;
        this.f15878c = bundle;
    }
}
