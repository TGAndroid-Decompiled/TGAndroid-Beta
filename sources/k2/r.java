package k2;
public final class r implements Runnable {
    public final int f14786a;
    public final qf.b f14787b;
    public final i2.f f14788c;

    public r(qf.b bVar, i2.f fVar, int i10) {
        this.f14786a = i10;
        this.f14787b = bVar;
        this.f14788c = fVar;
    }

    @Override
    public final void run() {
        switch (this.f14786a) {
            case 0:
                qf.b bVar = this.f14787b;
                i2.f fVar = this.f14788c;
                synchronized (fVar) {
                }
                String str = e2.m0.f8254a;
                j2.f fVar2 = ((i2.c0) ((u) bVar.f44438c)).f12327a.f12415s;
                j2.a n10 = fVar2.n((u2.g0) fVar2.d.e);
                fVar2.q(n10, 1013, new j2.c(n10, fVar, 26));
                return;
            default:
                qf.b bVar2 = this.f14787b;
                i2.f fVar3 = this.f14788c;
                String str2 = e2.m0.f8254a;
                j2.f fVar4 = ((i2.c0) ((u) bVar2.f44438c)).f12327a.f12415s;
                j2.a p5 = fVar4.p();
                fVar4.q(p5, 1007, new j2.c(p5, fVar3, 21));
                return;
        }
    }
}
