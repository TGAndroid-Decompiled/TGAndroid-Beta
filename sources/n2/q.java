package n2;
public final class q implements Runnable {
    public final int f21229a;
    public final k8.a f21230b;
    public final l2.d f21231c;

    public q(k8.a aVar, l2.d dVar, int i7) {
        this.f21229a = i7;
        this.f21230b = aVar;
        this.f21231c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f21229a) {
            case 0:
                k8.a aVar = this.f21230b;
                l2.d dVar = this.f21231c;
                synchronized (dVar) {
                }
                String str = h2.l0.f13812a;
                m2.d dVar2 = ((l2.z) ((s) aVar.f18212c)).f19625a.f19372s;
                m2.a S = dVar2.S((x2.g0) dVar2.d.f344e);
                dVar2.V(S, 1013, new li.c(S, dVar, 29));
                return;
            default:
                k8.a aVar2 = this.f21230b;
                l2.d dVar3 = this.f21231c;
                String str2 = h2.l0.f13812a;
                m2.d dVar4 = ((l2.z) ((s) aVar2.f18212c)).f19625a.f19372s;
                m2.a U = dVar4.U();
                dVar4.V(U, 1007, new li.c(U, dVar3, 24));
                return;
        }
    }
}
