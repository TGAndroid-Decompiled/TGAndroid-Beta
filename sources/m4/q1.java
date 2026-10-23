package m4;

import android.os.Bundle;
import j$.util.Objects;
import v7.u6;
public final class q1 {
    public static final String d;
    public static final String e;
    public static final String f16748f;
    public final int f16749a;
    public final String f16750b;
    public final Bundle f16751c;

    static {
        String str = e2.m0.f8259a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f16748f = Integer.toString(2, 36);
    }

    public q1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f16749a);
        bundle.putString(e, this.f16750b);
        Bundle bundle2 = this.f16751c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f16748f, bundle2);
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
        if (this.f16749a == q1Var.f16749a && Objects.equals(this.f16750b, q1Var.f16750b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16749a), this.f16750b);
    }

    public q1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        u6.g(z10);
        this.f16749a = i10;
        this.f16750b = str;
        this.f16751c = bundle;
    }
}
