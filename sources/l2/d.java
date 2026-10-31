package l2;

import g2.c0;
import java.io.IOException;
import u2.u;
public final class d implements y2.g {
    public final h f11577a;

    @Override
    public void M(y2.i iVar, long j10, long j11, boolean z10) {
        this.f11577a.x((y2.o) iVar, j10, j11);
    }

    public void a() {
        long j10;
        h hVar = this.f11577a;
        synchronized (z2.b.f54546b) {
            try {
                if (z2.b.f54547c) {
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
    public k4.d l(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        y2.o oVar = (y2.o) iVar;
        h hVar = this.f11577a;
        a5.a aVar = hVar.f11597q;
        long j12 = oVar.f54167a;
        g2.n nVar = oVar.f54168b;
        c0 c0Var = oVar.d;
        aVar.s(new u(nVar, c0Var.f7284c, c0Var.d, j10, j11, c0Var.f7283b), oVar.f54169c, iOException, true);
        hVar.f11593m.getClass();
        hVar.y(iOException);
        return y2.l.e;
    }

    @Override
    public void o(y2.i iVar, long j10, long j11) {
        y2.o oVar = (y2.o) iVar;
        h hVar = this.f11577a;
        long j12 = oVar.f54167a;
        g2.n nVar = oVar.f54168b;
        c0 c0Var = oVar.d;
        u uVar = new u(nVar, c0Var.f7284c, c0Var.d, j10, j11, c0Var.f7283b);
        hVar.f11593m.getClass();
        hVar.f11597q.q(uVar, oVar.f54169c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        hVar.K = ((Long) oVar.f54170f).longValue() - j10;
        hVar.z(true);
    }

    @Override
    public void n(y2.i iVar, long j10, long j11, int i10) {
    }
}
