package i2;
public final class w implements e2.n, e2.m {
    public final int f10913a;
    public final e0 f10914b;

    public w(e0 e0Var, int i10) {
        this.f10913a = i10;
        this.f10914b = e0Var;
    }

    @Override
    public void e(Object obj, b2.q qVar) {
        ((b2.z0) obj).onEvents(this.f10914b.f10653f, new b2.y0(qVar));
    }

    @Override
    public void invoke(Object obj) {
        b2.z0 z0Var = (b2.z0) obj;
        switch (this.f10913a) {
            case 3:
                z0Var.onAvailableCommandsChanged(this.f10914b.N);
                return;
            default:
                z0Var.onPlaylistMetadataChanged(this.f10914b.P);
                return;
        }
    }
}
