package k2;
public final class h implements Runnable {
    public final int f13279a;
    public final n4.y f13280b;
    public final k f13281c;

    public h(n4.y yVar, k kVar, int i10) {
        this.f13279a = i10;
        this.f13280b = yVar;
        this.f13281c = kVar;
    }

    @Override
    public final void run() {
        int i10 = this.f13279a;
        k kVar = this.f13281c;
        n4.y yVar = this.f13280b;
        switch (i10) {
            case 0:
                String str = e2.d0.f7870a;
                j2.f fVar = ((i2.c0) ((j) yVar.f15208c)).f10616a.f10675s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1032, new j2.e(p5, kVar, 1));
                return;
            default:
                String str2 = e2.d0.f7870a;
                j2.f fVar2 = ((i2.c0) ((j) yVar.f15208c)).f10616a.f10675s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1031, new j2.c(p10, kVar, 18));
                return;
        }
    }
}
