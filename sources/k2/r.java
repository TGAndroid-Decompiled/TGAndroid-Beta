package k2;
public final class r implements Runnable {
    public final int f14827a;
    public final qf.b f14828b;
    public final Exception f14829c;

    public r(qf.b bVar, Exception exc, int i10) {
        this.f14827a = i10;
        this.f14828b = bVar;
        this.f14829c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f14827a;
        Exception exc = this.f14829c;
        qf.b bVar = this.f14828b;
        switch (i10) {
            case 0:
                String str = e2.m0.f8259a;
                j2.e eVar = ((i2.b0) ((v) bVar.f44864c)).f12353a.f12442s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1029, new ih.l(p5, exc, 20));
                return;
            default:
                String str2 = e2.m0.f8259a;
                j2.e eVar2 = ((i2.b0) ((v) bVar.f44864c)).f12353a.f12442s;
                j2.a p9 = eVar2.p();
                eVar2.q(p9, 1014, new j2.d(p9, exc, 12));
                return;
        }
    }
}
