package a3;
public final class j0 implements Runnable {
    public final int f143a;
    public final of.b f144b;
    public final i2.g f145c;

    public j0(of.b bVar, i2.g gVar, int i10) {
        this.f143a = i10;
        this.f144b = bVar;
        this.f145c = gVar;
    }

    @Override
    public final void run() {
        switch (this.f143a) {
            case 0:
                of.b bVar = this.f144b;
                i2.g gVar = this.f145c;
                String str = e2.d0.f8538a;
                j2.f fVar = ((i2.c0) ((l0) bVar.f17163c)).f11570a.f11633s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1015, new j2.c(p5, gVar, 22));
                return;
            default:
                of.b bVar2 = this.f144b;
                i2.g gVar2 = this.f145c;
                synchronized (gVar2) {
                }
                String str2 = e2.d0.f8538a;
                i2.f0 f0Var = ((i2.c0) ((l0) bVar2.f17163c)).f11570a;
                j2.f fVar2 = f0Var.f11633s;
                j2.a n10 = fVar2.n((u2.f0) fVar2.d.f7908e);
                fVar2.q(n10, 1020, new ei.f(n10, gVar2, 25));
                f0Var.Q = null;
                return;
        }
    }
}
