package i5;

import h5.d0;
import j3.c0;
import j3.f0;
public final class w implements Runnable {
    public final int f7318a;
    public final f7.b f7319b;
    public final n3.f f7320c;

    public w(f7.b bVar, n3.f fVar, int i10) {
        this.f7318a = i10;
        this.f7319b = bVar;
        this.f7320c = fVar;
    }

    @Override
    public final void run() {
        switch (this.f7318a) {
            case 0:
                f7.b bVar = this.f7319b;
                n3.f fVar = this.f7320c;
                synchronized (fVar) {
                }
                int i10 = d0.f6924a;
                f0 f0Var = ((c0) bVar.f6002c).f8423a;
                k3.f fVar2 = f0Var.f8543q;
                k3.a n10 = fVar2.n((o4.v) fVar2.d.e);
                fVar2.q(n10, 1020, new gg.f(n10, fVar, 18));
                f0Var.N = null;
                return;
            default:
                f7.b bVar2 = this.f7319b;
                n3.f fVar3 = this.f7320c;
                int i11 = d0.f6924a;
                k3.f fVar4 = ((c0) bVar2.f6002c).f8423a.f8543q;
                k3.a p10 = fVar4.p();
                fVar4.q(p10, 1015, new k3.c(p10, fVar3, 3));
                return;
        }
    }
}
