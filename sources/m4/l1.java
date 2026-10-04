package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class l1 {
    public static final String f16238b;
    public static final String f16239c;
    public final m1 f16240a;

    static {
        b2.l0.a("media3.session");
        String str = e2.d0.f8537a;
        f16238b = Integer.toString(0, 36);
        f16239c = Integer.toString(1, 36);
    }

    public l1(int i10, String str, a1 a1Var, Bundle bundle, MediaSession.Token token) {
        this.f16240a = new m1(i10, str, a1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l1)) {
            return false;
        }
        return this.f16240a.equals(((l1) obj).f16240a);
    }

    public final int hashCode() {
        return this.f16240a.hashCode();
    }

    public final String toString() {
        return this.f16240a.toString();
    }
}
