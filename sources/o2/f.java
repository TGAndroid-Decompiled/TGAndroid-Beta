package o2;

import a8.xa;
import b3.s;
import j2.b0;
import java.io.IOException;
import x2.u;
public final class f implements b3.k {
    public final h f21651a;

    @Override
    public b3.i l(b3.m mVar, long j3, long j10, IOException iOException, int i7) {
        s sVar = (s) mVar;
        h hVar = this.f21651a;
        xa xaVar = hVar.f21661q;
        long j11 = sVar.f2936a;
        j2.m mVar2 = sVar.f2937b;
        b0 b0Var = sVar.d;
        xaVar.r(new u(mVar2, b0Var.f17181c, b0Var.d, j3, j10, b0Var.f17180b), sVar.f2938c, iOException, true);
        hVar.f21657m.getClass();
        hVar.y(iOException);
        return b3.p.f2931e;
    }

    @Override
    public void p(b3.m mVar, long j3, long j10, boolean z10) {
        this.f21651a.x((s) mVar, j3, j10);
    }

    @Override
    public void z(b3.m mVar, long j3, long j10) {
        s sVar = (s) mVar;
        h hVar = this.f21651a;
        long j11 = sVar.f2936a;
        j2.m mVar2 = sVar.f2937b;
        b0 b0Var = sVar.d;
        u uVar = new u(mVar2, b0Var.f17181c, b0Var.d, j3, j10, b0Var.f17180b);
        hVar.f21657m.getClass();
        hVar.f21661q.p(uVar, sVar.f2938c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        hVar.K = ((Long) sVar.f2940f).longValue() - j3;
        hVar.z(true);
    }

    @Override
    public void s(b3.m mVar, long j3, long j10, int i7) {
    }
}
