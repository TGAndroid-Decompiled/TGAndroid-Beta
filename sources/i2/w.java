package i2;
public final class w implements e2.n, e2.m {
    public final int f10914a;
    public final e0 f10915b;

    public w(e0 e0Var, int i10) {
        this.f10914a = i10;
        this.f10915b = e0Var;
    }

    @Override
    public void e(Object obj, b2.q qVar) {
        ((b2.z0) obj).onEvents(this.f10915b.f10654f, new b2.y0(qVar));
    }

    @Override
    public void invoke(Object obj) {
        b2.z0 z0Var = (b2.z0) obj;
        switch (this.f10914a) {
            case 3:
                z0Var.onAvailableCommandsChanged(this.f10915b.N);
                return;
            default:
                z0Var.onPlaylistMetadataChanged(this.f10915b.P);
                return;
        }
    }
}
