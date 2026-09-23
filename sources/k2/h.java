package k2;
public final class h implements Runnable {
    public final int f13281a;
    public final n4.y f13282b;
    public final k f13283c;

    public h(n4.y yVar, k kVar, int i10) {
        this.f13281a = i10;
        this.f13282b = yVar;
        this.f13283c = kVar;
    }

    @Override
    public final void run() {
        int i10 = this.f13281a;
        k kVar = this.f13283c;
        n4.y yVar = this.f13282b;
        switch (i10) {
            case 0:
                String str = e2.d0.f7871a;
                j2.f fVar = ((i2.c0) ((j) yVar.f14970c)).f10616a.f10675s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1032, new j2.e(1, p5, kVar));
                return;
            default:
                String str2 = e2.d0.f7871a;
                j2.f fVar2 = ((i2.c0) ((j) yVar.f14970c)).f10616a.f10675s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1031, new j2.c(p10, kVar, 18));
                return;
        }
    }
}
