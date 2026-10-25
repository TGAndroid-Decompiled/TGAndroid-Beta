package a8;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public abstract class vd {
    public static g2.m a(m2.m mVar, String str, m2.j jVar, int i10) {
        Map map = Collections.EMPTY_MAP;
        Uri g7 = e2.e.g(str, jVar.f17968c);
        long j10 = jVar.f17966a;
        long j11 = jVar.f17967b;
        String b10 = mVar.b();
        if (b10 == null) {
            b10 = e2.e.g(((m2.b) mVar.f17973b.get(0)).f17932a, jVar.f17968c).toString();
        }
        String str2 = b10;
        yb.l(g7, "The uri must be set.");
        return new g2.m(g7, 1, null, f9.x1.h, j10, j11, str2, i10);
    }
}
