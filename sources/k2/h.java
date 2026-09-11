package k2;
public final class h implements Runnable {
    public final int f14579a;
    public final n4.y f14580b;
    public final k f14581c;

    public h(n4.y yVar, k kVar, int i10) {
        this.f14579a = i10;
        this.f14580b = yVar;
        this.f14581c = kVar;
    }

    @Override
    public final void run() {
        int i10 = this.f14579a;
        k kVar = this.f14581c;
        n4.y yVar = this.f14580b;
        switch (i10) {
            case 0:
                String str = e2.d0.f8737a;
                j2.f fVar = ((i2.c0) ((j) yVar.f16497c)).f11471a.f11533s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1032, new j2.e(0, p5, kVar));
                return;
            default:
                String str2 = e2.d0.f8737a;
                j2.f fVar2 = ((i2.c0) ((j) yVar.f16497c)).f11471a.f11533s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1031, new j2.c(p10, kVar, 17));
                return;
        }
    }
}
