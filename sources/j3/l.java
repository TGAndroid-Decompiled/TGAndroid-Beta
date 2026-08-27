package j3;

import h3.q2;

public final class l implements Runnable {

    public final int f12384a;

    public final n f12385b;

    public final k3.f f12386c;

    public l(n nVar, k3.f fVar, int i10) {
        this.f12384a = i10;
        this.f12385b = nVar;
        this.f12386c = fVar;
    }

    @Override
    public final void run() {
        switch (this.f12384a) {
            case 0:
                n nVar = this.f12385b;
                k3.f fVar = this.f12386c;
                o oVar = nVar.f12392b;
                int i10 = d5.g0.f4795a;
                i3.f fVar2 = ((h3.h0) oVar).f7870a.f7987r;
                i3.a aVarK = fVar2.k();
                fVar2.l(aVarK, 1007, new i3.d(aVarK, fVar, 9));
                break;
            default:
                n nVar2 = this.f12385b;
                k3.f fVar3 = this.f12386c;
                synchronized (fVar3) {
                }
                o oVar2 = nVar2.f12392b;
                int i11 = d5.g0.f4795a;
                i3.f fVar4 = ((h3.h0) oVar2).f7870a.f7987r;
                i3.a aVarI = fVar4.i((j4.c0) fVar4.d.f4605e);
                fVar4.l(aVarI, 1013, new q2(aVarI, fVar3, 27));
                break;
        }
    }
}
