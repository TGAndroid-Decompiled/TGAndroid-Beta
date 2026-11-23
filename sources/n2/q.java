package n2;
public final class q implements Runnable {
    public final int f21295a;
    public final jb.m f21296b;
    public final l2.e f21297c;

    public q(jb.m mVar, l2.e eVar, int i7) {
        this.f21295a = i7;
        this.f21296b = mVar;
        this.f21297c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f21295a) {
            case 0:
                jb.m mVar = this.f21296b;
                l2.e eVar = this.f21297c;
                synchronized (eVar) {
                }
                String str = h2.l0.f13778a;
                m2.d dVar = ((l2.a0) ((s) mVar.f17465c)).f19342a.f19445s;
                m2.a S = dVar.S((x2.g0) dVar.d.f344e);
                dVar.V(S, 1013, new li.c(S, eVar, 29));
                return;
            default:
                jb.m mVar2 = this.f21296b;
                l2.e eVar2 = this.f21297c;
                String str2 = h2.l0.f13778a;
                m2.d dVar2 = ((l2.a0) ((s) mVar2.f17465c)).f19342a.f19445s;
                m2.a U = dVar2.U();
                dVar2.V(U, 1007, new li.c(U, eVar2, 24));
                return;
        }
    }
}
