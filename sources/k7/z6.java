package k7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public abstract class z6 {
    public static g5.p a(s4.m mVar, String str, s4.j jVar, int i10) {
        Map map = Collections.EMPTY_MAP;
        Uri H = h5.a.H(str, jVar.f47015c);
        long j10 = jVar.f47013a;
        long j11 = jVar.f47014b;
        String b10 = mVar.b();
        if (b10 == null) {
            b10 = h5.a.H(((s4.b) mVar.f47020b.get(0)).f46976a, jVar.f47015c).toString();
        }
        String str2 = b10;
        h5.a.k(H, "The uri must be set.");
        return new g5.p(H, 1, null, s8.n0.h, j10, j11, str2, i10);
    }
}
