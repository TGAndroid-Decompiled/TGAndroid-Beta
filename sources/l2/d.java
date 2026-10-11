package l2;

import android.net.Uri;
import java.io.IOException;
import u2.t;
public final class d implements y2.g {
    public final h f15323a;

    @Override
    public void F(y2.i iVar, long j3, long j10) {
        y2.o oVar = (y2.o) iVar;
        h hVar = this.f15323a;
        long j11 = oVar.f51786a;
        Uri uri = oVar.d.f10234c;
        t tVar = new t(j10);
        hVar.f15340m.getClass();
        hVar.f15344q.q(tVar, oVar.f51788c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        hVar.L = ((Long) oVar.f51790f).longValue() - j3;
        hVar.y(true);
    }

    @Override
    public void O0(y2.i iVar, long j3, long j10, boolean z10) {
        this.f15323a.w((y2.o) iVar, j10);
    }

    public void a() {
        long j3;
        h hVar = this.f15323a;
        synchronized (z2.b.f53573b) {
            try {
                if (z2.b.f53574c) {
                    j3 = z2.b.d;
                } else {
                    j3 = -9223372036854775807L;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        hVar.L = j3;
        hVar.y(true);
    }

    @Override
    public k4.d y(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        y2.o oVar = (y2.o) iVar;
        h hVar = this.f15323a;
        a5.a aVar = hVar.f15344q;
        long j11 = oVar.f51786a;
        Uri uri = oVar.d.f10234c;
        aVar.s(new t(j10), oVar.f51788c, iOException, true);
        hVar.f15340m.getClass();
        hVar.x(iOException);
        return y2.l.f51781e;
    }

    @Override
    public void C(y2.i iVar, long j3, long j10, int i10) {
    }
}
