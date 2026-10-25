package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class u1 {
    public static final String f18265b;
    public static final String f18266c;
    public final v1 f18267a;

    static {
        b2.q0.a("media3.session");
        String str = e2.n0.f9692a;
        f18265b = Integer.toString(0, 36);
        f18266c = Integer.toString(1, 36);
    }

    public u1(int i10, String str, j1 j1Var, Bundle bundle, MediaSession.Token token) {
        this.f18267a = new v1(i10, str, j1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u1)) {
            return false;
        }
        return this.f18267a.equals(((u1) obj).f18267a);
    }

    public final int hashCode() {
        return this.f18267a.hashCode();
    }

    public final String toString() {
        return this.f18267a.toString();
    }
}
