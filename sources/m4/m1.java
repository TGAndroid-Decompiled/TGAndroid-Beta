package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class m1 {
    public static final String f16179b;
    public static final String f16180c;
    public final n1 f16181a;

    static {
        b2.l0.a("media3.session");
        String str = e2.d0.f8532a;
        f16179b = Integer.toString(0, 36);
        f16180c = Integer.toString(1, 36);
    }

    public m1(int i10, String str, b1 b1Var, Bundle bundle, MediaSession.Token token) {
        this.f16181a = new n1(i10, str, b1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m1)) {
            return false;
        }
        return this.f16181a.equals(((m1) obj).f16181a);
    }

    public final int hashCode() {
        return this.f16181a.hashCode();
    }

    public final String toString() {
        return this.f16181a.toString();
    }
}
