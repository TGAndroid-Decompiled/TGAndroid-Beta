package e2;

import android.net.Uri;
public final class y {
    public static final String f10803b;
    public final Uri f10804a;

    static {
        String str = h2.l0.f13783a;
        f10803b = Integer.toString(0, 36);
    }

    public y(x0 x0Var) {
        this.f10804a = (Uri) x0Var.f10796a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y) && this.f10804a.equals(((y) obj).f10804a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10804a.hashCode() * 31;
    }
}
