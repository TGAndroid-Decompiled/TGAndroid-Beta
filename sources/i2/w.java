package i2;
public final class w implements e2.p, e2.o {
    public final int f12600a;
    public final h0 f12601b;

    public w(h0 h0Var, int i10) {
        this.f12600a = i10;
        this.f12601b = h0Var;
    }

    @Override
    public void c(Object obj, b2.u uVar) {
        ((b2.d1) obj).onEvents(this.f12601b.f12388f, new b2.c1(uVar));
    }

    @Override
    public void invoke(Object obj) {
        b2.d1 d1Var = (b2.d1) obj;
        switch (this.f12600a) {
            case 3:
                d1Var.onAvailableCommandsChanged(this.f12601b.P);
                return;
            default:
                d1Var.onPlaylistMetadataChanged(this.f12601b.R);
                return;
        }
    }
}
