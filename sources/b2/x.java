package b2;

import android.net.Uri;
public final class x {
    public static final String f3682b;
    public final Uri f3683a;

    static {
        String str = e2.d0.f8532a;
        f3682b = Integer.toString(0, 36);
    }

    public x(w0 w0Var) {
        this.f3683a = (Uri) w0Var.f3681a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x) && this.f3683a.equals(((x) obj).f3683a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3683a.hashCode() * 31;
    }
}
