package k2;
public final class g implements Runnable {
    public final int f14465a;
    public final n4.x f14466b;
    public final i2.g f14467c;

    public g(n4.x xVar, i2.g gVar, int i10) {
        this.f14465a = i10;
        this.f14466b = xVar;
        this.f14467c = gVar;
    }

    @Override
    public final void run() {
        switch (this.f14465a) {
            case 0:
                n4.x xVar = this.f14466b;
                i2.g gVar = this.f14467c;
                synchronized (gVar) {
                }
                String str = e2.d0.f8531a;
                j2.f fVar = ((i2.c0) ((j) xVar.f16659c)).f11619a.f11682s;
                j2.a n10 = fVar.n((u2.f0) fVar.d.f7956e);
                fVar.q(n10, 1013, new j2.c(n10, gVar, 11));
                return;
            default:
                n4.x xVar2 = this.f14466b;
                i2.g gVar2 = this.f14467c;
                String str2 = e2.d0.f8531a;
                j2.f fVar2 = ((i2.c0) ((j) xVar2.f16659c)).f11619a.f11682s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1007, new j2.c(p5, gVar2, 4));
                return;
        }
    }
}
