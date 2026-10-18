package l2;

import g2.b0;
import java.io.IOException;
import u2.t;
public final class d implements y2.g {
    public final h f15834a;

    @Override
    public void I(y2.i iVar, long j10, long j11, boolean z10) {
        this.f15834a.x((y2.o) iVar, j10, j11);
    }

    public void a() {
        long j10;
        h hVar = this.f15834a;
        synchronized (z2.b.f50675b) {
            try {
                if (z2.b.f50676c) {
                    j10 = z2.b.d;
                } else {
                    j10 = -9223372036854775807L;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        hVar.K = j10;
        hVar.z(true);
    }

    @Override
    public k4.d j(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        y2.o oVar = (y2.o) iVar;
        h hVar = this.f15834a;
        a5.a aVar = hVar.f15854q;
        long j12 = oVar.f49975a;
        g2.m mVar = oVar.f49976b;
        b0 b0Var = oVar.d;
        aVar.t(new t(mVar, b0Var.f10767c, b0Var.d, j10, j11, b0Var.f10766b), oVar.f49977c, iOException, true);
        hVar.f15850m.getClass();
        hVar.y(iOException);
        return y2.l.e;
    }

    @Override
    public void n(y2.i iVar, long j10, long j11) {
        y2.o oVar = (y2.o) iVar;
        h hVar = this.f15834a;
        long j12 = oVar.f49975a;
        g2.m mVar = oVar.f49976b;
        b0 b0Var = oVar.d;
        t tVar = new t(mVar, b0Var.f10767c, b0Var.d, j10, j11, b0Var.f10766b);
        hVar.f15850m.getClass();
        hVar.f15854q.r(tVar, oVar.f49977c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        hVar.K = ((Long) oVar.f49978f).longValue() - j10;
        hVar.z(true);
    }

    @Override
    public void l(y2.i iVar, long j10, long j11, int i10) {
    }
}
