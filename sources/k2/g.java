package k2;
public final class g implements Runnable {
    public final int f13277a;
    public final n4.y f13278b;
    public final i2.g f13279c;

    public g(n4.y yVar, i2.g gVar, int i10) {
        this.f13277a = i10;
        this.f13278b = yVar;
        this.f13279c = gVar;
    }

    @Override
    public final void run() {
        switch (this.f13277a) {
            case 0:
                n4.y yVar = this.f13278b;
                i2.g gVar = this.f13279c;
                synchronized (gVar) {
                }
                String str = e2.d0.f7871a;
                j2.f fVar = ((i2.c0) ((j) yVar.f14970c)).f10616a.f10675s;
                j2.a n10 = fVar.n((u2.f0) fVar.d.e);
                fVar.q(n10, 1013, new j2.c(n10, gVar, 12));
                return;
            default:
                n4.y yVar2 = this.f13278b;
                i2.g gVar2 = this.f13279c;
                String str2 = e2.d0.f7871a;
                j2.f fVar2 = ((i2.c0) ((j) yVar2.f14970c)).f10616a.f10675s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1007, new j2.c(p5, gVar2, 5));
                return;
        }
    }
}
