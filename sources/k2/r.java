package k2;
public final class r implements Runnable {
    public final int f14779a;
    public final qf.b f14780b;
    public final i2.d f14781c;

    public r(qf.b bVar, i2.d dVar, int i10) {
        this.f14779a = i10;
        this.f14780b = bVar;
        this.f14781c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f14779a) {
            case 0:
                qf.b bVar = this.f14780b;
                i2.d dVar = this.f14781c;
                synchronized (dVar) {
                }
                String str = e2.m0.f8254a;
                j2.f fVar = ((i2.a0) ((u) bVar.f44466c)).f12309a.f12408s;
                j2.a n10 = fVar.n((u2.g0) fVar.d.e);
                fVar.q(n10, 1013, new j2.c(n10, dVar, 26));
                return;
            default:
                qf.b bVar2 = this.f14780b;
                i2.d dVar2 = this.f14781c;
                String str2 = e2.m0.f8254a;
                j2.f fVar2 = ((i2.a0) ((u) bVar2.f44466c)).f12309a.f12408s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1007, new j2.c(p5, dVar2, 21));
                return;
        }
    }
}
