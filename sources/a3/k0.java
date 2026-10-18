package a3;
public final class k0 implements Runnable {
    public final int f136a;
    public final n4.s f137b;
    public final i2.e f138c;

    public k0(n4.s sVar, i2.e eVar, int i10) {
        this.f136a = i10;
        this.f137b = sVar;
        this.f138c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f136a) {
            case 0:
                n4.s sVar = this.f137b;
                i2.e eVar = this.f138c;
                String str = e2.m0.f8255a;
                j2.f fVar = ((i2.b0) ((m0) sVar.f17129c)).f12324a.f12412s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1015, new j2.e(p5, eVar, 5));
                return;
            default:
                n4.s sVar2 = this.f137b;
                i2.e eVar2 = this.f138c;
                synchronized (eVar2) {
                }
                String str2 = e2.m0.f8255a;
                i2.h0 h0Var = ((i2.b0) ((m0) sVar2.f17129c)).f12324a;
                j2.f fVar2 = h0Var.f12412s;
                j2.a n10 = fVar2.n((u2.f0) fVar2.d.e);
                fVar2.q(n10, 1020, new e1.c(n10, eVar2, 26));
                h0Var.S = null;
                return;
        }
    }
}
