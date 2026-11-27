package defpackage;

import android.net.Uri;
import j$.util.Objects;
public final class wb6 {
    public final Uri a;
    public final String b;

    public wb6(Uri uri) {
        this(uri, uri.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb6)) {
            return false;
        }
        wb6 wb6Var = (wb6) obj;
        if (Objects.equals(this.a, wb6Var.a) && Objects.equals(this.b, wb6Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public wb6(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }
}
