package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class i1 {
    public static final String d;
    public static final String f16186e;
    public static final String f16187f;
    public final int f16188a;
    public final String f16189b;
    public final Bundle f16190c;

    static {
        String str = e2.d0.f8538a;
        d = Integer.toString(0, 36);
        f16186e = Integer.toString(1, 36);
        f16187f = Integer.toString(2, 36);
    }

    public i1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f16188a);
        bundle.putString(f16186e, this.f16189b);
        Bundle bundle2 = this.f16190c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f16187f, bundle2);
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
        if (this.f16188a == i1Var.f16188a && Objects.equals(this.f16189b, i1Var.f16189b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16188a), this.f16189b);
    }

    public i1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        e2.d.b(z10);
        this.f16188a = i10;
        this.f16189b = str;
        this.f16190c = bundle;
    }
}
