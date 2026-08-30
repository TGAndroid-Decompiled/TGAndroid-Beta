package i5;

import h5.d0;
import j3.c0;
public final class u implements Runnable {
    public final int f7330a = 0;
    public final f7.b f7331b;
    public final long f7332c;
    public final int d;

    public u(f7.b bVar, int i10, long j10) {
        this.f7331b = bVar;
        this.d = i10;
        this.f7332c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f7330a;
        int i11 = this.d;
        long j10 = this.f7332c;
        f7.b bVar = this.f7331b;
        switch (i10) {
            case 0:
                int i12 = d0.f6937a;
                k3.f fVar = ((c0) bVar.f6013c).f8441a.f8561q;
                k3.a n10 = fVar.n((o4.v) fVar.d.e);
                fVar.q(n10, 1018, new k3.c(n10, i11, j10));
                return;
            default:
                int i13 = d0.f6937a;
                k3.f fVar2 = ((c0) bVar.f6013c).f8441a.f8561q;
                k3.a n11 = fVar2.n((o4.v) fVar2.d.e);
                fVar2.q(n11, 1021, new k3.c(n11, j10, i11));
                return;
        }
    }

    public u(f7.b bVar, long j10, int i10) {
        this.f7331b = bVar;
        this.f7332c = j10;
        this.d = i10;
    }
}
