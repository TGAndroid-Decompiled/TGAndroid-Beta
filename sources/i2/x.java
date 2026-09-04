package i2;
public final class x implements e2.n, e2.m {
    public final int f11775a;
    public final f0 f11776b;

    public x(f0 f0Var, int i10) {
        this.f11775a = i10;
        this.f11776b = f0Var;
    }

    @Override
    public void c(Object obj, b2.q qVar) {
        ((b2.z0) obj).onEvents(this.f11776b.f11513f, new b2.y0(qVar));
    }

    @Override
    public void invoke(Object obj) {
        b2.z0 z0Var = (b2.z0) obj;
        switch (this.f11775a) {
            case 3:
                z0Var.onAvailableCommandsChanged(this.f11776b.N);
                return;
            default:
                z0Var.onPlaylistMetadataChanged(this.f11776b.P);
                return;
        }
    }
}
