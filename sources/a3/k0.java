package a3;
public final class k0 implements Runnable {
    public final int f136a;
    public final n4.s f137b;
    public final i2.d f138c;

    public k0(n4.s sVar, i2.d dVar, int i10) {
        this.f136a = i10;
        this.f137b = sVar;
        this.f138c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f136a) {
            case 0:
                n4.s sVar = this.f137b;
                i2.d dVar = this.f138c;
                String str = e2.m0.f8254a;
                j2.f fVar = ((i2.a0) ((m0) sVar.f17122c)).f12309a.f12408s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1015, new j2.e(p5, dVar, 5));
                return;
            default:
                n4.s sVar2 = this.f137b;
                i2.d dVar2 = this.f138c;
                synchronized (dVar2) {
                }
                String str2 = e2.m0.f8254a;
                i2.g0 g0Var = ((i2.a0) ((m0) sVar2.f17122c)).f12309a;
                j2.f fVar2 = g0Var.f12408s;
                j2.a n10 = fVar2.n((u2.g0) fVar2.d.e);
                fVar2.q(n10, 1020, new e1.c(n10, dVar2, 26));
                g0Var.S = null;
                return;
        }
    }
}
