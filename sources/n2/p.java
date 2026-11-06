package n2;
public final class p implements Runnable {
    public final int f20259a;
    public final j2.n f20260b;
    public final Exception f20261c;

    public p(j2.n nVar, Exception exc, int i7) {
        this.f20259a = i7;
        this.f20260b = nVar;
        this.f20261c = exc;
    }

    @Override
    public final void run() {
        int i7 = this.f20259a;
        Exception exc = this.f20261c;
        j2.n nVar = this.f20260b;
        switch (i7) {
            case 0:
                String str = h2.m0.f14112a;
                m2.e eVar = ((l2.c0) ((s) nVar.f16454c)).f17771a.f17881s;
                m2.a U = eVar.U();
                eVar.V(U, 1029, new m2.c(U, exc, 12));
                return;
            default:
                String str2 = h2.m0.f14112a;
                m2.e eVar2 = ((l2.c0) ((s) nVar.f16454c)).f17771a.f17881s;
                m2.a U2 = eVar2.U();
                eVar2.V(U2, 1014, new m2.d(U2, exc, 4));
                return;
        }
    }
}
