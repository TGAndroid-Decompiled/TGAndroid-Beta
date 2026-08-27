package h7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

public abstract class u {
    public static com.google.android.exoplayer2.upstream.q a(n4.m mVar, String str, n4.j jVar, int i10) {
        Map map = Collections.EMPTY_MAP;
        Uri uriH = d5.a.H(str, jVar.f18253c);
        long j10 = jVar.f18251a;
        long j11 = jVar.f18252b;
        String strB = mVar.b();
        if (strB == null) {
            strB = d5.a.H(((n4.b) mVar.f18258b.get(0)).f18214a, jVar.f18253c).toString();
        }
        String str2 = strB;
        d5.a.k(uriH, "The uri must be set.");
        return new com.google.android.exoplayer2.upstream.q(uriH, 1, null, map, j10, j11, str2, i10);
    }
}
