package defpackage;

import android.net.Uri;
public final class os6 {
    public static final String b;
    public final Uri a;

    static {
        String str = hac.a;
        b = "0";
    }

    public os6(ai4 ai4Var) {
        this.a = (Uri) ai4Var.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof os6) && this.a.equals(((os6) obj).a)) {
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
