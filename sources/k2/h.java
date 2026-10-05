package k2;
public final class h implements Runnable {
    public final int f14439a;
    public final n4.y f14440b;
    public final i2.g f14441c;

    public h(n4.y yVar, i2.g gVar, int i10) {
        this.f14439a = i10;
        this.f14440b = yVar;
        this.f14441c = gVar;
    }

    @Override
    public final void run() {
        switch (this.f14439a) {
            case 0:
                n4.y yVar = this.f14440b;
                i2.g gVar = this.f14441c;
                synchronized (gVar) {
                }
                String str = e2.d0.f8538a;
                j2.f fVar = ((i2.c0) ((k) yVar.f16650c)).f11570a.f11633s;
                j2.a n10 = fVar.n((u2.f0) fVar.d.f7908e);
                fVar.q(n10, 1013, new j2.c(n10, gVar, 13));
                return;
            default:
                n4.y yVar2 = this.f14440b;
                i2.g gVar2 = this.f14441c;
                String str2 = e2.d0.f8538a;
                j2.f fVar2 = ((i2.c0) ((k) yVar2.f16650c)).f11570a.f11633s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1007, new j2.c(p5, gVar2, 6));
                return;
        }
    }
}
