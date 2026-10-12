package l2;

import g2.b0;
import java.io.IOException;
import u2.u;
public final class d implements y2.g {
    public final h f14493a;

    @Override
    public void B(y2.i iVar, long j10, long j11, boolean z10) {
        this.f14493a.x((y2.o) iVar, j10, j11);
    }

    public void a() {
        long j10;
        h hVar = this.f14493a;
        synchronized (z2.b.f49245b) {
            try {
                if (z2.b.f49246c) {
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
        h hVar = this.f14493a;
        a5.a aVar = hVar.f14513q;
        long j12 = oVar.f48546a;
        g2.m mVar = oVar.f48547b;
        b0 b0Var = oVar.d;
        aVar.t(new u(mVar, b0Var.f9856c, b0Var.d, j10, j11, b0Var.f9855b), oVar.f48548c, iOException, true);
        hVar.f14509m.getClass();
        hVar.y(iOException);
        return y2.l.e;
    }

    @Override
    public void l(y2.i iVar, long j10, long j11) {
        y2.o oVar = (y2.o) iVar;
        h hVar = this.f14493a;
        long j12 = oVar.f48546a;
        g2.m mVar = oVar.f48547b;
        b0 b0Var = oVar.d;
        u uVar = new u(mVar, b0Var.f9856c, b0Var.d, j10, j11, b0Var.f9855b);
        hVar.f14509m.getClass();
        hVar.f14513q.r(uVar, oVar.f48548c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        hVar.K = ((Long) oVar.f48549f).longValue() - j10;
        hVar.z(true);
    }

    @Override
    public void k(y2.i iVar, long j10, long j11, int i10) {
    }
}
