package o2;

import a8.xa;
import b3.s;
import j2.b0;
import java.io.IOException;
import x2.u;
public final class f implements b3.k {
    public final h f21626a;

    @Override
    public b3.i l(b3.m mVar, long j3, long j10, IOException iOException, int i7) {
        s sVar = (s) mVar;
        h hVar = this.f21626a;
        xa xaVar = hVar.f21636q;
        long j11 = sVar.f2916a;
        j2.m mVar2 = sVar.f2917b;
        b0 b0Var = sVar.d;
        xaVar.r(new u(mVar2, b0Var.f17156c, b0Var.d, j3, j10, b0Var.f17155b), sVar.f2918c, iOException, true);
        hVar.f21632m.getClass();
        hVar.y(iOException);
        return b3.p.f2911e;
    }

    @Override
    public void p(b3.m mVar, long j3, long j10, boolean z10) {
        this.f21626a.x((s) mVar, j3, j10);
    }

    @Override
    public void z(b3.m mVar, long j3, long j10) {
        s sVar = (s) mVar;
        h hVar = this.f21626a;
        long j11 = sVar.f2916a;
        j2.m mVar2 = sVar.f2917b;
        b0 b0Var = sVar.d;
        u uVar = new u(mVar2, b0Var.f17156c, b0Var.d, j3, j10, b0Var.f17155b);
        hVar.f21632m.getClass();
        hVar.f21636q.p(uVar, sVar.f2918c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        hVar.K = ((Long) sVar.f2920f).longValue() - j3;
        hVar.z(true);
    }

    @Override
    public void s(b3.m mVar, long j3, long j10, int i7) {
    }
}
