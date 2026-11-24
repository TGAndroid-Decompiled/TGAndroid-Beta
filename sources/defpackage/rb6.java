package defpackage;

import android.net.Uri;
import j$.util.Objects;
public final class rb6 {
    public final Uri a;
    public final String b;

    public rb6(Uri uri) {
        this(uri, uri.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb6)) {
            return false;
        }
        rb6 rb6Var = (rb6) obj;
        if (Objects.equals(this.a, rb6Var.a) && Objects.equals(this.b, rb6Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public rb6(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }
}
