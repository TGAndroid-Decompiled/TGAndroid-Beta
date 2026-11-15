package n2;
public final class p implements Runnable {
    public final int f20834a;
    public final k8.a f20835b;
    public final Exception f20836c;

    public p(k8.a aVar, Exception exc, int i7) {
        this.f20834a = i7;
        this.f20835b = aVar;
        this.f20836c = exc;
    }

    @Override
    public final void run() {
        int i7 = this.f20834a;
        Exception exc = this.f20836c;
        k8.a aVar = this.f20835b;
        switch (i7) {
            case 0:
                String str = h2.l0.f13471a;
                m2.e eVar = ((l2.z) ((s) aVar.f17789c)).f19233a.f18980s;
                m2.a U = eVar.U();
                eVar.V(U, 1029, new li.p(U, exc, 18));
                return;
            default:
                String str2 = h2.l0.f13471a;
                m2.e eVar2 = ((l2.z) ((s) aVar.f17789c)).f19233a.f18980s;
                m2.a U2 = eVar2.U();
                eVar2.V(U2, 1014, new m2.c(U2, exc, 10));
                return;
        }
    }
}
