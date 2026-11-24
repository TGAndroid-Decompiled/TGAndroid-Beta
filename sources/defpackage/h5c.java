package defpackage;
public final class h5c implements ee {
    public final byte a;
    public final p5c b;

    public h5c(p5c p5cVar, byte b) {
        this.a = b;
        this.b = p5cVar;
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        p5c p5cVar = this.b;
        switch (b) {
            case 0:
                p5cVar.finishFragment();
                return;
            case 1:
                p5cVar.G0();
                p5cVar.finishFragment();
                return;
            case 2:
                p5cVar.S = "";
                p5cVar.J0(false);
                return;
            case 3:
                p5cVar.o0();
                return;
            default:
                p5cVar.u0();
                return;
        }
    }
}
