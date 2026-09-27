package k2;
public final class h implements Runnable {
    public final int f13282a;
    public final n4.y f13283b;
    public final k f13284c;

    public h(n4.y yVar, k kVar, int i10) {
        this.f13282a = i10;
        this.f13283b = yVar;
        this.f13284c = kVar;
    }

    @Override
    public final void run() {
        int i10 = this.f13282a;
        k kVar = this.f13284c;
        n4.y yVar = this.f13283b;
        switch (i10) {
            case 0:
                String str = e2.d0.f7872a;
                j2.f fVar = ((i2.c0) ((j) yVar.f15258c)).f10619a.f10678s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1032, new j2.e(p5, kVar, 2));
                return;
            default:
                String str2 = e2.d0.f7872a;
                j2.f fVar2 = ((i2.c0) ((j) yVar.f15258c)).f10619a.f10678s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1031, new j2.c(p10, kVar, 19));
                return;
        }
    }
}
