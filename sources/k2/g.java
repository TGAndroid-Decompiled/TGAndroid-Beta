package k2;
public final class g implements Runnable {
    public final int f13290a;
    public final n4.y f13291b;
    public final i2.g f13292c;

    public g(n4.y yVar, i2.g gVar, int i10) {
        this.f13290a = i10;
        this.f13291b = yVar;
        this.f13292c = gVar;
    }

    @Override
    public final void run() {
        switch (this.f13290a) {
            case 0:
                n4.y yVar = this.f13291b;
                i2.g gVar = this.f13292c;
                synchronized (gVar) {
                }
                String str = e2.d0.f7888a;
                j2.f fVar = ((i2.b0) ((j) yVar.f15218b)).f10625a.f10675s;
                j2.a n10 = fVar.n((u2.f0) fVar.d.e);
                fVar.q(n10, 1013, new j2.c(n10, gVar, 13));
                return;
            default:
                n4.y yVar2 = this.f13291b;
                i2.g gVar2 = this.f13292c;
                String str2 = e2.d0.f7888a;
                j2.f fVar2 = ((i2.b0) ((j) yVar2.f15218b)).f10625a.f10675s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1007, new j2.c(p5, gVar2, 6));
                return;
        }
    }
}
