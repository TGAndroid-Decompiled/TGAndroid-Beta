package e2;

import android.net.Uri;
public final class y {
    public static final String f10798b;
    public final Uri f10799a;

    static {
        String str = h2.l0.f13778a;
        f10798b = Integer.toString(0, 36);
    }

    public y(x0 x0Var) {
        this.f10799a = (Uri) x0Var.f10791a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y) && this.f10799a.equals(((y) obj).f10799a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10799a.hashCode() * 31;
    }
}
