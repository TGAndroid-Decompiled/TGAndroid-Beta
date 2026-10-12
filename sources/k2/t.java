package k2;
public final class t implements Runnable {
    public final int f14017a;
    public final qf.b f14018b;
    public final t0 f14019c;

    public t(qf.b bVar, t0 t0Var, int i10) {
        this.f14017a = i10;
        this.f14018b = bVar;
        this.f14019c = t0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f14017a;
        t0 t0Var = this.f14019c;
        qf.b bVar = this.f14018b;
        switch (i10) {
            case 0:
                String str = e2.m0.f8372a;
                j2.f fVar = ((i2.b0) ((u) bVar.f43356c)).f10925a.f11012s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1032, new j2.e(p5, t0Var, 16));
                return;
            default:
                String str2 = e2.m0.f8372a;
                j2.f fVar2 = ((i2.b0) ((u) bVar.f43356c)).f10925a.f11012s;
                j2.a p9 = fVar2.p();
                fVar2.q(p9, 1031, new j2.c(p9, t0Var, 29));
                return;
        }
    }
}
