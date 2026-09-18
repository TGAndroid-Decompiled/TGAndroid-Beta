package b2;

import android.net.Uri;
public final class x {
    public static final String f3345b;
    public final Uri f3346a;

    static {
        String str = e2.d0.f7887a;
        f3345b = Integer.toString(0, 36);
    }

    public x(w0 w0Var) {
        this.f3346a = (Uri) w0Var.f3344a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x) && this.f3346a.equals(((x) obj).f3346a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3346a.hashCode() * 31;
    }
}
