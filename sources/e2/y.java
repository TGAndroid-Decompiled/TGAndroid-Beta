package e2;

import android.net.Uri;
public final class y {
    public static final String f10806b;
    public final Uri f10807a;

    static {
        String str = h2.l0.f13786a;
        f10806b = Integer.toString(0, 36);
    }

    public y(x0 x0Var) {
        this.f10807a = (Uri) x0Var.f10799a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y) && this.f10807a.equals(((y) obj).f10807a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10807a.hashCode() * 31;
    }
}
