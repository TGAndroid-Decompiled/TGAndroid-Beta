package i5;

import h5.d0;
import j3.c0;
import j3.f0;
public final class w implements Runnable {
    public final int f7336a;
    public final f7.b f7337b;
    public final n3.f f7338c;

    public w(f7.b bVar, n3.f fVar, int i10) {
        this.f7336a = i10;
        this.f7337b = bVar;
        this.f7338c = fVar;
    }

    @Override
    public final void run() {
        switch (this.f7336a) {
            case 0:
                f7.b bVar = this.f7337b;
                n3.f fVar = this.f7338c;
                synchronized (fVar) {
                }
                int i10 = d0.f6937a;
                f0 f0Var = ((c0) bVar.f6013c).f8441a;
                k3.f fVar2 = f0Var.f8561q;
                k3.a n10 = fVar2.n((o4.v) fVar2.d.e);
                fVar2.q(n10, 1020, new gg.f(n10, fVar, 18));
                f0Var.N = null;
                return;
            default:
                f7.b bVar2 = this.f7337b;
                n3.f fVar3 = this.f7338c;
                int i11 = d0.f6937a;
                k3.f fVar4 = ((c0) bVar2.f6013c).f8441a.f8561q;
                k3.a p10 = fVar4.p();
                fVar4.q(p10, 1015, new k3.c(p10, fVar3, 2));
                return;
        }
    }
}
