package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class u1 {
    public static final String f12962b;
    public static final String f12963c;
    public final v1 f12964a;

    static {
        b2.q0.a("media3.session");
        String str = e2.l0.f6165a;
        f12962b = Integer.toString(0, 36);
        f12963c = Integer.toString(1, 36);
    }

    public u1(int i10, String str, j1 j1Var, Bundle bundle, MediaSession.Token token) {
        this.f12964a = new v1(i10, str, j1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u1)) {
            return false;
        }
        return this.f12964a.equals(((u1) obj).f12964a);
    }

    public final int hashCode() {
        return this.f12964a.hashCode();
    }

    public final String toString() {
        return this.f12964a.toString();
    }
}
