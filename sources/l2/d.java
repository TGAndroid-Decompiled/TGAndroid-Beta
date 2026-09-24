package l2;

import android.net.Uri;
import java.io.IOException;
import u2.t;
import y2.p;
public final class d implements y2.h {
    public final g f14023a;

    @Override
    public void E(y2.j jVar, long j3, long j10, boolean z10) {
        this.f14023a.w((p) jVar, j10);
    }

    public void a() {
        long j3;
        g gVar = this.f14023a;
        synchronized (z2.c.f48341b) {
            try {
                if (z2.c.f48342c) {
                    j3 = z2.c.d;
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
    public k4.d m(y2.j jVar, long j3, long j10, IOException iOException, int i10) {
        p pVar = (p) jVar;
        g gVar = this.f14023a;
        a5.a aVar = gVar.f14041q;
        long j11 = pVar.f46566a;
        Uri uri = pVar.d.f9334c;
        aVar.r(new t(j10), pVar.f46568c, iOException, true);
        gVar.f14037m.getClass();
        gVar.x(iOException);
        return y2.m.e;
    }

    @Override
    public void o(y2.j jVar, long j3, long j10) {
        p pVar = (p) jVar;
        g gVar = this.f14023a;
        long j11 = pVar.f46566a;
        Uri uri = pVar.d.f9334c;
        t tVar = new t(j10);
        gVar.f14037m.getClass();
        gVar.f14041q.p(tVar, pVar.f46568c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        gVar.L = ((Long) pVar.f46569f).longValue() - j3;
        gVar.y(true);
    }

    @Override
    public void n(y2.j jVar, long j3, long j10, int i10) {
    }
}
