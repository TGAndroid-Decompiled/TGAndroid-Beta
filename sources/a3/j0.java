package a3;

import ei.d5;
public final class j0 implements Runnable {
    public final int f131a;
    public final of.b f132b;
    public final i2.g f133c;

    public j0(of.b bVar, i2.g gVar, int i10) {
        this.f131a = i10;
        this.f132b = bVar;
        this.f133c = gVar;
    }

    @Override
    public final void run() {
        switch (this.f131a) {
            case 0:
                of.b bVar = this.f132b;
                i2.g gVar = this.f133c;
                String str = e2.d0.f7870a;
                j2.f fVar = ((i2.c0) ((l0) bVar.f15679c)).f10616a.f10675s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1015, new j2.c(p5, gVar, 21));
                return;
            default:
                of.b bVar2 = this.f132b;
                i2.g gVar2 = this.f133c;
                synchronized (gVar2) {
                }
                String str2 = e2.d0.f7870a;
                i2.f0 f0Var = ((i2.c0) ((l0) bVar2.f15679c)).f10616a;
                j2.f fVar2 = f0Var.f10675s;
                j2.a n10 = fVar2.n((u2.f0) fVar2.d.e);
                fVar2.q(n10, 1020, new d5(n10, gVar2, 24));
                f0Var.Q = null;
                return;
        }
    }
}
