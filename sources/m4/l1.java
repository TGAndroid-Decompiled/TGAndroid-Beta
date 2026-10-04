package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class l1 {
    public static final String f16242b;
    public static final String f16243c;
    public final m1 f16244a;

    static {
        b2.l0.a("media3.session");
        String str = e2.d0.f8538a;
        f16242b = Integer.toString(0, 36);
        f16243c = Integer.toString(1, 36);
    }

    public l1(int i10, String str, a1 a1Var, Bundle bundle, MediaSession.Token token) {
        this.f16244a = new m1(i10, str, a1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l1)) {
            return false;
        }
        return this.f16244a.equals(((l1) obj).f16244a);
    }

    public final int hashCode() {
        return this.f16244a.hashCode();
    }

    public final String toString() {
        return this.f16244a.toString();
    }
}
