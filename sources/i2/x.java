package i2;
public final class x implements e2.p, e2.o {
    public final int f13785a;
    public final j0 f13786b;

    public x(j0 j0Var, int i10) {
        this.f13785a = i10;
        this.f13786b = j0Var;
    }

    @Override
    public void f(Object obj, b2.v vVar) {
        ((b2.e1) obj).onEvents(this.f13786b.f13589f, new b2.d1(vVar));
    }

    @Override
    public void invoke(Object obj) {
        b2.e1 e1Var = (b2.e1) obj;
        switch (this.f13785a) {
            case 3:
                e1Var.onAvailableCommandsChanged(this.f13786b.P);
                return;
            default:
                e1Var.onPlaylistMetadataChanged(this.f13786b.R);
                return;
        }
    }
}
