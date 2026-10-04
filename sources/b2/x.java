package b2;

import android.net.Uri;
public final class x {
    public static final String f3603b;
    public final Uri f3604a;

    static {
        String str = e2.d0.f8537a;
        f3603b = Integer.toString(0, 36);
    }

    public x(w0 w0Var) {
        this.f3604a = (Uri) w0Var.f3602a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x) && this.f3604a.equals(((x) obj).f3604a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3604a.hashCode() * 31;
    }
}
