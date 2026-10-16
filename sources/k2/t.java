package k2;
public final class t implements Runnable {
    public final int f14020a;
    public final qf.b f14021b;
    public final t0 f14022c;

    public t(qf.b bVar, t0 t0Var, int i10) {
        this.f14020a = i10;
        this.f14021b = bVar;
        this.f14022c = t0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f14020a;
        t0 t0Var = this.f14022c;
        qf.b bVar = this.f14021b;
        switch (i10) {
            case 0:
                String str = e2.m0.f8375a;
                j2.f fVar = ((i2.b0) ((u) bVar.f43098c)).f10929a.f11016s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1032, new j2.e(p5, t0Var, 16));
                return;
            default:
                String str2 = e2.m0.f8375a;
                j2.f fVar2 = ((i2.b0) ((u) bVar.f43098c)).f10929a.f11016s;
                j2.a p9 = fVar2.p();
                fVar2.q(p9, 1031, new j2.c(p9, t0Var, 29));
                return;
        }
    }
}
