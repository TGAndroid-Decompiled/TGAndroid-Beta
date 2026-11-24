package defpackage;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class u8a {
    public static final String b;
    public static final String c;
    public final v8a a;

    static {
        ct6.a("media3.session");
        String str = hac.a;
        b = "0";
        c = "1";
    }

    public u8a(int i, String str, oz6 oz6Var, Bundle bundle, MediaSession.Token token) {
        this.a = new v8a(i, str, oz6Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u8a)) {
            return false;
        }
        return this.a.equals(((u8a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
