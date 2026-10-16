package l2;

import g2.b0;
import java.io.IOException;
import u2.u;
public final class d implements y2.g {
    public final g f14495a;

    @Override
    public void A(y2.i iVar, long j10, long j11) {
        y2.o oVar = (y2.o) iVar;
        g gVar = this.f14495a;
        long j12 = oVar.f48545a;
        g2.m mVar = oVar.f48546b;
        b0 b0Var = oVar.d;
        u uVar = new u(mVar, b0Var.f9859c, b0Var.d, j10, j11, b0Var.f9858b);
        gVar.f14509m.getClass();
        gVar.f14513q.r(uVar, oVar.f48547c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        gVar.K = ((Long) oVar.f48548f).longValue() - j10;
        gVar.z(true);
    }

    @Override
    public void X0(y2.i iVar, long j10, long j11, boolean z10) {
        this.f14495a.x((y2.o) iVar, j10, j11);
    }

    public void a() {
        long j10;
        g gVar = this.f14495a;
        synchronized (z2.b.f49244b) {
            try {
                if (z2.b.f49245c) {
                    j10 = z2.b.d;
                } else {
                    j10 = -9223372036854775807L;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        gVar.K = j10;
        gVar.z(true);
    }

    @Override
    public k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        y2.o oVar = (y2.o) iVar;
        g gVar = this.f14495a;
        a5.a aVar = gVar.f14513q;
        long j12 = oVar.f48545a;
        g2.m mVar = oVar.f48546b;
        b0 b0Var = oVar.d;
        aVar.t(new u(mVar, b0Var.f9859c, b0Var.d, j10, j11, b0Var.f9858b), oVar.f48547c, iOException, true);
        gVar.f14509m.getClass();
        gVar.y(iOException);
        return y2.l.e;
    }

    @Override
    public void y(y2.i iVar, long j10, long j11, int i10) {
    }
}
