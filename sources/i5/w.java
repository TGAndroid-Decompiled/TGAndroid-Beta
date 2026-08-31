package i5;

import h5.d0;
import j3.c0;
import j3.f0;
public final class w implements Runnable {
    public final int f7891a;
    public final f7.b f7892b;
    public final n3.f f7893c;

    public w(f7.b bVar, n3.f fVar, int i10) {
        this.f7891a = i10;
        this.f7892b = bVar;
        this.f7893c = fVar;
    }

    @Override
    public final void run() {
        switch (this.f7891a) {
            case 0:
                f7.b bVar = this.f7892b;
                n3.f fVar = this.f7893c;
                synchronized (fVar) {
                }
                int i10 = d0.f7237a;
                f0 f0Var = ((c0) bVar.f6121c).f9000a;
                k3.f fVar2 = f0Var.f9128q;
                k3.a n10 = fVar2.n((o4.v) fVar2.d.f158e);
                fVar2.q(n10, 1020, new hg.f(n10, fVar, 18));
                f0Var.N = null;
                return;
            default:
                f7.b bVar2 = this.f7892b;
                n3.f fVar3 = this.f7893c;
                int i11 = d0.f7237a;
                k3.f fVar4 = ((c0) bVar2.f6121c).f9000a.f9128q;
                k3.a p10 = fVar4.p();
                fVar4.q(p10, 1015, new k3.c(p10, fVar3, 2));
                return;
        }
    }
}
