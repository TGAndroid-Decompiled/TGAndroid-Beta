package m4;

import android.os.Bundle;
import j$.util.Objects;
import v7.u6;
public final class q1 {
    public static final String d;
    public static final String e;
    public static final String f16684f;
    public final int f16685a;
    public final String f16686b;
    public final Bundle f16687c;

    static {
        String str = e2.m0.f8253a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f16684f = Integer.toString(2, 36);
    }

    public q1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f16685a);
        bundle.putString(e, this.f16686b);
        Bundle bundle2 = this.f16687c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f16684f, bundle2);
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
        if (this.f16685a == q1Var.f16685a && Objects.equals(this.f16686b, q1Var.f16686b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16685a), this.f16686b);
    }

    public q1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        u6.g(z10);
        this.f16685a = i10;
        this.f16686b = str;
        this.f16687c = bundle;
    }
}
