package i2;
public final class v implements e2.p, e2.o {
    public final int f12599a;
    public final g0 f12600b;

    public v(g0 g0Var, int i10) {
        this.f12599a = i10;
        this.f12600b = g0Var;
    }

    @Override
    public void c(Object obj, b2.u uVar) {
        ((b2.d1) obj).onEvents(this.f12600b.f12384f, new b2.c1(uVar));
    }

    @Override
    public void invoke(Object obj) {
        b2.d1 d1Var = (b2.d1) obj;
        switch (this.f12599a) {
            case 3:
                d1Var.onAvailableCommandsChanged(this.f12600b.P);
                return;
            default:
                d1Var.onPlaylistMetadataChanged(this.f12600b.R);
                return;
        }
    }
}
