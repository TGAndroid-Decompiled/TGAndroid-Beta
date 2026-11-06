package c8;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public abstract class ba {
    public static j2.m a(p2.m mVar, String str, p2.j jVar, int i7) {
        Map map = Collections.EMPTY_MAP;
        Uri g10 = h2.e.g(str, jVar.f53043c);
        long j3 = jVar.f53041a;
        long j10 = jVar.f53042b;
        String b10 = mVar.b();
        if (b10 == null) {
            b10 = h2.e.g(((p2.b) mVar.f53048b.get(0)).f53003a, jVar.f53043c).toString();
        }
        String str2 = b10;
        a8.ia.k(g10, "The uri must be set.");
        return new j2.m(g10, 1, null, h9.y1.h, j3, j10, str2, i7);
    }
}
