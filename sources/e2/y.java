package e2;

import android.net.Uri;
public final class y {
    public static final String f10832b;
    public final Uri f10833a;

    static {
        String str = h2.l0.f13812a;
        f10832b = Integer.toString(0, 36);
    }

    public y(x0 x0Var) {
        this.f10833a = (Uri) x0Var.f10825a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y) && this.f10833a.equals(((y) obj).f10833a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10833a.hashCode() * 31;
    }
}
