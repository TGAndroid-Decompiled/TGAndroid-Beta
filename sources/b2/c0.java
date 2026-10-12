package b2;

import android.net.Uri;
public final class c0 {
    public static final String f2089b;
    public final Uri f2090a;

    static {
        String str = e2.m0.f8372a;
        f2089b = Integer.toString(0, 36);
    }

    public c0(b1 b1Var) {
        this.f2090a = (Uri) b1Var.f2080a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c0) && this.f2090a.equals(((c0) obj).f2090a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2090a.hashCode() * 31;
    }
}
