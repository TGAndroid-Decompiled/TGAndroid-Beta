package b2;

import android.net.Uri;
public final class b0 {
    public static final String f3699b;
    public final Uri f3700a;

    static {
        String str = e2.m0.f8254a;
        f3699b = Integer.toString(0, 36);
    }

    public b0(a1 a1Var) {
        this.f3700a = (Uri) a1Var.f3693a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b0) && this.f3700a.equals(((b0) obj).f3700a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3700a.hashCode() * 31;
    }
}
