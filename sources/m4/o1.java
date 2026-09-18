package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class o1 {
    public static final String d;
    public static final String e;
    public static final String f14642f;
    public final int f14643a;
    public final String f14644b;
    public final Bundle f14645c;

    static {
        String str = e2.d0.f7888a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f14642f = Integer.toString(2, 36);
    }

    public o1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f14643a);
        bundle.putString(e, this.f14644b);
        Bundle bundle2 = this.f14645c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f14642f, bundle2);
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
        if (this.f14643a == o1Var.f14643a && Objects.equals(this.f14644b, o1Var.f14644b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14643a), this.f14644b);
    }

    public o1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        e2.d.b(z10);
        this.f14643a = i10;
        this.f14644b = str;
        this.f14645c = bundle;
    }
}
