package n2;
public final class q implements Runnable {
    public final int f20840a;
    public final k8.a f20841b;
    public final l2.d f20842c;

    public q(k8.a aVar, l2.d dVar, int i7) {
        this.f20840a = i7;
        this.f20841b = aVar;
        this.f20842c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f20840a) {
            case 0:
                k8.a aVar = this.f20841b;
                l2.d dVar = this.f20842c;
                synchronized (dVar) {
                }
                String str = h2.l0.f13471a;
                m2.e eVar = ((l2.z) ((s) aVar.f17789c)).f19233a.f18980s;
                m2.a S = eVar.S((x2.f0) eVar.d.f344e);
                eVar.V(S, 1013, new li.p(S, dVar, 28));
                return;
            default:
                k8.a aVar2 = this.f20841b;
                l2.d dVar2 = this.f20842c;
                String str2 = h2.l0.f13471a;
                m2.e eVar2 = ((l2.z) ((s) aVar2.f17789c)).f19233a.f18980s;
                m2.a U = eVar2.U();
                eVar2.V(U, 1007, new li.p(U, dVar2, 23));
                return;
        }
    }
}
