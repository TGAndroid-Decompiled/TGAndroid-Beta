package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class l1 {
    public static final String f14880b;
    public static final String f14881c;
    public final m1 f14882a;

    static {
        b2.l0.a("media3.session");
        String str = e2.d0.f7870a;
        f14880b = Integer.toString(0, 36);
        f14881c = Integer.toString(1, 36);
    }

    public l1(int i10, String str, a1 a1Var, Bundle bundle, MediaSession.Token token) {
        this.f14882a = new m1(i10, str, a1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l1)) {
            return false;
        }
        return this.f14882a.equals(((l1) obj).f14882a);
    }

    public final int hashCode() {
        return this.f14882a.hashCode();
    }

    public final String toString() {
        return this.f14882a.toString();
    }
}
