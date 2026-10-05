package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class i1 {
    public static final String d;
    public static final String f16191e;
    public static final String f16192f;
    public final int f16193a;
    public final String f16194b;
    public final Bundle f16195c;

    static {
        String str = e2.d0.f8538a;
        d = Integer.toString(0, 36);
        f16191e = Integer.toString(1, 36);
        f16192f = Integer.toString(2, 36);
    }

    public i1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f16193a);
        bundle.putString(f16191e, this.f16194b);
        Bundle bundle2 = this.f16195c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f16192f, bundle2);
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
        if (this.f16193a == i1Var.f16193a && Objects.equals(this.f16194b, i1Var.f16194b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16193a), this.f16194b);
    }

    public i1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        e2.d.b(z10);
        this.f16193a = i10;
        this.f16194b = str;
        this.f16195c = bundle;
    }
}
