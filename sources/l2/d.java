package l2;

import android.net.Uri;
import java.io.IOException;
import u2.t;
public final class d implements y2.g {
    public final h f15256a;

    public void a() {
        long j3;
        h hVar = this.f15256a;
        synchronized (z2.b.f52357b) {
            try {
                if (z2.b.f52358c) {
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
    public k4.d s(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        y2.o oVar = (y2.o) iVar;
        h hVar = this.f15256a;
        a5.a aVar = hVar.f15277q;
        long j11 = oVar.f50411a;
        Uri uri = oVar.d.f10162c;
        aVar.r(new t(j10), oVar.f50413c, iOException, true);
        hVar.f15273m.getClass();
        hVar.x(iOException);
        return y2.l.f50406e;
    }

    @Override
    public void v(y2.i iVar, long j3, long j10) {
        y2.o oVar = (y2.o) iVar;
        h hVar = this.f15256a;
        long j11 = oVar.f50411a;
        Uri uri = oVar.d.f10162c;
        t tVar = new t(j10);
        hVar.f15273m.getClass();
        hVar.f15277q.p(tVar, oVar.f50413c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        hVar.L = ((Long) oVar.f50415f).longValue() - j3;
        hVar.y(true);
    }

    @Override
    public void x0(y2.i iVar, long j3, long j10, boolean z10) {
        this.f15256a.w((y2.o) iVar, j10);
    }

    @Override
    public void t(y2.i iVar, long j3, long j10, int i10) {
    }
}
