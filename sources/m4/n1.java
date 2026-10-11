package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class n1 {
    public static final String f16246b;
    public static final String f16247c;
    public final o1 f16248a;

    static {
        b2.l0.a("media3.session");
        String str = e2.d0.f8531a;
        f16246b = Integer.toString(0, 36);
        f16247c = Integer.toString(1, 36);
    }

    public n1(int i10, String str, c1 c1Var, Bundle bundle, MediaSession.Token token) {
        this.f16248a = new o1(i10, str, c1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n1)) {
            return false;
        }
        return this.f16248a.equals(((n1) obj).f16248a);
    }

    public final int hashCode() {
        return this.f16248a.hashCode();
    }

    public final String toString() {
        return this.f16248a.toString();
    }
}
