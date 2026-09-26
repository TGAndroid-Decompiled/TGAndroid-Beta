package l2;

import android.net.Uri;
import java.io.IOException;
import u2.t;
public final class d implements y2.g {
    public final g f14038a;

    @Override
    public void E(y2.i iVar, long j3, long j10, boolean z10) {
        this.f14038a.w((y2.o) iVar, j10);
    }

    public void a() {
        long j3;
        g gVar = this.f14038a;
        synchronized (z2.c.f48351b) {
            try {
                if (z2.c.f48352c) {
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
    public k4.d m(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        y2.o oVar = (y2.o) iVar;
        g gVar = this.f14038a;
        a5.a aVar = gVar.f14056q;
        long j11 = oVar.f46576a;
        Uri uri = oVar.d.f9334c;
        aVar.r(new t(j10), oVar.f46578c, iOException, true);
        gVar.f14052m.getClass();
        gVar.x(iOException);
        return y2.l.e;
    }

    @Override
    public void o(y2.i iVar, long j3, long j10) {
        y2.o oVar = (y2.o) iVar;
        g gVar = this.f14038a;
        long j11 = oVar.f46576a;
        Uri uri = oVar.d.f9334c;
        t tVar = new t(j10);
        gVar.f14052m.getClass();
        gVar.f14056q.p(tVar, oVar.f46578c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        gVar.L = ((Long) oVar.f46579f).longValue() - j3;
        gVar.y(true);
    }

    @Override
    public void n(y2.i iVar, long j3, long j10, int i10) {
    }
}
