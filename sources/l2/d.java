package l2;

import android.net.Uri;
import java.io.IOException;
import u2.t;
import y2.p;
public final class d implements y2.h {
    public final g f13973a;

    @Override
    public void E(y2.j jVar, long j3, long j10, boolean z10) {
        this.f13973a.w((p) jVar, j10);
    }

    public void a() {
        long j3;
        g gVar = this.f13973a;
        synchronized (z2.c.f48332b) {
            try {
                if (z2.c.f48333c) {
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
        g gVar = this.f13973a;
        a5.a aVar = gVar.f13991q;
        long j11 = pVar.f46553a;
        Uri uri = pVar.d.f9351c;
        aVar.r(new t(j10), pVar.f46555c, iOException, true);
        gVar.f13987m.getClass();
        gVar.x(iOException);
        return y2.m.e;
    }

    @Override
    public void o(y2.j jVar, long j3, long j10) {
        p pVar = (p) jVar;
        g gVar = this.f13973a;
        long j11 = pVar.f46553a;
        Uri uri = pVar.d.f9351c;
        t tVar = new t(j10);
        gVar.f13987m.getClass();
        gVar.f13991q.p(tVar, pVar.f46555c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        gVar.L = ((Long) pVar.f46556f).longValue() - j3;
        gVar.y(true);
    }

    @Override
    public void n(y2.j jVar, long j3, long j10, int i10) {
    }
}
