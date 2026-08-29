package l3;

import jh.d3;
public final class k implements Runnable {
    public final int f14110a;
    public final n f14111b;
    public final Exception f14112c;

    public k(n nVar, Exception exc, int i10) {
        this.f14110a = i10;
        this.f14111b = nVar;
        this.f14112c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f14110a;
        Exception exc = this.f14112c;
        n nVar = this.f14111b;
        switch (i10) {
            case 0:
                o oVar = nVar.f14151b;
                int i11 = f5.d0.f6579a;
                k3.f fVar = ((j3.h0) oVar).f10477a.f10594r;
                k3.a k9 = fVar.k();
                fVar.l(k9, 1029, new d3(k9, exc, 2));
                return;
            default:
                o oVar2 = nVar.f14151b;
                int i12 = f5.d0.f6579a;
                k3.f fVar2 = ((j3.h0) oVar2).f10477a.f10594r;
                k3.a k10 = fVar2.k();
                fVar2.l(k10, 1014, new d3(k10, exc, 29));
                return;
        }
    }
}
