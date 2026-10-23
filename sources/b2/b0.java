package b2;

import android.net.Uri;
public final class b0 {
    public static final String f3703b;
    public final Uri f3704a;

    static {
        String str = e2.m0.f8259a;
        f3703b = Integer.toString(0, 36);
    }

    public b0(a1 a1Var) {
        this.f3704a = (Uri) a1Var.f3697a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b0) && this.f3704a.equals(((b0) obj).f3704a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3704a.hashCode() * 31;
    }
}
