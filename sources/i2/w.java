package i2;
public final class w implements e2.n, e2.m {
    public final int f10915a;
    public final e0 f10916b;

    public w(e0 e0Var, int i10) {
        this.f10915a = i10;
        this.f10916b = e0Var;
    }

    @Override
    public void e(Object obj, b2.q qVar) {
        ((b2.z0) obj).onEvents(this.f10916b.f10655f, new b2.y0(qVar));
    }

    @Override
    public void invoke(Object obj) {
        b2.z0 z0Var = (b2.z0) obj;
        switch (this.f10915a) {
            case 3:
                z0Var.onAvailableCommandsChanged(this.f10916b.N);
                return;
            default:
                z0Var.onPlaylistMetadataChanged(this.f10916b.P);
                return;
        }
    }
}
