package n2;
public final class r implements Runnable {
    public final int f21301a;
    public final jb.m f21302b;
    public final t0 f21303c;

    public r(jb.m mVar, t0 t0Var, int i7) {
        this.f21301a = i7;
        this.f21302b = mVar;
        this.f21303c = t0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f21301a;
        t0 t0Var = this.f21303c;
        jb.m mVar = this.f21302b;
        switch (i7) {
            case 0:
                String str = h2.l0.f13778a;
                m2.d dVar = ((l2.a0) ((s) mVar.f17465c)).f19342a.f19445s;
                m2.a U = dVar.U();
                dVar.V(U, 1032, new m2.c(U, t0Var, 21));
                return;
            default:
                String str2 = h2.l0.f13778a;
                m2.d dVar2 = ((l2.a0) ((s) mVar.f17465c)).f19342a.f19445s;
                m2.a U2 = dVar2.U();
                dVar2.V(U2, 1031, new m2.c(U2, t0Var, 4));
                return;
        }
    }
}
