package i7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public abstract class x5 {
    public static com.google.android.exoplayer2.upstream.q a(p4.m mVar, String str, p4.j jVar, int i10) {
        Map map = Collections.EMPTY_MAP;
        Uri H = f5.a.H(str, jVar.f45575c);
        long j10 = jVar.f45573a;
        long j11 = jVar.f45574b;
        String a2 = mVar.a();
        if (a2 == null) {
            a2 = f5.a.H(((p4.b) mVar.f45580b.get(0)).f45536a, jVar.f45575c).toString();
        }
        String str2 = a2;
        f5.a.k(H, "The uri must be set.");
        return new com.google.android.exoplayer2.upstream.q(H, 1, null, map, j10, j11, str2, i10);
    }
}
