package a3;

import ei.d5;
public final class j0 implements Runnable {
    public final int f129a;
    public final of.b f130b;
    public final i2.g f131c;

    public j0(of.b bVar, i2.g gVar, int i10) {
        this.f129a = i10;
        this.f130b = bVar;
        this.f131c = gVar;
    }

    @Override
    public final void run() {
        switch (this.f129a) {
            case 0:
                of.b bVar = this.f130b;
                i2.g gVar = this.f131c;
                String str = e2.d0.f7883a;
                j2.f fVar = ((i2.b0) ((l0) bVar.f15512c)).f10621a.f10671s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1015, new j2.c(p5, gVar, 22));
                return;
            default:
                of.b bVar2 = this.f130b;
                i2.g gVar2 = this.f131c;
                synchronized (gVar2) {
                }
                String str2 = e2.d0.f7883a;
                i2.e0 e0Var = ((i2.b0) ((l0) bVar2.f15512c)).f10621a;
                j2.f fVar2 = e0Var.f10671s;
                j2.a n10 = fVar2.n((u2.f0) fVar2.d.e);
                fVar2.q(n10, 1020, new d5(n10, gVar2, 25));
                e0Var.Q = null;
                return;
        }
    }
}
