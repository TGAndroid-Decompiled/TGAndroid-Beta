package defpackage;

import android.net.Uri;
public final class ss6 {
    public static final String b;
    public final Uri a;

    static {
        String str = gcc.a;
        b = "0";
    }

    public ss6(xh4 xh4Var) {
        this.a = (Uri) xh4Var.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof ss6) && this.a.equals(((ss6) obj).a)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
