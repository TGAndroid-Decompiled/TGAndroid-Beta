package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class j1 {
    public static final String d;
    public static final String f16123e;
    public static final String f16124f;
    public final int f16125a;
    public final String f16126b;
    public final Bundle f16127c;

    static {
        String str = e2.d0.f8532a;
        d = Integer.toString(0, 36);
        f16123e = Integer.toString(1, 36);
        f16124f = Integer.toString(2, 36);
    }

    public j1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f16125a);
        bundle.putString(f16123e, this.f16126b);
        Bundle bundle2 = this.f16127c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f16124f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        if (this.f16125a == j1Var.f16125a && Objects.equals(this.f16126b, j1Var.f16126b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16125a), this.f16126b);
    }

    public j1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        e2.d.b(z10);
        this.f16125a = i10;
        this.f16126b = str;
        this.f16127c = bundle;
    }
}
