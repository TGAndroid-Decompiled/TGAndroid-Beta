package k2;
public final class q implements Runnable {
    public final int f14777a;
    public final qf.b f14778b;
    public final Exception f14779c;

    public q(qf.b bVar, Exception exc, int i10) {
        this.f14777a = i10;
        this.f14778b = bVar;
        this.f14779c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f14777a;
        Exception exc = this.f14779c;
        qf.b bVar = this.f14778b;
        switch (i10) {
            case 0:
                String str = e2.m0.f8252a;
                j2.f fVar = ((i2.c0) ((u) bVar.f44440c)).f12325a.f12413s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1029, new j2.c(p5, exc, 16));
                return;
            default:
                String str2 = e2.m0.f8252a;
                j2.f fVar2 = ((i2.c0) ((u) bVar.f44440c)).f12325a.f12413s;
                j2.a p9 = fVar2.p();
                fVar2.q(p9, 1014, new j2.e(p9, exc, 8));
                return;
        }
    }
}
