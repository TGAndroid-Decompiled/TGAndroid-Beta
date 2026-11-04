package b8;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public abstract class se {
    public static i2.n a(o2.m mVar, String str, o2.j jVar, int i3) {
        Map map = Collections.EMPTY_MAP;
        Uri g7 = g2.f.g(str, jVar.f20549c);
        long j10 = jVar.f20547a;
        long j11 = jVar.f20548b;
        String a10 = mVar.a();
        if (a10 == null) {
            a10 = g2.f.g(((o2.b) mVar.f20554b.get(0)).f20509a, jVar.f20549c).toString();
        }
        String str2 = a10;
        zb.k(g7, "The uri must be set.");
        return new i2.n(g7, 1, null, g9.x1.h, j10, j11, str2, i3);
    }
}
