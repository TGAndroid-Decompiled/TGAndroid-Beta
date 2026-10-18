package b2;

import android.net.Uri;
public final class b0 {
    public static final String f3700b;
    public final Uri f3701a;

    static {
        String str = e2.m0.f8253a;
        f3700b = Integer.toString(0, 36);
    }

    public b0(a1 a1Var) {
        this.f3701a = (Uri) a1Var.f3694a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b0) && this.f3701a.equals(((b0) obj).f3701a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3701a.hashCode() * 31;
    }
}
