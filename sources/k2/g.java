package k2;
public final class g implements Runnable {
    public final int f14463a;
    public final n4.y f14464b;
    public final i2.g f14465c;

    public g(n4.y yVar, i2.g gVar, int i10) {
        this.f14463a = i10;
        this.f14464b = yVar;
        this.f14465c = gVar;
    }

    @Override
    public final void run() {
        switch (this.f14463a) {
            case 0:
                n4.y yVar = this.f14464b;
                i2.g gVar = this.f14465c;
                synchronized (gVar) {
                }
                String str = e2.d0.f8529a;
                j2.f fVar = ((i2.c0) ((j) yVar.f16364c)).f11618a.f11681s;
                j2.a n10 = fVar.n((u2.f0) fVar.d.f7953e);
                fVar.q(n10, 1013, new j2.c(n10, gVar, 11));
                return;
            default:
                n4.y yVar2 = this.f14464b;
                i2.g gVar2 = this.f14465c;
                String str2 = e2.d0.f8529a;
                j2.f fVar2 = ((i2.c0) ((j) yVar2.f16364c)).f11618a.f11681s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1007, new j2.c(p5, gVar2, 4));
                return;
        }
    }
}
