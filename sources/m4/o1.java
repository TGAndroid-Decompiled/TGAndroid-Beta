package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class o1 {
    public static final String d;
    public static final String e;
    public static final String f14630f;
    public final int f14631a;
    public final String f14632b;
    public final Bundle f14633c;

    static {
        String str = e2.d0.f7885a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f14630f = Integer.toString(2, 36);
    }

    public o1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f14631a);
        bundle.putString(e, this.f14632b);
        Bundle bundle2 = this.f14633c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f14630f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        if (this.f14631a == o1Var.f14631a && Objects.equals(this.f14632b, o1Var.f14632b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14631a), this.f14632b);
    }

    public o1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        e2.d.b(z10);
        this.f14631a = i10;
        this.f14632b = str;
        this.f14633c = bundle;
    }
}
