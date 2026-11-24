package defpackage;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class s6a {
    public static final String b;
    public static final String c;
    public final t6a a;

    static {
        cr6.a("media3.session");
        String str = g8c.a;
        b = "0";
        c = "1";
    }

    public s6a(int i, String str, ox6 ox6Var, Bundle bundle, MediaSession.Token token) {
        this.a = new t6a(i, str, ox6Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s6a)) {
            return false;
        }
        return this.a.equals(((s6a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
