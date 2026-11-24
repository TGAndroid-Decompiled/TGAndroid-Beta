package defpackage;
public final class g3c implements ed {
    public final byte a;
    public final p3c b;

    public g3c(p3c p3cVar, byte b) {
        this.a = b;
        this.b = p3cVar;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        p3c p3cVar = this.b;
        switch (b) {
            case 0:
                p3cVar.finishFragment();
                return;
            case 1:
                p3cVar.F0();
                p3cVar.finishFragment();
                return;
            case 2:
                p3cVar.S = "";
                p3cVar.I0(false);
                return;
            case 3:
                p3cVar.n0();
                return;
            default:
                p3cVar.t0();
                return;
        }
    }
}
