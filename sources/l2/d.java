package l2;

import android.net.Uri;
import java.io.IOException;
import u2.t;
public final class d implements y2.g {
    public final g f14040a;

    public d(g gVar) {
        this.f14040a = gVar;
    }

    @Override
    public void G(y2.i iVar, long j3, long j10, boolean z10) {
        this.f14040a.w((y2.o) iVar, j10);
    }

    public void a() {
        long j3;
        g gVar = this.f14040a;
        synchronized (z2.b.f48395b) {
            try {
                if (z2.b.f48396c) {
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
    public k4.d l(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        y2.o oVar = (y2.o) iVar;
        g gVar = this.f14040a;
        a5.a aVar = gVar.f14058q;
        long j11 = oVar.f46622a;
        Uri uri = oVar.d.f9339c;
        aVar.r(new t(j10), oVar.f46624c, iOException, true);
        gVar.f14054m.getClass();
        gVar.x(iOException);
        return y2.l.e;
    }

    @Override
    public void q(y2.i iVar, long j3, long j10) {
        y2.o oVar = (y2.o) iVar;
        g gVar = this.f14040a;
        long j11 = oVar.f46622a;
        Uri uri = oVar.d.f9339c;
        t tVar = new t(j10);
        gVar.f14054m.getClass();
        gVar.f14058q.p(tVar, oVar.f46624c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        gVar.L = ((Long) oVar.f46625f).longValue() - j3;
        gVar.y(true);
    }

    @Override
    public void m(y2.i iVar, long j3, long j10, int i10) {
    }
}
