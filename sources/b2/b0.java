package b2;

import android.net.Uri;
public final class b0 {
    public static final String f3698b;
    public final Uri f3699a;

    static {
        String str = e2.m0.f8254a;
        f3698b = Integer.toString(0, 36);
    }

    public b0(a1 a1Var) {
        this.f3699a = (Uri) a1Var.f3692a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b0) && this.f3699a.equals(((b0) obj).f3699a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3699a.hashCode() * 31;
    }
}
