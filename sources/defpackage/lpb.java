package defpackage;

import android.os.Bundle;
import j$.util.Objects;
public final class lpb extends g19 {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = hac.a;
        d = "1";
        e = "2";
    }

    public lpb() {
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
        bundle.putInt(g19.a, 3);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lpb) {
            lpb lpbVar = (lpb) obj;
            if (this.c == lpbVar.c && this.b == lpbVar.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public lpb(boolean z) {
        this.b = true;
        this.c = z;
    }
}
