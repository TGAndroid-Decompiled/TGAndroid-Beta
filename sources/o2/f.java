package o2;

import a8.wa;
import b3.r;
import j2.c0;
import java.io.IOException;
import x2.u;
public final class f implements b3.j {
    public final h f20738a;

    @Override
    public b3.i o0(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        r rVar = (r) lVar;
        h hVar = this.f20738a;
        wa waVar = hVar.f20748q;
        long j11 = rVar.f2965a;
        j2.m mVar = rVar.f2966b;
        c0 c0Var = rVar.d;
        waVar.r(new u(mVar, c0Var.f16417c, c0Var.d, j3, j10, c0Var.f16416b), rVar.f2967c, iOException, true);
        hVar.f20744m.getClass();
        hVar.y(iOException);
        return b3.o.f2960e;
    }

    @Override
    public void o1(b3.l lVar, long j3, long j10) {
        r rVar = (r) lVar;
        h hVar = this.f20738a;
        long j11 = rVar.f2965a;
        j2.m mVar = rVar.f2966b;
        c0 c0Var = rVar.d;
        u uVar = new u(mVar, c0Var.f16417c, c0Var.d, j3, j10, c0Var.f16416b);
        hVar.f20744m.getClass();
        hVar.f20748q.p(uVar, rVar.f2967c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        hVar.K = ((Long) rVar.f2969f).longValue() - j3;
        hVar.z(true);
    }

    @Override
    public void q0(b3.l lVar, long j3, long j10, boolean z9) {
        this.f20738a.x((r) lVar, j3, j10);
    }

    @Override
    public void M0(b3.l lVar, long j3, long j10, int i7) {
    }
}
