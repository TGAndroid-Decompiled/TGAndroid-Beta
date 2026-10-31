package a3;
public final class k0 implements Runnable {
    public final int f136a;
    public final hf.b f137b;
    public final i2.d f138c;

    public k0(hf.b bVar, i2.d dVar, int i10) {
        this.f136a = i10;
        this.f137b = bVar;
        this.f138c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f136a) {
            case 0:
                hf.b bVar = this.f137b;
                i2.d dVar = this.f138c;
                String str = e2.l0.f6165a;
                j2.g gVar = ((i2.c0) ((m0) bVar.f7658c)).f7821a.f7927s;
                j2.a U = gVar.U();
                gVar.V(U, 1015, new j2.e(U, dVar, 4));
                return;
            default:
                hf.b bVar2 = this.f137b;
                i2.d dVar2 = this.f138c;
                synchronized (dVar2) {
                }
                String str2 = e2.l0.f6165a;
                i2.i0 i0Var = ((i2.c0) ((m0) bVar2.f7658c)).f7821a;
                j2.g gVar2 = i0Var.f7927s;
                j2.a S = gVar2.S((u2.g0) gVar2.d.e);
                gVar2.V(S, 1020, new ig.c0(S, dVar2, 4));
                i0Var.S = null;
                return;
        }
    }
}
