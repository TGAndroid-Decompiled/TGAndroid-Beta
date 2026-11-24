package defpackage;

import android.os.Bundle;
import j$.util.Objects;
public final class sf5 extends g19 {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = hac.a;
        d = "1";
        e = "2";
    }

    public sf5() {
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
        bundle.putInt(g19.a, 0);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sf5) {
            sf5 sf5Var = (sf5) obj;
            if (this.c == sf5Var.c && this.b == sf5Var.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public sf5(boolean z) {
        this.b = true;
        this.c = z;
    }
}
