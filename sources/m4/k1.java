package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class k1 {
    public static final String d;
    public static final String f15873e;
    public static final String f15874f;
    public final int f15875a;
    public final String f15876b;
    public final Bundle f15877c;

    static {
        String str = e2.d0.f8529a;
        d = Integer.toString(0, 36);
        f15873e = Integer.toString(1, 36);
        f15874f = Integer.toString(2, 36);
    }

    public k1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f15875a);
        bundle.putString(f15873e, this.f15876b);
        Bundle bundle2 = this.f15877c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f15874f, bundle2);
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
        if (this.f15875a == k1Var.f15875a && Objects.equals(this.f15876b, k1Var.f15876b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f15875a), this.f15876b);
    }

    public k1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        e2.d.b(z10);
        this.f15875a = i10;
        this.f15876b = str;
        this.f15877c = bundle;
    }
}
