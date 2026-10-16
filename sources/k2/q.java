package k2;
public final class q implements Runnable {
    public final int f13980a;
    public final qf.b f13981b;
    public final Exception f13982c;

    public q(qf.b bVar, Exception exc, int i10) {
        this.f13980a = i10;
        this.f13981b = bVar;
        this.f13982c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f13980a;
        Exception exc = this.f13982c;
        qf.b bVar = this.f13981b;
        switch (i10) {
            case 0:
                String str = e2.m0.f8375a;
                j2.f fVar = ((i2.b0) ((u) bVar.f43098c)).f10929a.f11016s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1029, new j2.c(p5, exc, 14));
                return;
            default:
                String str2 = e2.m0.f8375a;
                j2.f fVar2 = ((i2.b0) ((u) bVar.f43098c)).f10929a.f11016s;
                j2.a p9 = fVar2.p();
                fVar2.q(p9, 1014, new j2.e(p9, exc, 6));
                return;
        }
    }
}
