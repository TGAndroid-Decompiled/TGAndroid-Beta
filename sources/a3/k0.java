package a3;
public final class k0 implements Runnable {
    public final int f136a;
    public final n4.s f137b;
    public final i2.f f138c;

    public k0(n4.s sVar, i2.f fVar, int i10) {
        this.f136a = i10;
        this.f137b = sVar;
        this.f138c = fVar;
    }

    @Override
    public final void run() {
        switch (this.f136a) {
            case 0:
                n4.s sVar = this.f137b;
                i2.f fVar = this.f138c;
                String str = e2.m0.f8254a;
                j2.f fVar2 = ((i2.c0) ((m0) sVar.f17128c)).f12327a.f12415s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1015, new j2.e(p5, fVar, 5));
                return;
            default:
                n4.s sVar2 = this.f137b;
                i2.f fVar3 = this.f138c;
                synchronized (fVar3) {
                }
                String str2 = e2.m0.f8254a;
                i2.i0 i0Var = ((i2.c0) ((m0) sVar2.f17128c)).f12327a;
                j2.f fVar4 = i0Var.f12415s;
                j2.a n10 = fVar4.n((u2.g0) fVar4.d.e);
                fVar4.q(n10, 1020, new e1.c(n10, fVar3, 26));
                i0Var.S = null;
                return;
        }
    }
}
