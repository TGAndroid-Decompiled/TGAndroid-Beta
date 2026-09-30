package i2;
public final class x implements e2.n, e2.m {
    public final int f10921a;
    public final f0 f10922b;

    public x(f0 f0Var, int i10) {
        this.f10921a = i10;
        this.f10922b = f0Var;
    }

    @Override
    public void e(Object obj, b2.q qVar) {
        ((b2.z0) obj).onEvents(this.f10922b.f10669f, new b2.y0(qVar));
    }

    @Override
    public void invoke(Object obj) {
        b2.z0 z0Var = (b2.z0) obj;
        switch (this.f10921a) {
            case 3:
                z0Var.onAvailableCommandsChanged(this.f10922b.N);
                return;
            default:
                z0Var.onPlaylistMetadataChanged(this.f10922b.P);
                return;
        }
    }
}
