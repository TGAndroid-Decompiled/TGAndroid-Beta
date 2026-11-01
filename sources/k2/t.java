package k2;
public final class t implements Runnable {
    public final int f10764a;
    public final hf.b f10765b;
    public final x0 f10766c;

    public t(hf.b bVar, x0 x0Var, int i10) {
        this.f10764a = i10;
        this.f10765b = bVar;
        this.f10766c = x0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f10764a;
        x0 x0Var = this.f10766c;
        hf.b bVar = this.f10765b;
        switch (i10) {
            case 0:
                String str = e2.l0.f6165a;
                j2.g gVar = ((i2.c0) ((w) bVar.f7659c)).f7822a.f7928s;
                j2.a U = gVar.U();
                gVar.V(U, 1032, new j2.e(U, x0Var, 17));
                return;
            default:
                String str2 = e2.l0.f6165a;
                j2.g gVar2 = ((i2.c0) ((w) bVar.f7659c)).f7822a.f7928s;
                j2.a U2 = gVar2.U();
                gVar2.V(U2, 1031, new j2.e(U2, x0Var, 0));
                return;
        }
    }
}
