package g5;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
public final class p0 implements j0 {
    public final long f6406a;
    public final p f6407b;
    public final int f6408c;
    public final u0 d;
    public final o0 e;
    public volatile Object f6409f;

    public p0(m mVar, Uri uri, int i10, o0 o0Var) {
        Map map = Collections.EMPTY_MAP;
        h5.a.k(uri, "The uri must be set.");
        p pVar = new p(uri, 1, null, map, 0L, -1L, null, 1);
        this.d = new u0(mVar);
        this.f6407b = pVar;
        this.f6408c = i10;
        this.e = o0Var;
        this.f6406a = o4.j.f16337a.getAndIncrement();
    }

    @Override
    public final void a() {
        this.d.f6457b = 0L;
        o oVar = new o(this.d, this.f6407b);
        try {
            oVar.a();
            Uri uri = this.d.f6456a.getUri();
            uri.getClass();
            this.f6409f = this.e.k(uri, oVar);
            try {
                oVar.close();
            } catch (IOException unused) {
            }
        } finally {
            int i10 = h5.d0.f6924a;
            try {
                oVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void b() {
    }
}
