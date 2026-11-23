package e2;

import android.net.Uri;
public final class y {
    public static final String f10835b;
    public final Uri f10836a;

    static {
        String str = h2.l0.f13815a;
        f10835b = Integer.toString(0, 36);
    }

    public y(x0 x0Var) {
        this.f10836a = (Uri) x0Var.f10828a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y) && this.f10836a.equals(((y) obj).f10836a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10836a.hashCode() * 31;
    }
}
