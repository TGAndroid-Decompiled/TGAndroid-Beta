package i2;
public final class x implements e2.n, e2.m {
    public final int f11801a;
    public final f0 f11802b;

    public x(f0 f0Var, int i10) {
        this.f11801a = i10;
        this.f11802b = f0Var;
    }

    @Override
    public void c(Object obj, b2.q qVar) {
        ((b2.z0) obj).onEvents(this.f11802b.f11539f, new b2.y0(qVar));
    }

    @Override
    public void invoke(Object obj) {
        b2.z0 z0Var = (b2.z0) obj;
        switch (this.f11801a) {
            case 3:
                z0Var.onAvailableCommandsChanged(this.f11802b.N);
                return;
            default:
                z0Var.onPlaylistMetadataChanged(this.f11802b.P);
                return;
        }
    }
}
