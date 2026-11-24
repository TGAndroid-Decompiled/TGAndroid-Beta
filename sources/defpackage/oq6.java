package defpackage;

import android.net.Uri;
public final class oq6 {
    public static final String b;
    public final Uri a;

    static {
        String str = g8c.a;
        b = "0";
    }

    public oq6(z24 z24Var) {
        this.a = (Uri) z24Var.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof oq6) && this.a.equals(((oq6) obj).a)) {
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
