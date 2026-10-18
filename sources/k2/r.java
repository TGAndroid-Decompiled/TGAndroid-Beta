package k2;
public final class r implements Runnable {
    public final int f14784a;
    public final qf.b f14785b;
    public final i2.e f14786c;

    public r(qf.b bVar, i2.e eVar, int i10) {
        this.f14784a = i10;
        this.f14785b = bVar;
        this.f14786c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f14784a) {
            case 0:
                qf.b bVar = this.f14785b;
                i2.e eVar = this.f14786c;
                synchronized (eVar) {
                }
                String str = e2.m0.f8253a;
                j2.f fVar = ((i2.b0) ((u) bVar.f44443c)).f12322a.f12410s;
                j2.a n10 = fVar.n((u2.g0) fVar.d.e);
                fVar.q(n10, 1013, new j2.c(n10, eVar, 26));
                return;
            default:
                qf.b bVar2 = this.f14785b;
                i2.e eVar2 = this.f14786c;
                String str2 = e2.m0.f8253a;
                j2.f fVar2 = ((i2.b0) ((u) bVar2.f44443c)).f12322a.f12410s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1007, new j2.c(p5, eVar2, 21));
                return;
        }
    }
}
