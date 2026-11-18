package n2;
public final class p implements Runnable {
    public final int f21198a;
    public final k8.a f21199b;
    public final Exception f21200c;

    public p(k8.a aVar, Exception exc, int i7) {
        this.f21198a = i7;
        this.f21199b = aVar;
        this.f21200c = exc;
    }

    @Override
    public final void run() {
        int i7 = this.f21198a;
        Exception exc = this.f21200c;
        k8.a aVar = this.f21199b;
        switch (i7) {
            case 0:
                String str = h2.l0.f13786a;
                m2.d dVar = ((l2.z) ((s) aVar.f18184c)).f19600a.f19347s;
                m2.a U = dVar.U();
                dVar.V(U, 1029, new li.c(U, exc, 19));
                return;
            default:
                String str2 = h2.l0.f13786a;
                m2.d dVar2 = ((l2.z) ((s) aVar.f18184c)).f19600a.f19347s;
                m2.a U2 = dVar2.U();
                dVar2.V(U2, 1014, new m2.c(U2, exc, 11));
                return;
        }
    }
}
