package b2;

import android.net.Uri;
public final class x {
    public static final String f3680b;
    public final Uri f3681a;

    static {
        String str = e2.d0.f8529a;
        f3680b = Integer.toString(0, 36);
    }

    public x(w0 w0Var) {
        this.f3681a = (Uri) w0Var.f3679a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x) && this.f3681a.equals(((x) obj).f3681a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3681a.hashCode() * 31;
    }
}
