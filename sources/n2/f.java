package n2;

import a3.q;
import a3.t;
import b8.kg;
import i2.c0;
import java.io.IOException;
import w2.u;
public final class f implements a3.k {
    public final h f20157a;

    @Override
    public void h(a3.m mVar, long j10, long j11) {
        t tVar = (t) mVar;
        h hVar = this.f20157a;
        long j12 = tVar.f110a;
        i2.n nVar = tVar.f111b;
        c0 c0Var = tVar.d;
        u uVar = new u(nVar, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        hVar.f20163m.getClass();
        hVar.f20167q.q(uVar, tVar.f112c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        hVar.K = ((Long) tVar.f114f).longValue() - j10;
        hVar.z(true);
    }

    @Override
    public a3.i k(a3.m mVar, long j10, long j11, IOException iOException, int i3) {
        t tVar = (t) mVar;
        h hVar = this.f20157a;
        kg kgVar = hVar.f20167q;
        long j12 = tVar.f110a;
        i2.n nVar = tVar.f111b;
        c0 c0Var = tVar.d;
        kgVar.s(new u(nVar, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b), tVar.f112c, iOException, true);
        hVar.f20163m.getClass();
        hVar.y(iOException);
        return q.f105e;
    }

    @Override
    public void q0(a3.m mVar, long j10, long j11, boolean z10) {
        this.f20157a.x((t) mVar, j10, j11);
    }

    @Override
    public void M(a3.m mVar, long j10, long j11, int i3) {
    }
}
