package b2;

import android.net.Uri;
public final class c0 {
    public static final String f1993b;
    public final Uri f1994a;

    static {
        String str = e2.l0.f6165a;
        f1993b = Integer.toString(0, 36);
    }

    public c0(a1 a1Var) {
        this.f1994a = (Uri) a1Var.f1978a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c0) && this.f1994a.equals(((c0) obj).f1994a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1994a.hashCode() * 31;
    }
}
