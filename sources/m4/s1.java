package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class s1 {
    public static final String f13513b;
    public static final String f13514c;
    public final t1 f13515a;

    static {
        b2.l0.a("media3.session");
        String str = e2.d0.f7188a;
        f13513b = Integer.toString(0, 36);
        f13514c = Integer.toString(1, 36);
    }

    public s1(int i10, String str, h1 h1Var, Bundle bundle, MediaSession.Token token) {
        this.f13515a = new t1(i10, str, h1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s1)) {
            return false;
        }
        return this.f13515a.equals(((s1) obj).f13515a);
    }

    public final int hashCode() {
        return this.f13515a.hashCode();
    }

    public final String toString() {
        return this.f13515a.toString();
    }
}
