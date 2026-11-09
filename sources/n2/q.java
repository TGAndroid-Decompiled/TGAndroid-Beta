package n2;
public final class q implements Runnable {
    public final int f20268a;
    public final j2.n f20269b;
    public final l2.d f20270c;

    public q(j2.n nVar, l2.d dVar, int i7) {
        this.f20268a = i7;
        this.f20269b = nVar;
        this.f20270c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f20268a) {
            case 0:
                j2.n nVar = this.f20269b;
                l2.d dVar = this.f20270c;
                synchronized (dVar) {
                }
                String str = h2.m0.f14112a;
                m2.e eVar = ((l2.c0) ((s) nVar.f16457c)).f17772a.f17882s;
                m2.a S = eVar.S((x2.g0) eVar.d.f338e);
                eVar.V(S, 1013, new m2.c(S, dVar, 22));
                return;
            default:
                j2.n nVar2 = this.f20269b;
                l2.d dVar2 = this.f20270c;
                String str2 = h2.m0.f14112a;
                m2.e eVar2 = ((l2.c0) ((s) nVar2.f16457c)).f17772a.f17882s;
                m2.a U = eVar2.U();
                eVar2.V(U, 1007, new m2.c(U, dVar2, 17));
                return;
        }
    }
}
