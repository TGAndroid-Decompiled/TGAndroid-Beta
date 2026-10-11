package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class k1 {
    public static final String d;
    public static final String f16185e;
    public static final String f16186f;
    public final int f16187a;
    public final String f16188b;
    public final Bundle f16189c;

    static {
        String str = e2.d0.f8531a;
        d = Integer.toString(0, 36);
        f16185e = Integer.toString(1, 36);
        f16186f = Integer.toString(2, 36);
    }

    public k1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f16187a);
        bundle.putString(f16185e, this.f16188b);
        Bundle bundle2 = this.f16189c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f16186f, bundle2);
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
        if (this.f16187a == k1Var.f16187a && Objects.equals(this.f16188b, k1Var.f16188b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16187a), this.f16188b);
    }

    public k1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        e2.d.b(z10);
        this.f16187a = i10;
        this.f16188b = str;
        this.f16189c = bundle;
    }
}
