package k2;
public final class h implements Runnable {
    public final int f13293a;
    public final n4.y f13294b;
    public final k f13295c;

    public h(n4.y yVar, k kVar, int i10) {
        this.f13293a = i10;
        this.f13294b = yVar;
        this.f13295c = kVar;
    }

    @Override
    public final void run() {
        int i10 = this.f13293a;
        k kVar = this.f13295c;
        n4.y yVar = this.f13294b;
        switch (i10) {
            case 0:
                String str = e2.d0.f7887a;
                j2.f fVar = ((i2.b0) ((j) yVar.f15180c)).f10624a.f10674s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1032, new j2.e(2, p5, kVar));
                return;
            default:
                String str2 = e2.d0.f7887a;
                j2.f fVar2 = ((i2.b0) ((j) yVar.f15180c)).f10624a.f10674s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1031, new j2.c(p10, kVar, 19));
                return;
        }
    }
}
