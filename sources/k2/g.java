package k2;
public final class g implements Runnable {
    public final int f14466a;
    public final n4.x f14467b;
    public final i2.g f14468c;

    public g(n4.x xVar, i2.g gVar, int i10) {
        this.f14466a = i10;
        this.f14467b = xVar;
        this.f14468c = gVar;
    }

    @Override
    public final void run() {
        switch (this.f14466a) {
            case 0:
                n4.x xVar = this.f14467b;
                i2.g gVar = this.f14468c;
                synchronized (gVar) {
                }
                String str = e2.d0.f8532a;
                j2.f fVar = ((i2.c0) ((j) xVar.f16617c)).f11620a.f11683s;
                j2.a n10 = fVar.n((u2.f0) fVar.d.f7957e);
                fVar.q(n10, 1013, new j2.c(n10, gVar, 11));
                return;
            default:
                n4.x xVar2 = this.f14467b;
                i2.g gVar2 = this.f14468c;
                String str2 = e2.d0.f8532a;
                j2.f fVar2 = ((i2.c0) ((j) xVar2.f16617c)).f11620a.f11683s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1007, new j2.c(p5, gVar2, 4));
                return;
        }
    }
}
