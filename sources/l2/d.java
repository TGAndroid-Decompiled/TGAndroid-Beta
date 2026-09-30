package l2;

import android.net.Uri;
import java.io.IOException;
import u2.t;
public final class d implements y2.g {
    public final g f14039a;

    @Override
    public void E(y2.i iVar, long j3, long j10, boolean z10) {
        this.f14039a.w((y2.o) iVar, j10);
    }

    public void a() {
        long j3;
        g gVar = this.f14039a;
        synchronized (z2.c.f48354b) {
            try {
                if (z2.c.f48355c) {
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
        g gVar = this.f14039a;
        a5.a aVar = gVar.f14057q;
        long j11 = oVar.f46579a;
        Uri uri = oVar.d.f9334c;
        aVar.r(new t(j10), oVar.f46581c, iOException, true);
        gVar.f14053m.getClass();
        gVar.x(iOException);
        return y2.l.e;
    }

    @Override
    public void o(y2.i iVar, long j3, long j10) {
        y2.o oVar = (y2.o) iVar;
        g gVar = this.f14039a;
        long j11 = oVar.f46579a;
        Uri uri = oVar.d.f9334c;
        t tVar = new t(j10);
        gVar.f14053m.getClass();
        gVar.f14057q.p(tVar, oVar.f46581c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        gVar.L = ((Long) oVar.f46582f).longValue() - j3;
        gVar.y(true);
    }

    @Override
    public void n(y2.i iVar, long j3, long j10, int i10) {
    }
}
