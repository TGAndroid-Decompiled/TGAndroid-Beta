package i2;
public final class x implements e2.n, e2.m {
    public final int f11933a;
    public final f0 f11934b;

    public x(f0 f0Var, int i10) {
        this.f11933a = i10;
        this.f11934b = f0Var;
    }

    @Override
    public void e(Object obj, b2.q qVar) {
        ((b2.z0) obj).onEvents(this.f11934b.f11663f, new b2.y0(qVar));
    }

    @Override
    public void invoke(Object obj) {
        b2.z0 z0Var = (b2.z0) obj;
        switch (this.f11933a) {
            case 3:
                z0Var.onAvailableCommandsChanged(this.f11934b.N);
                return;
            default:
                z0Var.onPlaylistMetadataChanged(this.f11934b.P);
                return;
        }
    }
}
