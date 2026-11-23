package n2;
public final class p implements Runnable {
    public final int f21287a;
    public final jb.m f21288b;
    public final Exception f21289c;

    public p(jb.m mVar, Exception exc, int i7) {
        this.f21287a = i7;
        this.f21288b = mVar;
        this.f21289c = exc;
    }

    @Override
    public final void run() {
        int i7 = this.f21287a;
        Exception exc = this.f21289c;
        jb.m mVar = this.f21288b;
        switch (i7) {
            case 0:
                String str = h2.l0.f13778a;
                m2.d dVar = ((l2.a0) ((s) mVar.f17465c)).f19342a.f19445s;
                m2.a U = dVar.U();
                dVar.V(U, 1029, new li.c(U, exc, 19));
                return;
            default:
                String str2 = h2.l0.f13778a;
                m2.d dVar2 = ((l2.a0) ((s) mVar.f17465c)).f19342a.f19445s;
                m2.a U2 = dVar2.U();
                dVar2.V(U2, 1014, new m2.c(U2, exc, 11));
                return;
        }
    }
}
