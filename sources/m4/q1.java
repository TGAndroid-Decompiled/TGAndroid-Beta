package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class q1 {
    public static final String f14883b;
    public static final String f14884c;
    public final r1 f14885a;

    static {
        b2.l0.a("media3.session");
        String str = e2.d0.f7888a;
        f14883b = Integer.toString(0, 36);
        f14884c = Integer.toString(1, 36);
    }

    public q1(int i10, String str, f1 f1Var, Bundle bundle, MediaSession.Token token) {
        this.f14885a = new r1(i10, str, f1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q1)) {
            return false;
        }
        return this.f14885a.equals(((q1) obj).f14885a);
    }

    public final int hashCode() {
        return this.f14885a.hashCode();
    }

    public final String toString() {
        return this.f14885a.toString();
    }
}
