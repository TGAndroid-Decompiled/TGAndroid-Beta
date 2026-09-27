package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class l1 {
    public static final String f14906b;
    public static final String f14907c;
    public final m1 f14908a;

    static {
        b2.l0.a("media3.session");
        String str = e2.d0.f7872a;
        f14906b = Integer.toString(0, 36);
        f14907c = Integer.toString(1, 36);
    }

    public l1(int i10, String str, a1 a1Var, Bundle bundle, MediaSession.Token token) {
        this.f14908a = new m1(i10, str, a1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l1)) {
            return false;
        }
        return this.f14908a.equals(((l1) obj).f14908a);
    }

    public final int hashCode() {
        return this.f14908a.hashCode();
    }

    public final String toString() {
        return this.f14908a.toString();
    }
}
