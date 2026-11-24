package defpackage;

import android.net.Uri;
import j$.util.Objects;
public final class s96 {
    public final Uri a;
    public final String b;

    public s96(Uri uri) {
        this(uri, uri.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s96)) {
            return false;
        }
        s96 s96Var = (s96) obj;
        if (Objects.equals(this.a, s96Var.a) && Objects.equals(this.b, s96Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public s96(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }
}
