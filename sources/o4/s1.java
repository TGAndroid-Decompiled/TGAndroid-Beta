package o4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class s1 {
    public static final String f20850b;
    public static final String f20851c;
    public final t1 f20852a;

    static {
        d2.o0.a("media3.session");
        String str = g2.n0.f11873a;
        f20850b = Integer.toString(0, 36);
        f20851c = Integer.toString(1, 36);
    }

    public s1(int i3, String str, h1 h1Var, Bundle bundle, MediaSession.Token token) {
        this.f20852a = new t1(i3, str, h1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s1)) {
            return false;
        }
        return this.f20852a.equals(((s1) obj).f20852a);
    }

    public final int hashCode() {
        return this.f20852a.hashCode();
    }

    public final String toString() {
        return this.f20852a.toString();
    }
}
