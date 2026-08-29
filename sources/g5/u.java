package g5;

import f5.d0;
import j3.h0;
import jh.d3;
import l4.c0;
public final class u implements Runnable {
    public final int f7092a = 0;
    public final ze.b f7093b;
    public final long f7094c;
    public final int d;

    public u(ze.b bVar, int i10, long j10) {
        this.f7093b = bVar;
        this.d = i10;
        this.f7094c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f7092a;
        int i11 = this.d;
        long j10 = this.f7094c;
        ze.b bVar = this.f7093b;
        switch (i10) {
            case 0:
                int i12 = d0.f6579a;
                k3.f fVar = ((h0) bVar.f50825b).f10477a.f10594r;
                k3.a i13 = fVar.i((c0) fVar.d.f2121e);
                fVar.l(i13, 1018, new d3(i11, j10, i13));
                return;
            default:
                int i14 = d0.f6579a;
                k3.f fVar2 = ((h0) bVar.f50825b).f10477a.f10594r;
                k3.a i15 = fVar2.i((c0) fVar2.d.f2121e);
                fVar2.l(i15, 1021, new k3.d(i11, j10, i15));
                return;
        }
    }

    public u(ze.b bVar, long j10, int i10) {
        this.f7093b = bVar;
        this.f7094c = j10;
        this.d = i10;
    }
}
