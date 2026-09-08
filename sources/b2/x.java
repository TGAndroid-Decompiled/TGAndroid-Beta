package b2;

import android.net.Uri;
public final class x {
    public static final String f2436b;
    public final Uri f2437a;

    static {
        String str = e2.d0.f8765a;
        f2436b = Integer.toString(0, 36);
    }

    public x(w0 w0Var) {
        this.f2437a = (Uri) w0Var.f2435a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x) && this.f2437a.equals(((x) obj).f2437a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2437a.hashCode() * 31;
    }
}
