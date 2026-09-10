package k2;
public final class f implements Runnable {
    public final int f12127a;
    public final of.b f12128b;
    public final Exception f12129c;

    public f(of.b bVar, Exception exc, int i10) {
        this.f12127a = i10;
        this.f12128b = bVar;
        this.f12129c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f12127a;
        Exception exc = this.f12129c;
        of.b bVar = this.f12128b;
        switch (i10) {
            case 0:
                String str = e2.d0.f7188a;
                j2.e eVar = ((i2.b0) ((j) bVar.f14295c)).f10108a.f10157s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1029, new i0.b(p5, exc, 23));
                return;
            default:
                String str2 = e2.d0.f7188a;
                j2.e eVar2 = ((i2.b0) ((j) bVar.f14295c)).f10108a.f10157s;
                j2.a p10 = eVar2.p();
                eVar2.q(p10, 1014, new j2.d(p10, exc, 17));
                return;
        }
    }
}
