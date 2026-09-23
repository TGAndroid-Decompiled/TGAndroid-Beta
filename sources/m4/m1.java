package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class m1 {
    public static final String f14629b;
    public static final String f14630c;
    public final n1 f14631a;

    static {
        b2.l0.a("media3.session");
        String str = e2.d0.f7871a;
        f14629b = Integer.toString(0, 36);
        f14630c = Integer.toString(1, 36);
    }

    public m1(int i10, String str, b1 b1Var, Bundle bundle, MediaSession.Token token) {
        this.f14631a = new n1(i10, str, b1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m1)) {
            return false;
        }
        return this.f14631a.equals(((m1) obj).f14631a);
    }

    public final int hashCode() {
        return this.f14631a.hashCode();
    }

    public final String toString() {
        return this.f14631a.toString();
    }
}
