package k2;
public final class r implements Runnable {
    public final int f10754a;
    public final hf.b f10755b;
    public final i2.d f10756c;

    public r(hf.b bVar, i2.d dVar, int i10) {
        this.f10754a = i10;
        this.f10755b = bVar;
        this.f10756c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f10754a) {
            case 0:
                hf.b bVar = this.f10755b;
                i2.d dVar = this.f10756c;
                synchronized (dVar) {
                }
                String str = e2.l0.f6165a;
                j2.g gVar = ((i2.c0) ((w) bVar.f7658c)).f7821a.f7927s;
                j2.a S = gVar.S((u2.g0) gVar.d.e);
                gVar.V(S, 1013, new j2.c(S, dVar, 25));
                return;
            default:
                hf.b bVar2 = this.f10755b;
                i2.d dVar2 = this.f10756c;
                String str2 = e2.l0.f6165a;
                j2.g gVar2 = ((i2.c0) ((w) bVar2.f7658c)).f7821a.f7927s;
                j2.a U = gVar2.U();
                gVar2.V(U, 1007, new j2.c(U, dVar2, 20));
                return;
        }
    }
}
