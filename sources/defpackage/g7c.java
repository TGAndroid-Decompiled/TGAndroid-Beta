package defpackage;
public final class g7c implements fd {
    public final byte a;
    public final o7c b;

    public g7c(o7c o7cVar, byte b) {
        this.a = b;
        this.b = o7cVar;
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        o7c o7cVar = this.b;
        switch (b) {
            case 0:
                o7cVar.finishFragment();
                return;
            case 1:
                o7cVar.G0();
                o7cVar.finishFragment();
                return;
            case 2:
                o7cVar.S = "";
                o7cVar.J0(false);
                return;
            case 3:
                o7cVar.n0();
                return;
            default:
                o7cVar.t0();
                return;
        }
    }
}
