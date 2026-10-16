package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class t1 {
    public static final String f15379b;
    public static final String f15380c;
    public final u1 f15381a;

    static {
        b2.q0.a("media3.session");
        String str = e2.m0.f8375a;
        f15379b = Integer.toString(0, 36);
        f15380c = Integer.toString(1, 36);
    }

    public t1(int i10, String str, i1 i1Var, Bundle bundle, MediaSession.Token token) {
        this.f15381a = new u1(i10, str, i1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t1)) {
            return false;
        }
        return this.f15381a.equals(((t1) obj).f15381a);
    }

    public final int hashCode() {
        return this.f15381a.hashCode();
    }

    public final String toString() {
        return this.f15381a.toString();
    }
}
