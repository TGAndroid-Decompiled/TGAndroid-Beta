package k2;
public final class g implements Runnable {
    public final int f12131a;
    public final of.b f12132b;
    public final i2.g f12133c;

    public g(of.b bVar, i2.g gVar, int i10) {
        this.f12131a = i10;
        this.f12132b = bVar;
        this.f12133c = gVar;
    }

    @Override
    public final void run() {
        switch (this.f12131a) {
            case 0:
                of.b bVar = this.f12132b;
                i2.g gVar = this.f12133c;
                synchronized (gVar) {
                }
                String str = e2.d0.f7188a;
                j2.e eVar = ((i2.b0) ((j) bVar.f14295c)).f10108a.f10157s;
                j2.a n10 = eVar.n((u2.g0) eVar.d.e);
                eVar.q(n10, 1013, new j2.d(n10, gVar, 5));
                return;
            default:
                of.b bVar2 = this.f12132b;
                i2.g gVar2 = this.f12133c;
                String str2 = e2.d0.f7188a;
                j2.e eVar2 = ((i2.b0) ((j) bVar2.f14295c)).f10108a.f10157s;
                j2.a p5 = eVar2.p();
                eVar2.q(p5, 1007, new i0.b(p5, gVar2, 28));
                return;
        }
    }
}
