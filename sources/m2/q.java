package m2;
public final class q implements Runnable {
    public final int f18964a;
    public final t f18965b;
    public final k2.d f18966c;

    public q(t tVar, k2.d dVar, int i3) {
        this.f18964a = i3;
        this.f18965b = tVar;
        this.f18966c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f18964a) {
            case 0:
                t tVar = this.f18965b;
                k2.d dVar = this.f18966c;
                synchronized (dVar) {
                }
                String str = g2.n0.f11873a;
                l2.f fVar = ((k2.c0) ((u) tVar.f19007c)).f16459a.f16572s;
                l2.a S = fVar.S((w2.g0) fVar.d.f17692e);
                fVar.V(S, 1013, new l2.c(S, dVar, 15));
                return;
            default:
                t tVar2 = this.f18965b;
                k2.d dVar2 = this.f18966c;
                String str2 = g2.n0.f11873a;
                l2.f fVar2 = ((k2.c0) ((u) tVar2.f19007c)).f16459a.f16572s;
                l2.a U = fVar2.U();
                fVar2.V(U, 1007, new l2.c(U, dVar2, 10));
                return;
        }
    }
}
