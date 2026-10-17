package k2;
public final class q implements Runnable {
    public final int f14772a;
    public final qf.b f14773b;
    public final Exception f14774c;

    public q(qf.b bVar, Exception exc, int i10) {
        this.f14772a = i10;
        this.f14773b = bVar;
        this.f14774c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f14772a;
        Exception exc = this.f14774c;
        qf.b bVar = this.f14773b;
        switch (i10) {
            case 0:
                String str = e2.m0.f8254a;
                j2.f fVar = ((i2.a0) ((u) bVar.f44466c)).f12309a.f12408s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1029, new j2.c(p5, exc, 16));
                return;
            default:
                String str2 = e2.m0.f8254a;
                j2.f fVar2 = ((i2.a0) ((u) bVar.f44466c)).f12309a.f12408s;
                j2.a p9 = fVar2.p();
                fVar2.q(p9, 1014, new j2.e(p9, exc, 8));
                return;
        }
    }
}
