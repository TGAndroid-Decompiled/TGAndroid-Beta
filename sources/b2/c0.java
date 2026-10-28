package b2;

import android.net.Uri;
public final class c0 {
    public static final String f3156b;
    public final Uri f3157a;

    static {
        String str = e2.n0.f9691a;
        f3156b = Integer.toString(0, 36);
    }

    public c0(b1 b1Var) {
        this.f3157a = (Uri) b1Var.f3147a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c0) && this.f3157a.equals(((c0) obj).f3157a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3157a.hashCode() * 31;
    }
}
