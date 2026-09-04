package b2;

import android.net.Uri;
public final class x {
    public static final String f2409b;
    public final Uri f2410a;

    static {
        String str = e2.d0.f8737a;
        f2409b = Integer.toString(0, 36);
    }

    public x(w0 w0Var) {
        this.f2410a = (Uri) w0Var.f2408a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x) && this.f2410a.equals(((x) obj).f2410a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2410a.hashCode() * 31;
    }
}
