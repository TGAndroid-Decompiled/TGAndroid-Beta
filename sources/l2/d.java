package l2;

import g2.b0;
import java.io.IOException;
import u2.v;
public final class d implements y2.g {
    public final h f15896a;

    public d(h hVar) {
        this.f15896a = hVar;
    }

    public void a() {
        long j10;
        h hVar = this.f15896a;
        synchronized (z2.c.f51098b) {
            try {
                if (z2.c.f51099c) {
                    j10 = z2.c.d;
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
    public k4.d e(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        y2.o oVar = (y2.o) iVar;
        h hVar = this.f15896a;
        a5.a aVar = hVar.f15916q;
        long j12 = oVar.f50378a;
        g2.m mVar = oVar.f50379b;
        b0 b0Var = oVar.d;
        aVar.t(new v(mVar, b0Var.f10783c, b0Var.d, j10, j11, b0Var.f10782b), oVar.f50380c, iOException, true);
        hVar.f15912m.getClass();
        hVar.y(iOException);
        return y2.l.e;
    }

    @Override
    public void k(y2.i iVar, long j10, long j11) {
        y2.o oVar = (y2.o) iVar;
        h hVar = this.f15896a;
        long j12 = oVar.f50378a;
        g2.m mVar = oVar.f50379b;
        b0 b0Var = oVar.d;
        v vVar = new v(mVar, b0Var.f10783c, b0Var.d, j10, j11, b0Var.f10782b);
        hVar.f15912m.getClass();
        hVar.f15916q.r(vVar, oVar.f50380c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        hVar.K = ((Long) oVar.f50381f).longValue() - j10;
        hVar.z(true);
    }

    @Override
    public void z(y2.i iVar, long j10, long j11, boolean z10) {
        this.f15896a.x((y2.o) iVar, j10, j11);
    }

    @Override
    public void j(y2.i iVar, long j10, long j11, int i10) {
    }
}
