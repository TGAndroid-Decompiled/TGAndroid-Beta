package k2;
public final class h implements Runnable {
    public final int f14468a;
    public final n4.y f14469b;
    public final k f14470c;

    public h(n4.y yVar, k kVar, int i10) {
        this.f14468a = i10;
        this.f14469b = yVar;
        this.f14470c = kVar;
    }

    @Override
    public final void run() {
        int i10 = this.f14468a;
        k kVar = this.f14470c;
        n4.y yVar = this.f14469b;
        switch (i10) {
            case 0:
                String str = e2.d0.f8529a;
                j2.f fVar = ((i2.c0) ((j) yVar.f16364c)).f11618a.f11681s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1032, new j2.e(0, p5, kVar));
                return;
            default:
                String str2 = e2.d0.f8529a;
                j2.f fVar2 = ((i2.c0) ((j) yVar.f16364c)).f11618a.f11681s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1031, new j2.c(p10, kVar, 17));
                return;
        }
    }
}
