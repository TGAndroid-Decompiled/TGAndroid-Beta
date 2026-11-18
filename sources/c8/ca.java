package c8;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public abstract class ca {
    public static j2.m a(p2.m mVar, String str, p2.j jVar, int i7) {
        Map map = Collections.EMPTY_MAP;
        Uri g10 = h2.e.g(str, jVar.f55121c);
        long j3 = jVar.f55119a;
        long j10 = jVar.f55120b;
        String b10 = mVar.b();
        if (b10 == null) {
            b10 = h2.e.g(((p2.b) mVar.f55126b.get(0)).f55081a, jVar.f55121c).toString();
        }
        String str2 = b10;
        a8.la.k(g10, "The uri must be set.");
        return new j2.m(g10, 1, null, h9.y1.h, j3, j10, str2, i7);
    }
}
