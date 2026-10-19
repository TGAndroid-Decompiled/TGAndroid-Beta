package k2;
public final class t implements Runnable {
    public final int f14798a;
    public final qf.b f14799b;
    public final u0 f14800c;

    public t(qf.b bVar, u0 u0Var, int i10) {
        this.f14798a = i10;
        this.f14799b = bVar;
        this.f14800c = u0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f14798a;
        u0 u0Var = this.f14800c;
        qf.b bVar = this.f14799b;
        switch (i10) {
            case 0:
                String str = e2.m0.f8254a;
                j2.f fVar = ((i2.c0) ((u) bVar.f44438c)).f12327a.f12415s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1032, new j2.e(p5, u0Var, 18));
                return;
            default:
                String str2 = e2.m0.f8254a;
                j2.f fVar2 = ((i2.c0) ((u) bVar.f44438c)).f12327a.f12415s;
                j2.a p9 = fVar2.p();
                fVar2.q(p9, 1031, new j2.e(p9, u0Var, 1));
                return;
        }
    }
}
