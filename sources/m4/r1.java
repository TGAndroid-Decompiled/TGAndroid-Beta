package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class r1 {
    public static final String f14671b;
    public static final String f14672c;
    public final s1 f14673a;

    static {
        b2.l0.a("media3.session");
        String str = e2.d0.f7885a;
        f14671b = Integer.toString(0, 36);
        f14672c = Integer.toString(1, 36);
    }

    public r1(int i10, String str, g1 g1Var, Bundle bundle, MediaSession.Token token) {
        this.f14673a = new s1(i10, str, g1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r1)) {
            return false;
        }
        return this.f14673a.equals(((r1) obj).f14673a);
    }

    public final int hashCode() {
        return this.f14673a.hashCode();
    }

    public final String toString() {
        return this.f14673a.toString();
    }
}
