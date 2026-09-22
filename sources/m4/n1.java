package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class n1 {
    public static final String d;
    public static final String e;
    public static final String f14860f;
    public final int f14861a;
    public final String f14862b;
    public final Bundle f14863c;

    static {
        String str = e2.d0.f7887a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f14860f = Integer.toString(2, 36);
    }

    public n1(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f14861a);
        bundle.putString(e, this.f14862b);
        Bundle bundle2 = this.f14863c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f14860f, bundle2);
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
        if (this.f14861a == n1Var.f14861a && Objects.equals(this.f14862b, n1Var.f14862b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14861a), this.f14862b);
    }

    public n1(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        e2.d.b(z10);
        this.f14861a = i10;
        this.f14862b = str;
        this.f14863c = bundle;
    }
}
