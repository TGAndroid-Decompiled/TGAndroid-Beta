package e2;

import android.net.Uri;
public final class y {
    public static final String f10652b;
    public final Uri f10653a;

    static {
        String str = h2.m0.f14112a;
        f10652b = Integer.toString(0, 36);
    }

    public y(x0 x0Var) {
        this.f10653a = (Uri) x0Var.f10645a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y) && this.f10653a.equals(((y) obj).f10653a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10653a.hashCode() * 31;
    }
}
