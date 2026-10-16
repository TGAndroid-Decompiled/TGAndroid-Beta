package b2;

import android.net.Uri;
public final class c0 {
    public static final String f2093b;
    public final Uri f2094a;

    static {
        String str = e2.m0.f8375a;
        f2093b = Integer.toString(0, 36);
    }

    public c0(b1 b1Var) {
        this.f2094a = (Uri) b1Var.f2084a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c0) && this.f2094a.equals(((c0) obj).f2094a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2094a.hashCode() * 31;
    }
}
