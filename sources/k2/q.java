package k2;
public final class q implements Runnable {
    public final int f13977a;
    public final qf.b f13978b;
    public final Exception f13979c;

    public q(qf.b bVar, Exception exc, int i10) {
        this.f13977a = i10;
        this.f13978b = bVar;
        this.f13979c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f13977a;
        Exception exc = this.f13979c;
        qf.b bVar = this.f13978b;
        switch (i10) {
            case 0:
                String str = e2.m0.f8372a;
                j2.f fVar = ((i2.b0) ((u) bVar.f43356c)).f10925a.f11012s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1029, new j2.c(p5, exc, 14));
                return;
            default:
                String str2 = e2.m0.f8372a;
                j2.f fVar2 = ((i2.b0) ((u) bVar.f43356c)).f10925a.f11012s;
                j2.a p9 = fVar2.p();
                fVar2.q(p9, 1014, new j2.e(p9, exc, 6));
                return;
        }
    }
}
