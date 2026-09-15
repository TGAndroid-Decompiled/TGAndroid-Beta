package i2;
public final class w implements e2.n, e2.m {
    public final int f10911a;
    public final e0 f10912b;

    public w(e0 e0Var, int i10) {
        this.f10911a = i10;
        this.f10912b = e0Var;
    }

    @Override
    public void e(Object obj, b2.q qVar) {
        ((b2.z0) obj).onEvents(this.f10912b.f10651f, new b2.y0(qVar));
    }

    @Override
    public void invoke(Object obj) {
        b2.z0 z0Var = (b2.z0) obj;
        switch (this.f10911a) {
            case 3:
                z0Var.onAvailableCommandsChanged(this.f10912b.N);
                return;
            default:
                z0Var.onPlaylistMetadataChanged(this.f10912b.P);
                return;
        }
    }
}
