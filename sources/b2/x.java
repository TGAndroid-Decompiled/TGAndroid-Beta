package b2;

import android.net.Uri;
public final class x {
    public static final String f3342b;
    public final Uri f3343a;

    static {
        String str = e2.d0.f7885a;
        f3342b = Integer.toString(0, 36);
    }

    public x(w0 w0Var) {
        this.f3343a = (Uri) w0Var.f3341a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x) && this.f3343a.equals(((x) obj).f3343a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3343a.hashCode() * 31;
    }
}
