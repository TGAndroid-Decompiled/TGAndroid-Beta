package k2;
public final class t implements Runnable {
    public final int f14791a;
    public final qf.b f14792b;
    public final u0 f14793c;

    public t(qf.b bVar, u0 u0Var, int i10) {
        this.f14791a = i10;
        this.f14792b = bVar;
        this.f14793c = u0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f14791a;
        u0 u0Var = this.f14793c;
        qf.b bVar = this.f14792b;
        switch (i10) {
            case 0:
                String str = e2.m0.f8254a;
                j2.f fVar = ((i2.a0) ((u) bVar.f44466c)).f12309a.f12408s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1032, new j2.e(p5, u0Var, 18));
                return;
            default:
                String str2 = e2.m0.f8254a;
                j2.f fVar2 = ((i2.a0) ((u) bVar.f44466c)).f12309a.f12408s;
                j2.a p9 = fVar2.p();
                fVar2.q(p9, 1031, new j2.e(p9, u0Var, 1));
                return;
        }
    }
}
