package n2;
public final class p implements Runnable {
    public final int f20267a;
    public final j2.n f20268b;
    public final Exception f20269c;

    public p(j2.n nVar, Exception exc, int i7) {
        this.f20267a = i7;
        this.f20268b = nVar;
        this.f20269c = exc;
    }

    @Override
    public final void run() {
        int i7 = this.f20267a;
        Exception exc = this.f20269c;
        j2.n nVar = this.f20268b;
        switch (i7) {
            case 0:
                String str = h2.m0.f14114a;
                m2.e eVar = ((l2.c0) ((s) nVar.f16457c)).f17775a.f17885s;
                m2.a U = eVar.U();
                eVar.V(U, 1029, new m2.c(U, exc, 12));
                return;
            default:
                String str2 = h2.m0.f14114a;
                m2.e eVar2 = ((l2.c0) ((s) nVar.f16457c)).f17775a.f17885s;
                m2.a U2 = eVar2.U();
                eVar2.V(U2, 1014, new m2.d(U2, exc, 4));
                return;
        }
    }
}
