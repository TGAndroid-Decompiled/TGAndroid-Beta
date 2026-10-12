package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class u1 {
    public static final String f15649b;
    public static final String f15650c;
    public final v1 f15651a;

    static {
        b2.q0.a("media3.session");
        String str = e2.m0.f8372a;
        f15649b = Integer.toString(0, 36);
        f15650c = Integer.toString(1, 36);
    }

    public u1(int i10, String str, j1 j1Var, Bundle bundle, MediaSession.Token token) {
        this.f15651a = new v1(i10, str, j1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u1)) {
            return false;
        }
        return this.f15651a.equals(((u1) obj).f15651a);
    }

    public final int hashCode() {
        return this.f15651a.hashCode();
    }

    public final String toString() {
        return this.f15651a.toString();
    }
}
