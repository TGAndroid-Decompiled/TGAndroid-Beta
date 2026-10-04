package i2;
public final class x implements e2.n, e2.m {
    public final int f11883a;
    public final f0 f11884b;

    public x(f0 f0Var, int i10) {
        this.f11883a = i10;
        this.f11884b = f0Var;
    }

    @Override
    public void e(Object obj, b2.q qVar) {
        ((b2.z0) obj).onEvents(this.f11884b.f11613f, new b2.y0(qVar));
    }

    @Override
    public void invoke(Object obj) {
        b2.z0 z0Var = (b2.z0) obj;
        switch (this.f11883a) {
            case 3:
                z0Var.onAvailableCommandsChanged(this.f11884b.N);
                return;
            default:
                z0Var.onPlaylistMetadataChanged(this.f11884b.P);
                return;
        }
    }
}
