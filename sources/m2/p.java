package m2;
public final class p implements Runnable {
    public final int f18956a;
    public final t f18957b;
    public final Exception f18958c;

    public p(t tVar, Exception exc, int i3) {
        this.f18956a = i3;
        this.f18957b = tVar;
        this.f18958c = exc;
    }

    @Override
    public final void run() {
        int i3 = this.f18956a;
        Exception exc = this.f18958c;
        t tVar = this.f18957b;
        switch (i3) {
            case 0:
                String str = g2.n0.f11873a;
                l2.f fVar = ((k2.c0) ((u) tVar.f19007c)).f16459a.f16572s;
                l2.a U = fVar.U();
                fVar.V(U, 1029, new l2.c(U, exc, 5));
                return;
            default:
                String str2 = g2.n0.f11873a;
                l2.f fVar2 = ((k2.c0) ((u) tVar.f19007c)).f16459a.f16572s;
                l2.a U2 = fVar2.U();
                fVar2.V(U2, 1014, new l2.c(U2, exc, 27));
                return;
        }
    }
}
