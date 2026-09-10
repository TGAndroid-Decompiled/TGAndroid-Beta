package b2;

import android.net.Uri;
public final class x {
    public static final String f2038b;
    public final Uri f2039a;

    static {
        String str = e2.d0.f7188a;
        f2038b = Integer.toString(0, 36);
    }

    public x(w0 w0Var) {
        this.f2039a = (Uri) w0Var.f2037a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x) && this.f2039a.equals(((x) obj).f2039a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2039a.hashCode() * 31;
    }
}
