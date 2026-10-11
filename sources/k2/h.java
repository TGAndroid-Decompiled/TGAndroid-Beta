package k2;
public final class h implements Runnable {
    public final int f14470a;
    public final n4.x f14471b;
    public final k f14472c;

    public h(n4.x xVar, k kVar, int i10) {
        this.f14470a = i10;
        this.f14471b = xVar;
        this.f14472c = kVar;
    }

    @Override
    public final void run() {
        int i10 = this.f14470a;
        k kVar = this.f14472c;
        n4.x xVar = this.f14471b;
        switch (i10) {
            case 0:
                String str = e2.d0.f8531a;
                j2.f fVar = ((i2.c0) ((j) xVar.f16659c)).f11619a.f11682s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1032, new j2.e(0, p5, kVar));
                return;
            default:
                String str2 = e2.d0.f8531a;
                j2.f fVar2 = ((i2.c0) ((j) xVar.f16659c)).f11619a.f11682s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1031, new j2.c(p10, kVar, 17));
                return;
        }
    }
}
