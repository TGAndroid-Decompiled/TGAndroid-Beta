package e2;

import android.net.Uri;
public final class y {
    public static final String f10488b;
    public final Uri f10489a;

    static {
        String str = h2.l0.f13471a;
        f10488b = Integer.toString(0, 36);
    }

    public y(x0 x0Var) {
        this.f10489a = (Uri) x0Var.f10481a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y) && this.f10489a.equals(((y) obj).f10489a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10489a.hashCode() * 31;
    }
}
