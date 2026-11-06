package n2;
public final class r implements Runnable {
    public final int f20294a;
    public final j2.n f20295b;
    public final r0 f20296c;

    public r(j2.n nVar, r0 r0Var, int i7) {
        this.f20294a = i7;
        this.f20295b = nVar;
        this.f20296c = r0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f20294a;
        r0 r0Var = this.f20296c;
        j2.n nVar = this.f20295b;
        switch (i7) {
            case 0:
                String str = h2.m0.f14112a;
                m2.e eVar = ((l2.c0) ((s) nVar.f16454c)).f17771a.f17881s;
                m2.a U = eVar.U();
                eVar.V(U, 1032, new m2.d(U, r0Var, 14));
                return;
            default:
                String str2 = h2.m0.f14112a;
                m2.e eVar2 = ((l2.c0) ((s) nVar.f16454c)).f17771a.f17881s;
                m2.a U2 = eVar2.U();
                eVar2.V(U2, 1031, new m2.c(U2, r0Var, 27));
                return;
        }
    }
}
