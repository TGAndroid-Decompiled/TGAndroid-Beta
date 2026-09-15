package b2;

import android.net.Uri;
public final class x {
    public static final String f3340b;
    public final Uri f3341a;

    static {
        String str = e2.d0.f7883a;
        f3340b = Integer.toString(0, 36);
    }

    public x(w0 w0Var) {
        this.f3341a = (Uri) w0Var.f3339a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x) && this.f3341a.equals(((x) obj).f3341a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3341a.hashCode() * 31;
    }
}
