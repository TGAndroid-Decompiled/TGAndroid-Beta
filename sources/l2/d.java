package l2;

import android.net.Uri;
import java.io.IOException;
import u2.t;
import y2.p;
public final class d implements y2.h {
    public final g f15195a;

    public void a() {
        long j3;
        g gVar = this.f15195a;
        synchronized (z2.c.f50680b) {
            try {
                if (z2.c.f50681c) {
                    j3 = z2.c.d;
                } else {
                    j3 = -9223372036854775807L;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        gVar.L = j3;
        gVar.y(true);
    }

    @Override
    public k4.d g(y2.j jVar, long j3, long j10, IOException iOException, int i10) {
        p pVar = (p) jVar;
        g gVar = this.f15195a;
        a5.a aVar = gVar.f15214q;
        long j11 = pVar.f49521a;
        Uri uri = pVar.d.f10298c;
        aVar.q(new t(j10), pVar.f49523c, iOException, true);
        gVar.f15210m.getClass();
        gVar.x(iOException);
        return y2.m.f49516e;
    }

    @Override
    public void i(y2.j jVar, long j3, long j10) {
        p pVar = (p) jVar;
        g gVar = this.f15195a;
        long j11 = pVar.f49521a;
        Uri uri = pVar.d.f10298c;
        t tVar = new t(j10);
        gVar.f15210m.getClass();
        gVar.f15214q.o(tVar, pVar.f49523c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        gVar.L = ((Long) pVar.f49525f).longValue() - j3;
        gVar.y(true);
    }

    @Override
    public void w(y2.j jVar, long j3, long j10, boolean z10) {
        this.f15195a.w((p) jVar, j10);
    }

    @Override
    public void h(y2.j jVar, long j3, long j10, int i10) {
    }
}
