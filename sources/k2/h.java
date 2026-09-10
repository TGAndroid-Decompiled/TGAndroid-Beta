package k2;
public final class h implements Runnable {
    public final int f12134a;
    public final of.b f12135b;
    public final k f12136c;

    public h(of.b bVar, k kVar, int i10) {
        this.f12134a = i10;
        this.f12135b = bVar;
        this.f12136c = kVar;
    }

    @Override
    public final void run() {
        int i10 = this.f12134a;
        k kVar = this.f12136c;
        of.b bVar = this.f12135b;
        switch (i10) {
            case 0:
                String str = e2.d0.f7188a;
                j2.e eVar = ((i2.b0) ((j) bVar.f14295c)).f10108a.f10157s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1032, new j2.d(p5, kVar, 24));
                return;
            default:
                String str2 = e2.d0.f7188a;
                j2.e eVar2 = ((i2.b0) ((j) bVar.f14295c)).f10108a.f10157s;
                j2.a p10 = eVar2.p();
                eVar2.q(p10, 1031, new j2.d(p10, kVar, 11));
                return;
        }
    }
}
