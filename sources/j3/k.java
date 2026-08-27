package j3;

import h3.q2;

public final class k implements Runnable {

    public final int f12380a;

    public final n f12381b;

    public final Exception f12382c;

    public k(n nVar, Exception exc, int i10) {
        this.f12380a = i10;
        this.f12381b = nVar;
        this.f12382c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f12380a;
        Exception exc = this.f12382c;
        n nVar = this.f12381b;
        switch (i10) {
            case 0:
                o oVar = nVar.f12392b;
                int i11 = d5.g0.f4795a;
                i3.f fVar = ((h3.h0) oVar).f7870a.f7987r;
                i3.a aVarK = fVar.k();
                fVar.l(aVarK, 1029, new q2(aVarK, exc, 9));
                break;
            default:
                o oVar2 = nVar.f12392b;
                int i12 = d5.g0.f4795a;
                i3.f fVar2 = ((h3.h0) oVar2).f7870a.f7987r;
                i3.a aVarK2 = fVar2.k();
                fVar2.l(aVarK2, 1014, new i3.d(aVarK2, exc, 6));
                break;
        }
    }
}
