package k2;
public final class r implements Runnable {
    public final int f14784a;
    public final qf.b f14785b;
    public final i2.f f14786c;

    public r(qf.b bVar, i2.f fVar, int i10) {
        this.f14784a = i10;
        this.f14785b = bVar;
        this.f14786c = fVar;
    }

    @Override
    public final void run() {
        switch (this.f14784a) {
            case 0:
                qf.b bVar = this.f14785b;
                i2.f fVar = this.f14786c;
                synchronized (fVar) {
                }
                String str = e2.m0.f8252a;
                j2.f fVar2 = ((i2.c0) ((u) bVar.f44452c)).f12325a.f12413s;
                j2.a n10 = fVar2.n((u2.g0) fVar2.d.e);
                fVar2.q(n10, 1013, new j2.c(n10, fVar, 26));
                return;
            default:
                qf.b bVar2 = this.f14785b;
                i2.f fVar3 = this.f14786c;
                String str2 = e2.m0.f8252a;
                j2.f fVar4 = ((i2.c0) ((u) bVar2.f44452c)).f12325a.f12413s;
                j2.a p5 = fVar4.p();
                fVar4.q(p5, 1007, new j2.c(p5, fVar3, 21));
                return;
        }
    }
}
