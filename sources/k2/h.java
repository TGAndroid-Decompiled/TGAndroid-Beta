package k2;
public final class h implements Runnable {
    public final int f14605a;
    public final n4.y f14606b;
    public final k f14607c;

    public h(n4.y yVar, k kVar, int i10) {
        this.f14605a = i10;
        this.f14606b = yVar;
        this.f14607c = kVar;
    }

    @Override
    public final void run() {
        int i10 = this.f14605a;
        k kVar = this.f14607c;
        n4.y yVar = this.f14606b;
        switch (i10) {
            case 0:
                String str = e2.d0.f8765a;
                j2.f fVar = ((i2.c0) ((j) yVar.f16524c)).f11497a.f11559s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1032, new j2.e(0, p5, kVar));
                return;
            default:
                String str2 = e2.d0.f8765a;
                j2.f fVar2 = ((i2.c0) ((j) yVar.f16524c)).f11497a.f11559s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1031, new j2.c(p10, kVar, 17));
                return;
        }
    }
}
