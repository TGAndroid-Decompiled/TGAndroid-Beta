package i2;
public final class w implements e2.p, e2.o {
    public final int f11213a;
    public final h0 f11214b;

    public w(h0 h0Var, int i10) {
        this.f11213a = i10;
        this.f11214b = h0Var;
    }

    @Override
    public void c(Object obj, b2.v vVar) {
        ((b2.e1) obj).onEvents(this.f11214b.f10992f, new b2.d1(vVar));
    }

    @Override
    public void invoke(Object obj) {
        b2.e1 e1Var = (b2.e1) obj;
        switch (this.f11213a) {
            case 3:
                e1Var.onAvailableCommandsChanged(this.f11214b.P);
                return;
            default:
                e1Var.onPlaylistMetadataChanged(this.f11214b.R);
                return;
        }
    }
}
