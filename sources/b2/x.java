package b2;

import android.net.Uri;
public final class x {
    public static final String f3344b;
    public final Uri f3345a;

    static {
        String str = e2.d0.f7887a;
        f3344b = Integer.toString(0, 36);
    }

    public x(w0 w0Var) {
        this.f3345a = (Uri) w0Var.f3343a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x) && this.f3345a.equals(((x) obj).f3345a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3345a.hashCode() * 31;
    }
}
