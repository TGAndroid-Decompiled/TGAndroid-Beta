package e5;

import d5.g0;
import h3.h0;
import h3.k0;
import h3.q2;
import j4.c0;

public final class v implements Runnable {

    public final int f5300a;

    public final xe.b f5301b;

    public final k3.f f5302c;

    public v(xe.b bVar, k3.f fVar, int i10) {
        this.f5300a = i10;
        this.f5301b = bVar;
        this.f5302c = fVar;
    }

    @Override
    public final void run() {
        switch (this.f5300a) {
            case 0:
                xe.b bVar = this.f5301b;
                k3.f fVar = this.f5302c;
                synchronized (fVar) {
                }
                h0 h0Var = (h0) bVar.f49393c;
                int i10 = g0.f4795a;
                k0 k0Var = h0Var.f7870a;
                i3.f fVar2 = k0Var.f7987r;
                i3.a aVarI = fVar2.i((c0) fVar2.d.f4605e);
                fVar2.l(aVarI, 1020, new h3.x(aVarI, fVar, 16));
                k0Var.P = null;
                break;
            default:
                xe.b bVar2 = this.f5301b;
                k3.f fVar3 = this.f5302c;
                h0 h0Var2 = (h0) bVar2.f49393c;
                int i11 = g0.f4795a;
                i3.f fVar4 = h0Var2.f7870a.f7987r;
                i3.a aVarK = fVar4.k();
                fVar4.l(aVarK, 1015, new q2(aVarK, fVar3, 23));
                break;
        }
    }
}
