package e2;

import android.net.Uri;
public final class y {
    public static final String f10796b;
    public final Uri f10797a;

    static {
        String str = h2.l0.f13778a;
        f10796b = Integer.toString(0, 36);
    }

    public y(x0 x0Var) {
        this.f10797a = (Uri) x0Var.f10789a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y) && this.f10797a.equals(((y) obj).f10797a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10797a.hashCode() * 31;
    }
}
