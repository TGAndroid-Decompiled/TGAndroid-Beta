package l2;

import a8.ng;
import g2.b0;
import java.io.IOException;
import u2.u;
public final class d implements y2.g {
    public final g f16798a;

    @Override
    public void B(y2.i iVar, long j10, long j11) {
        y2.o oVar = (y2.o) iVar;
        g gVar = this.f16798a;
        long j12 = oVar.f52025a;
        g2.m mVar = oVar.f52026b;
        b0 b0Var = oVar.d;
        u uVar = new u(mVar, b0Var.f12230c, b0Var.d, j10, j11, b0Var.f12229b);
        gVar.f16812m.getClass();
        gVar.f16816q.q(uVar, oVar.f52027c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        gVar.K = ((Long) oVar.f52028f).longValue() - j10;
        gVar.z(true);
    }

    public void a() {
        long j10;
        g gVar = this.f16798a;
        synchronized (z2.b.f52694b) {
            try {
                if (z2.b.f52695c) {
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
    public void l0(y2.i iVar, long j10, long j11, boolean z10) {
        this.f16798a.x((y2.o) iVar, j10, j11);
    }

    @Override
    public k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        y2.o oVar = (y2.o) iVar;
        g gVar = this.f16798a;
        ng ngVar = gVar.f16816q;
        long j12 = oVar.f52025a;
        g2.m mVar = oVar.f52026b;
        b0 b0Var = oVar.d;
        ngVar.s(new u(mVar, b0Var.f12230c, b0Var.d, j10, j11, b0Var.f12229b), oVar.f52027c, iOException, true);
        gVar.f16812m.getClass();
        gVar.y(iOException);
        return y2.l.e;
    }

    @Override
    public void z(y2.i iVar, long j10, long j11, int i10) {
    }
}
