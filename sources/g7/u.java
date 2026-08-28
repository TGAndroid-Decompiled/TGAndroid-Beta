package g7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public abstract class u {
    public static com.google.android.exoplayer2.upstream.q a(n4.m mVar, String str, n4.j jVar, int i9) {
        Map map = Collections.EMPTY_MAP;
        Uri H = d5.a.H(str, jVar.f18426c);
        long j10 = jVar.f18424a;
        long j11 = jVar.f18425b;
        String b10 = mVar.b();
        if (b10 == null) {
            b10 = d5.a.H(((n4.b) mVar.f18431b.get(0)).f18387a, jVar.f18426c).toString();
        }
        String str2 = b10;
        d5.a.k(H, "The uri must be set.");
        return new com.google.android.exoplayer2.upstream.q(H, 1, null, map, j10, j11, str2, i9);
    }
}
