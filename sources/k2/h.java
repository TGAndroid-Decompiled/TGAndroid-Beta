package k2;
public final class h implements Runnable {
    public final int f13291a;
    public final n4.y f13292b;
    public final k f13293c;

    public h(n4.y yVar, k kVar, int i10) {
        this.f13291a = i10;
        this.f13292b = yVar;
        this.f13293c = kVar;
    }

    @Override
    public final void run() {
        int i10 = this.f13291a;
        k kVar = this.f13293c;
        n4.y yVar = this.f13292b;
        switch (i10) {
            case 0:
                String str = e2.d0.f7883a;
                j2.f fVar = ((i2.b0) ((j) yVar.f14995c)).f10621a.f10671s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1032, new j2.e(2, p5, kVar));
                return;
            default:
                String str2 = e2.d0.f7883a;
                j2.f fVar2 = ((i2.b0) ((j) yVar.f14995c)).f10621a.f10671s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1031, new j2.c(p10, kVar, 19));
                return;
        }
    }
}
