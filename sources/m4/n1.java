package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class n1 {
    public static final String d;
    public static final String f16038e;
    public static final String f16039f;
    public final int f16040a;
    public final String f16041b;
    public final Bundle f16042c;

    static {
        String str = e2.d0.f8765a;
        d = Integer.toString(0, 36);
        f16038e = Integer.toString(1, 36);
        f16039f = Integer.toString(2, 36);
    }

    public n1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f16040a);
        bundle.putString(f16038e, this.f16041b);
        Bundle bundle2 = this.f16042c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f16039f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        if (this.f16040a == n1Var.f16040a && Objects.equals(this.f16041b, n1Var.f16041b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16040a), this.f16041b);
    }

    public n1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        e2.d.b(z10);
        this.f16040a = i10;
        this.f16041b = str;
        this.f16042c = bundle;
    }
}
