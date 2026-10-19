package b2;

import android.net.Uri;
public final class b0 {
    public static final String f3696b;
    public final Uri f3697a;

    static {
        String str = e2.m0.f8252a;
        f3696b = Integer.toString(0, 36);
    }

    public b0(a1 a1Var) {
        this.f3697a = (Uri) a1Var.f3690a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b0) && this.f3697a.equals(((b0) obj).f3697a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3697a.hashCode() * 31;
    }
}
