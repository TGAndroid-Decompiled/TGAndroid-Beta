package e2;

import android.net.Uri;
public final class y {
    public static final String f10657b;
    public final Uri f10658a;

    static {
        String str = h2.m0.f14114a;
        f10657b = Integer.toString(0, 36);
    }

    public y(x0 x0Var) {
        this.f10658a = (Uri) x0Var.f10650a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y) && this.f10658a.equals(((y) obj).f10658a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10658a.hashCode() * 31;
    }
}
