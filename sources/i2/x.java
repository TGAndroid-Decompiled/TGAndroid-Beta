package i2;
public final class x implements e2.p, e2.o {
    public final int f12601a;
    public final i0 f12602b;

    public x(i0 i0Var, int i10) {
        this.f12601a = i10;
        this.f12602b = i0Var;
    }

    @Override
    public void c(Object obj, b2.u uVar) {
        ((b2.d1) obj).onEvents(this.f12602b.f12389f, new b2.c1(uVar));
    }

    @Override
    public void invoke(Object obj) {
        b2.d1 d1Var = (b2.d1) obj;
        switch (this.f12601a) {
            case 3:
                d1Var.onAvailableCommandsChanged(this.f12602b.P);
                return;
            default:
                d1Var.onPlaylistMetadataChanged(this.f12602b.R);
                return;
        }
    }
}
