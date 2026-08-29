package l3;

import jh.d3;
public final class l implements Runnable {
    public final int f14142a;
    public final n f14143b;
    public final m3.f f14144c;

    public l(n nVar, m3.f fVar, int i10) {
        this.f14142a = i10;
        this.f14143b = nVar;
        this.f14144c = fVar;
    }

    @Override
    public final void run() {
        switch (this.f14142a) {
            case 0:
                n nVar = this.f14143b;
                m3.f fVar = this.f14144c;
                o oVar = nVar.f14151b;
                int i10 = f5.d0.f6579a;
                k3.f fVar2 = ((j3.h0) oVar).f10477a.f10594r;
                k3.a k9 = fVar2.k();
                fVar2.l(k9, 1007, new k3.d(k9, fVar, 2));
                return;
            default:
                n nVar2 = this.f14143b;
                m3.f fVar3 = this.f14144c;
                synchronized (fVar3) {
                }
                o oVar2 = nVar2.f14151b;
                int i11 = f5.d0.f6579a;
                k3.f fVar4 = ((j3.h0) oVar2).f10477a.f10594r;
                k3.a i12 = fVar4.i((l4.c0) fVar4.d.f2121e);
                fVar4.l(i12, 1013, new d3(i12, fVar3, 20));
                return;
        }
    }
}
