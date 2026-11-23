package o2;

import a8.xa;
import b3.s;
import j2.b0;
import java.io.IOException;
import x2.u;
public final class f implements b3.k {
    public final h f21716a;

    @Override
    public b3.i k(b3.m mVar, long j3, long j10, IOException iOException, int i7) {
        s sVar = (s) mVar;
        h hVar = this.f21716a;
        xa xaVar = hVar.f21726q;
        long j11 = sVar.f2888a;
        j2.m mVar2 = sVar.f2889b;
        b0 b0Var = sVar.d;
        xaVar.q(new u(mVar2, b0Var.f17244c, b0Var.d, j3, j10, b0Var.f17243b), sVar.f2890c, iOException, true);
        hVar.f21722m.getClass();
        hVar.y(iOException);
        return b3.p.f2883e;
    }

    @Override
    public void m(b3.m mVar, long j3, long j10, boolean z10) {
        this.f21716a.x((s) mVar, j3, j10);
    }

    @Override
    public void x(b3.m mVar, long j3, long j10) {
        s sVar = (s) mVar;
        h hVar = this.f21716a;
        long j11 = sVar.f2888a;
        j2.m mVar2 = sVar.f2889b;
        b0 b0Var = sVar.d;
        u uVar = new u(mVar2, b0Var.f17244c, b0Var.d, j3, j10, b0Var.f17243b);
        hVar.f21722m.getClass();
        hVar.f21726q.o(uVar, sVar.f2890c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        hVar.K = ((Long) sVar.f2892f).longValue() - j3;
        hVar.z(true);
    }

    @Override
    public void t(b3.m mVar, long j3, long j10, int i7) {
    }
}
