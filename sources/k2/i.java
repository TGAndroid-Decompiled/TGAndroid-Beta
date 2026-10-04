package k2;
public final class i implements Runnable {
    public final int f14442a;
    public final n4.y f14443b;
    public final l f14444c;

    public i(n4.y yVar, l lVar, int i10) {
        this.f14442a = i10;
        this.f14443b = yVar;
        this.f14444c = lVar;
    }

    @Override
    public final void run() {
        int i10 = this.f14442a;
        l lVar = this.f14444c;
        n4.y yVar = this.f14443b;
        switch (i10) {
            case 0:
                String str = e2.d0.f8538a;
                j2.f fVar = ((i2.c0) ((k) yVar.f16645c)).f11570a.f11633s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1032, new j2.e(p5, lVar, 2));
                return;
            default:
                String str2 = e2.d0.f8538a;
                j2.f fVar2 = ((i2.c0) ((k) yVar.f16645c)).f11570a.f11633s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1031, new j2.c(p10, lVar, 19));
                return;
        }
    }
}
