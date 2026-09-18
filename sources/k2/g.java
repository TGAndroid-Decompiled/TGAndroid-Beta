package k2;
public final class g implements Runnable {
    public final int f13289a;
    public final n4.y f13290b;
    public final i2.g f13291c;

    public g(n4.y yVar, i2.g gVar, int i10) {
        this.f13289a = i10;
        this.f13290b = yVar;
        this.f13291c = gVar;
    }

    @Override
    public final void run() {
        switch (this.f13289a) {
            case 0:
                n4.y yVar = this.f13290b;
                i2.g gVar = this.f13291c;
                synchronized (gVar) {
                }
                String str = e2.d0.f7887a;
                j2.f fVar = ((i2.b0) ((j) yVar.f15180c)).f10624a.f10674s;
                j2.a n10 = fVar.n((u2.f0) fVar.d.e);
                fVar.q(n10, 1013, new j2.c(n10, gVar, 13));
                return;
            default:
                n4.y yVar2 = this.f13290b;
                i2.g gVar2 = this.f13291c;
                String str2 = e2.d0.f7887a;
                j2.f fVar2 = ((i2.b0) ((j) yVar2.f15180c)).f10624a.f10674s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1007, new j2.c(p5, gVar2, 6));
                return;
        }
    }
}
