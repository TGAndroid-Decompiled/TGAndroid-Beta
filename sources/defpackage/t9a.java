package defpackage;

import android.os.Bundle;
import j$.util.Objects;
public final class t9a {
    public static final String d;
    public static final String e;
    public static final String f;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        String str = gcc.a;
        d = "0";
        e = "1";
        f = "2";
    }

    public t9a(String str, int i, Bundle bundle) {
        boolean z = true;
        if (i >= 0 && i != 1) {
            z = false;
        }
        yve.f(z);
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
        if (!(obj instanceof t9a)) {
            return false;
        }
        t9a t9aVar = (t9a) obj;
        if (this.a == t9aVar.a && Objects.equals(this.b, t9aVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public t9a(int i) {
        this("no error message provided", i, Bundle.EMPTY);
    }
}
