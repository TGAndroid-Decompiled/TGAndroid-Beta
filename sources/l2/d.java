package l2;

import android.net.Uri;
import java.io.IOException;
import u2.u;
public final class d implements y2.i {
    public final i f12708a;

    @Override
    public void C(y2.k kVar, long j3, long j10, boolean z10) {
        this.f12708a.w((y2.q) kVar, j10);
    }

    public void a() {
        long j3;
        i iVar = this.f12708a;
        synchronized (z2.b.f47194b) {
            try {
                if (z2.b.f47195c) {
                    j3 = z2.b.d;
                } else {
                    j3 = -9223372036854775807L;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        iVar.L = j3;
        iVar.y(true);
    }

    @Override
    public k4.d k(y2.k kVar, long j3, long j10, IOException iOException, int i10) {
        y2.q qVar = (y2.q) kVar;
        i iVar = this.f12708a;
        a5.a aVar = iVar.f12730q;
        long j11 = qVar.f46448a;
        Uri uri = qVar.d.f8480c;
        aVar.q(new u(j10), qVar.f46450c, iOException, true);
        iVar.f12726m.getClass();
        iVar.x(iOException);
        return y2.n.e;
    }

    @Override
    public void p(y2.k kVar, long j3, long j10) {
        y2.q qVar = (y2.q) kVar;
        i iVar = this.f12708a;
        long j11 = qVar.f46448a;
        Uri uri = qVar.d.f8480c;
        u uVar = new u(j10);
        iVar.f12726m.getClass();
        iVar.f12730q.o(uVar, qVar.f46450c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        iVar.L = ((Long) qVar.f46451f).longValue() - j3;
        iVar.y(true);
    }

    @Override
    public void l(y2.k kVar, long j3, long j10, int i10) {
    }
}
