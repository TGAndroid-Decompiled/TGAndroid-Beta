package o2;

import a8.xa;
import b3.r;
import j2.b0;
import java.io.IOException;
import x2.t;
public final class f implements b3.j {
    public final h f21259a;

    @Override
    public b3.i k(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        r rVar = (r) lVar;
        h hVar = this.f21259a;
        xa xaVar = hVar.f21269q;
        long j11 = rVar.f2919a;
        j2.m mVar = rVar.f2920b;
        b0 b0Var = rVar.d;
        xaVar.q(new t(mVar, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b), rVar.f2921c, iOException, true);
        hVar.f21265m.getClass();
        hVar.y(iOException);
        return b3.o.f2914e;
    }

    @Override
    public void m(b3.l lVar, long j3, long j10, boolean z10) {
        this.f21259a.x((r) lVar, j3, j10);
    }

    @Override
    public void w(b3.l lVar, long j3, long j10) {
        r rVar = (r) lVar;
        h hVar = this.f21259a;
        long j11 = rVar.f2919a;
        j2.m mVar = rVar.f2920b;
        b0 b0Var = rVar.d;
        t tVar = new t(mVar, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        hVar.f21265m.getClass();
        hVar.f21269q.o(tVar, rVar.f2921c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        hVar.K = ((Long) rVar.f2923f).longValue() - j3;
        hVar.z(true);
    }

    @Override
    public void r(b3.l lVar, long j3, long j10, int i7) {
    }
}
