package defpackage;

import android.os.Bundle;
import j$.util.Objects;
public final class krb extends s29 {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = gcc.a;
        d = "1";
        e = "2";
    }

    public krb() {
        this.b = false;
        this.c = false;
    }

    @Override
    public final boolean b() {
        return this.b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(s29.a, 3);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof krb) {
            krb krbVar = (krb) obj;
            if (this.c == krbVar.c && this.b == krbVar.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public krb(boolean z) {
        this.b = true;
        this.c = z;
    }
}
