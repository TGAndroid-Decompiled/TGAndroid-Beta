package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class t1 {
    public static final String f16731b;
    public static final String f16732c;
    public final u1 f16733a;

    static {
        b2.p0.a("media3.session");
        String str = e2.m0.f8254a;
        f16731b = Integer.toString(0, 36);
        f16732c = Integer.toString(1, 36);
    }

    public t1(int i10, String str, i1 i1Var, Bundle bundle, MediaSession.Token token) {
        this.f16733a = new u1(i10, str, i1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t1)) {
            return false;
        }
        return this.f16733a.equals(((t1) obj).f16733a);
    }

    public final int hashCode() {
        return this.f16733a.hashCode();
    }

    public final String toString() {
        return this.f16733a.toString();
    }
}
