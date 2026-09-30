package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class l1 {
    public static final String f14895b;
    public static final String f14896c;
    public final m1 f14897a;

    static {
        b2.l0.a("media3.session");
        String str = e2.d0.f7882a;
        f14895b = Integer.toString(0, 36);
        f14896c = Integer.toString(1, 36);
    }

    public l1(int i10, String str, a1 a1Var, Bundle bundle, MediaSession.Token token) {
        this.f14897a = new m1(i10, str, a1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l1)) {
            return false;
        }
        return this.f14897a.equals(((l1) obj).f14897a);
    }

    public final int hashCode() {
        return this.f14897a.hashCode();
    }

    public final String toString() {
        return this.f14897a.toString();
    }
}
