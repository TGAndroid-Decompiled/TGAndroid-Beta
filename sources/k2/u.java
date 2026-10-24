package k2;
public final class u implements Runnable {
    public final int f14867a;
    public final qf.b f14868b;
    public final u0 f14869c;

    public u(qf.b bVar, u0 u0Var, int i10) {
        this.f14867a = i10;
        this.f14868b = bVar;
        this.f14869c = u0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f14867a;
        u0 u0Var = this.f14869c;
        qf.b bVar = this.f14868b;
        switch (i10) {
            case 0:
                String str = e2.m0.f8259a;
                j2.e eVar = ((i2.b0) ((v) bVar.f44864c)).f12353a.f12442s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1032, new j2.d(p5, u0Var, 22));
                return;
            default:
                String str2 = e2.m0.f8259a;
                j2.e eVar2 = ((i2.b0) ((v) bVar.f44864c)).f12353a.f12442s;
                j2.a p9 = eVar2.p();
                eVar2.q(p9, 1031, new j2.d(p9, u0Var, 5));
                return;
        }
    }
}
