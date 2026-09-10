package i2;
public final class w implements e2.n, e2.m {
    public final int f10392a;
    public final e0 f10393b;

    public w(e0 e0Var, int i10) {
        this.f10392a = i10;
        this.f10393b = e0Var;
    }

    @Override
    public void a(Object obj, b2.q qVar) {
        ((b2.z0) obj).onEvents(this.f10393b.f10137f, new b2.y0(qVar));
    }

    @Override
    public void invoke(Object obj) {
        b2.z0 z0Var = (b2.z0) obj;
        switch (this.f10392a) {
            case 3:
                z0Var.onAvailableCommandsChanged(this.f10393b.N);
                return;
            default:
                z0Var.onPlaylistMetadataChanged(this.f10393b.P);
                return;
        }
    }
}
