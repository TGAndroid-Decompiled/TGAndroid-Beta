package m2;
public final class r implements Runnable {
    public final int f18970a;
    public final t f18971b;
    public final t0 f18972c;

    public r(t tVar, t0 t0Var, int i3) {
        this.f18970a = i3;
        this.f18971b = tVar;
        this.f18972c = t0Var;
    }

    @Override
    public final void run() {
        int i3 = this.f18970a;
        t0 t0Var = this.f18972c;
        t tVar = this.f18971b;
        switch (i3) {
            case 0:
                String str = g2.n0.f11873a;
                l2.f fVar = ((k2.c0) ((u) tVar.f19007c)).f16459a.f16572s;
                l2.a U = fVar.U();
                fVar.V(U, 1032, new l2.d(U, t0Var, 7));
                return;
            default:
                String str2 = g2.n0.f11873a;
                l2.f fVar2 = ((k2.c0) ((u) tVar.f19007c)).f16459a.f16572s;
                l2.a U2 = fVar2.U();
                fVar2.V(U2, 1031, new l2.c(U2, t0Var, 20));
                return;
        }
    }
}
