package i5;

import h5.d0;
import j3.c0;
public final class u implements Runnable {
    public final int f7312a = 0;
    public final f7.b f7313b;
    public final long f7314c;
    public final int d;

    public u(f7.b bVar, int i10, long j10) {
        this.f7313b = bVar;
        this.d = i10;
        this.f7314c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f7312a;
        int i11 = this.d;
        long j10 = this.f7314c;
        f7.b bVar = this.f7313b;
        switch (i10) {
            case 0:
                int i12 = d0.f6924a;
                k3.f fVar = ((c0) bVar.f6002c).f8423a.f8543q;
                k3.a n10 = fVar.n((o4.v) fVar.d.e);
                fVar.q(n10, 1018, new k3.c(n10, i11, j10));
                return;
            default:
                int i13 = d0.f6924a;
                k3.f fVar2 = ((c0) bVar.f6002c).f8423a.f8543q;
                k3.a n11 = fVar2.n((o4.v) fVar2.d.e);
                fVar2.q(n11, 1021, new k3.c(n11, j10, i11));
                return;
        }
    }

    public u(f7.b bVar, long j10, int i10) {
        this.f7313b = bVar;
        this.f7314c = j10;
        this.d = i10;
    }
}
