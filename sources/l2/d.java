package l2;

import android.net.Uri;
import java.io.IOException;
import u2.t;
import y2.p;
public final class d implements y2.h {
    public final g f13826a;

    @Override
    public void V(y2.j jVar, long j3, long j10, boolean z10) {
        this.f13826a.w((p) jVar, j10);
    }

    public void a() {
        long j3;
        g gVar = this.f13826a;
        synchronized (z2.b.f48106b) {
            try {
                if (z2.b.f48107c) {
                    j3 = z2.b.d;
                } else {
                    j3 = -9223372036854775807L;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        gVar.L = j3;
        gVar.y(true);
    }

    @Override
    public k4.d n(y2.j jVar, long j3, long j10, IOException iOException, int i10) {
        p pVar = (p) jVar;
        g gVar = this.f13826a;
        a5.a aVar = gVar.f13844q;
        long j11 = pVar.f46326a;
        Uri uri = pVar.d.f9352c;
        aVar.r(new t(j10), pVar.f46328c, iOException, true);
        gVar.f13840m.getClass();
        gVar.x(iOException);
        return y2.m.e;
    }

    @Override
    public void q(y2.j jVar, long j3, long j10) {
        p pVar = (p) jVar;
        g gVar = this.f13826a;
        long j11 = pVar.f46326a;
        Uri uri = pVar.d.f9352c;
        t tVar = new t(j10);
        gVar.f13840m.getClass();
        gVar.f13844q.p(tVar, pVar.f46328c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        gVar.L = ((Long) pVar.f46329f).longValue() - j3;
        gVar.y(true);
    }

    @Override
    public void o(y2.j jVar, long j3, long j10, int i10) {
    }
}
