package l2;

import g2.b0;
import java.io.IOException;
import u2.u;
public final class d implements y2.g {
    public final h f15832a;

    @Override
    public void I(y2.i iVar, long j10, long j11, boolean z10) {
        this.f15832a.x((y2.o) iVar, j10, j11);
    }

    public void a() {
        long j10;
        h hVar = this.f15832a;
        synchronized (z2.b.f50628b) {
            try {
                if (z2.b.f50629c) {
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
        h hVar = this.f15832a;
        a5.a aVar = hVar.f15852q;
        long j12 = oVar.f49928a;
        g2.m mVar = oVar.f49929b;
        b0 b0Var = oVar.d;
        aVar.t(new u(mVar, b0Var.f10765c, b0Var.d, j10, j11, b0Var.f10764b), oVar.f49930c, iOException, true);
        hVar.f15848m.getClass();
        hVar.y(iOException);
        return y2.l.e;
    }

    @Override
    public void n(y2.i iVar, long j10, long j11) {
        y2.o oVar = (y2.o) iVar;
        h hVar = this.f15832a;
        long j12 = oVar.f49928a;
        g2.m mVar = oVar.f49929b;
        b0 b0Var = oVar.d;
        u uVar = new u(mVar, b0Var.f10765c, b0Var.d, j10, j11, b0Var.f10764b);
        hVar.f15848m.getClass();
        hVar.f15852q.r(uVar, oVar.f49930c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        hVar.K = ((Long) oVar.f49931f).longValue() - j10;
        hVar.z(true);
    }

    @Override
    public void l(y2.i iVar, long j10, long j11, int i10) {
    }
}
