package l2;

import g2.b0;
import java.io.IOException;
import u2.u;
public final class d implements y2.g {
    public final h f15835a;

    public d(h hVar) {
        this.f15835a = hVar;
    }

    @Override
    public void J(y2.i iVar, long j10, long j11, boolean z10) {
        this.f15835a.x((y2.o) iVar, j10, j11);
    }

    public void a() {
        long j10;
        h hVar = this.f15835a;
        synchronized (z2.c.f50628b) {
            try {
                if (z2.c.f50629c) {
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
        h hVar = this.f15835a;
        a5.a aVar = hVar.f15855q;
        long j12 = oVar.f49927a;
        g2.m mVar = oVar.f49928b;
        b0 b0Var = oVar.d;
        aVar.t(new u(mVar, b0Var.f10766c, b0Var.d, j10, j11, b0Var.f10765b), oVar.f49929c, iOException, true);
        hVar.f15851m.getClass();
        hVar.y(iOException);
        return y2.l.e;
    }

    @Override
    public void k(y2.i iVar, long j10, long j11) {
        y2.o oVar = (y2.o) iVar;
        h hVar = this.f15835a;
        long j12 = oVar.f49927a;
        g2.m mVar = oVar.f49928b;
        b0 b0Var = oVar.d;
        u uVar = new u(mVar, b0Var.f10766c, b0Var.d, j10, j11, b0Var.f10765b);
        hVar.f15851m.getClass();
        hVar.f15855q.r(uVar, oVar.f49929c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        hVar.K = ((Long) oVar.f49930f).longValue() - j10;
        hVar.z(true);
    }

    @Override
    public void h(y2.i iVar, long j10, long j11, int i10) {
    }
}
