package d2;

import android.net.Uri;
public final class a0 {
    public static final String f8022b;
    public final Uri f8023a;

    static {
        String str = g2.n0.f11873a;
        f8022b = Integer.toString(0, 36);
    }

    public a0(z0 z0Var) {
        this.f8023a = (Uri) z0Var.f8525a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a0) && this.f8023a.equals(((a0) obj).f8023a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8023a.hashCode() * 31;
    }
}
