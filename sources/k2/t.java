package k2;
public final class t implements Runnable {
    public final int f10763a;
    public final hf.b f10764b;
    public final x0 f10765c;

    public t(hf.b bVar, x0 x0Var, int i10) {
        this.f10763a = i10;
        this.f10764b = bVar;
        this.f10765c = x0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f10763a;
        x0 x0Var = this.f10765c;
        hf.b bVar = this.f10764b;
        switch (i10) {
            case 0:
                String str = e2.l0.f6165a;
                j2.g gVar = ((i2.c0) ((w) bVar.f7658c)).f7821a.f7927s;
                j2.a U = gVar.U();
                gVar.V(U, 1032, new j2.e(U, x0Var, 17));
                return;
            default:
                String str2 = e2.l0.f6165a;
                j2.g gVar2 = ((i2.c0) ((w) bVar.f7658c)).f7821a.f7927s;
                j2.a U2 = gVar2.U();
                gVar2.V(U2, 1031, new j2.e(U2, x0Var, 0));
                return;
        }
    }
}
