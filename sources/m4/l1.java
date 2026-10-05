package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class l1 {
    public static final String f16247b;
    public static final String f16248c;
    public final m1 f16249a;

    static {
        b2.l0.a("media3.session");
        String str = e2.d0.f8538a;
        f16247b = Integer.toString(0, 36);
        f16248c = Integer.toString(1, 36);
    }

    public l1(int i10, String str, a1 a1Var, Bundle bundle, MediaSession.Token token) {
        this.f16249a = new m1(i10, str, a1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l1)) {
            return false;
        }
        return this.f16249a.equals(((l1) obj).f16249a);
    }

    public final int hashCode() {
        return this.f16249a.hashCode();
    }

    public final String toString() {
        return this.f16249a.toString();
    }
}
