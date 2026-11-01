package k2;
public final class q implements Runnable {
    public final int f10750a;
    public final hf.b f10751b;
    public final Exception f10752c;

    public q(hf.b bVar, Exception exc, int i10) {
        this.f10750a = i10;
        this.f10751b = bVar;
        this.f10752c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f10750a;
        Exception exc = this.f10752c;
        hf.b bVar = this.f10751b;
        switch (i10) {
            case 0:
                String str = e2.l0.f6165a;
                j2.g gVar = ((i2.c0) ((w) bVar.f7659c)).f7822a.f7928s;
                j2.a U = gVar.U();
                gVar.V(U, 1029, new j2.c(U, exc, 15));
                return;
            default:
                String str2 = e2.l0.f6165a;
                j2.g gVar2 = ((i2.c0) ((w) bVar.f7659c)).f7822a.f7928s;
                j2.a U2 = gVar2.U();
                gVar2.V(U2, 1014, new j2.e(U2, exc, 7));
                return;
        }
    }
}
