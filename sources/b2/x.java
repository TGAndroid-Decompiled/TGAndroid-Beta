package b2;

import android.net.Uri;
public final class x {
    public static final String f3339b;
    public final Uri f3340a;

    static {
        String str = e2.d0.f7872a;
        f3339b = Integer.toString(0, 36);
    }

    public x(w0 w0Var) {
        this.f3340a = (Uri) w0Var.f3338a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x) && this.f3340a.equals(((x) obj).f3340a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3340a.hashCode() * 31;
    }
}
