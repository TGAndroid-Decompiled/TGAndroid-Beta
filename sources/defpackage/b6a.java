package defpackage;

import android.os.Bundle;
import j$.util.Objects;
public final class b6a {
    public static final String d;
    public static final String e;
    public static final String f;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        String str = g8c.a;
        d = "0";
        e = "1";
        f = "2";
    }

    public b6a(String str, int i, Bundle bundle) {
        boolean z = true;
        if (i >= 0 && i != 1) {
            z = false;
        }
        gre.f(z);
        this.a = i;
        this.b = str;
        this.c = bundle;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.a);
        bundle.putString(e, this.b);
        Bundle bundle2 = this.c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6a)) {
            return false;
        }
        b6a b6aVar = (b6a) obj;
        if (this.a == b6aVar.a && Objects.equals(this.b, b6aVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public b6a(int i) {
        this("no error message provided", i, Bundle.EMPTY);
    }
}
