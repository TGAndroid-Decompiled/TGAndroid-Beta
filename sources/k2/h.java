package k2;
public final class h implements Runnable {
    public final int f13293a;
    public final n4.y f13294b;
    public final i2.g f13295c;

    public h(n4.y yVar, i2.g gVar, int i10) {
        this.f13293a = i10;
        this.f13294b = yVar;
        this.f13295c = gVar;
    }

    @Override
    public final void run() {
        switch (this.f13293a) {
            case 0:
                n4.y yVar = this.f13294b;
                i2.g gVar = this.f13295c;
                synchronized (gVar) {
                }
                String str = e2.d0.f7887a;
                j2.f fVar = ((i2.b0) ((k) yVar.f15231b)).f10625a.f10675s;
                j2.a n10 = fVar.n((u2.f0) fVar.d.e);
                fVar.q(n10, 1013, new j2.c(n10, gVar, 13));
                return;
            default:
                n4.y yVar2 = this.f13294b;
                i2.g gVar2 = this.f13295c;
                String str2 = e2.d0.f7887a;
                j2.f fVar2 = ((i2.b0) ((k) yVar2.f15231b)).f10625a.f10675s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1007, new j2.c(p5, gVar2, 6));
                return;
        }
    }
}
