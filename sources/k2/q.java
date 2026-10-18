package k2;
public final class q implements Runnable {
    public final int f14779a;
    public final qf.b f14780b;
    public final Exception f14781c;

    public q(qf.b bVar, Exception exc, int i10) {
        this.f14779a = i10;
        this.f14780b = bVar;
        this.f14781c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f14779a;
        Exception exc = this.f14781c;
        qf.b bVar = this.f14780b;
        switch (i10) {
            case 0:
                String str = e2.m0.f8255a;
                j2.f fVar = ((i2.b0) ((u) bVar.f44486c)).f12324a.f12412s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1029, new j2.c(p5, exc, 16));
                return;
            default:
                String str2 = e2.m0.f8255a;
                j2.f fVar2 = ((i2.b0) ((u) bVar.f44486c)).f12324a.f12412s;
                j2.a p9 = fVar2.p();
                fVar2.q(p9, 1014, new j2.e(p9, exc, 8));
                return;
        }
    }
}
