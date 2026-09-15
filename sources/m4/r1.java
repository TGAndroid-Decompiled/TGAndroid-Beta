package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class r1 {
    public static final String f14673b;
    public static final String f14674c;
    public final s1 f14675a;

    static {
        b2.l0.a("media3.session");
        String str = e2.d0.f7883a;
        f14673b = Integer.toString(0, 36);
        f14674c = Integer.toString(1, 36);
    }

    public r1(int i10, String str, g1 g1Var, Bundle bundle, MediaSession.Token token) {
        this.f14675a = new s1(i10, str, g1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r1)) {
            return false;
        }
        return this.f14675a.equals(((r1) obj).f14675a);
    }

    public final int hashCode() {
        return this.f14675a.hashCode();
    }

    public final String toString() {
        return this.f14675a.toString();
    }
}
