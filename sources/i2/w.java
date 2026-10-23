package i2;
public final class w implements e2.p, e2.o {
    public final int f12630a;
    public final h0 f12631b;

    public w(h0 h0Var, int i10) {
        this.f12630a = i10;
        this.f12631b = h0Var;
    }

    @Override
    public void a(Object obj, b2.u uVar) {
        ((b2.d1) obj).onEvents(this.f12631b.f12418f, new b2.c1(uVar));
    }

    @Override
    public void invoke(Object obj) {
        b2.d1 d1Var = (b2.d1) obj;
        switch (this.f12630a) {
            case 3:
                d1Var.onAvailableCommandsChanged(this.f12631b.P);
                return;
            default:
                d1Var.onPlaylistMetadataChanged(this.f12631b.R);
                return;
        }
    }
}
