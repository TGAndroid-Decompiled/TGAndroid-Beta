package k2;
public final class r implements Runnable {
    public final int f10755a;
    public final hf.b f10756b;
    public final i2.d f10757c;

    public r(hf.b bVar, i2.d dVar, int i10) {
        this.f10755a = i10;
        this.f10756b = bVar;
        this.f10757c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f10755a) {
            case 0:
                hf.b bVar = this.f10756b;
                i2.d dVar = this.f10757c;
                synchronized (dVar) {
                }
                String str = e2.l0.f6165a;
                j2.g gVar = ((i2.c0) ((w) bVar.f7659c)).f7822a.f7928s;
                j2.a S = gVar.S((u2.g0) gVar.d.e);
                gVar.V(S, 1013, new j2.c(S, dVar, 25));
                return;
            default:
                hf.b bVar2 = this.f10756b;
                i2.d dVar2 = this.f10757c;
                String str2 = e2.l0.f6165a;
                j2.g gVar2 = ((i2.c0) ((w) bVar2.f7659c)).f7822a.f7928s;
                j2.a U = gVar2.U();
                gVar2.V(U, 1007, new j2.c(U, dVar2, 20));
                return;
        }
    }
}
