package b2;

import android.net.Uri;
public final class x {
    public static final String f3337b;
    public final Uri f3338a;

    static {
        String str = e2.d0.f7871a;
        f3337b = Integer.toString(0, 36);
    }

    public x(w0 w0Var) {
        this.f3338a = (Uri) w0Var.f3336a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x) && this.f3338a.equals(((x) obj).f3338a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3338a.hashCode() * 31;
    }
}
