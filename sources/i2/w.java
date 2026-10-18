package i2;
public final class w implements e2.p, e2.o {
    public final int f12598a;
    public final h0 f12599b;

    public w(h0 h0Var, int i10) {
        this.f12598a = i10;
        this.f12599b = h0Var;
    }

    @Override
    public void c(Object obj, b2.u uVar) {
        ((b2.d1) obj).onEvents(this.f12599b.f12386f, new b2.c1(uVar));
    }

    @Override
    public void invoke(Object obj) {
        b2.d1 d1Var = (b2.d1) obj;
        switch (this.f12598a) {
            case 3:
                d1Var.onAvailableCommandsChanged(this.f12599b.P);
                return;
            default:
                d1Var.onPlaylistMetadataChanged(this.f12599b.R);
                return;
        }
    }
}
