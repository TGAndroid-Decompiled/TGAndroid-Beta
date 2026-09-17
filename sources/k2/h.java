package k2;
public final class h implements Runnable {
    public final int f13294a;
    public final n4.y f13295b;
    public final k f13296c;

    public h(n4.y yVar, k kVar, int i10) {
        this.f13294a = i10;
        this.f13295b = yVar;
        this.f13296c = kVar;
    }

    @Override
    public final void run() {
        int i10 = this.f13294a;
        k kVar = this.f13296c;
        n4.y yVar = this.f13295b;
        switch (i10) {
            case 0:
                String str = e2.d0.f7888a;
                j2.f fVar = ((i2.b0) ((j) yVar.f15005c)).f10624a.f10674s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1032, new j2.e(2, p5, kVar));
                return;
            default:
                String str2 = e2.d0.f7888a;
                j2.f fVar2 = ((i2.b0) ((j) yVar.f15005c)).f10624a.f10674s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1031, new j2.c(p10, kVar, 19));
                return;
        }
    }
}
