package g5;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
public final class p0 implements j0 {
    public final long f6891a;
    public final p f6892b;
    public final int f6893c;
    public final u0 d;
    public final o0 f6894e;
    public volatile Object f6895f;

    public p0(m mVar, Uri uri, int i10, o0 o0Var) {
        Map map = Collections.EMPTY_MAP;
        h5.a.k(uri, "The uri must be set.");
        p pVar = new p(uri, 1, null, map, 0L, -1L, null, 1);
        this.d = new u0(mVar);
        this.f6892b = pVar;
        this.f6893c = i10;
        this.f6894e = o0Var;
        this.f6891a = o4.j.f16502a.getAndIncrement();
    }

    @Override
    public final void a() {
        this.d.f6949b = 0L;
        o oVar = new o(this.d, this.f6892b);
        try {
            oVar.a();
            Uri uri = this.d.f6948a.getUri();
            uri.getClass();
            this.f6895f = this.f6894e.w(uri, oVar);
            try {
                oVar.close();
            } catch (IOException unused) {
            }
        } finally {
            int i10 = h5.d0.f7237a;
            try {
                oVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void l() {
    }
}
