package h3;
public final class d0 implements d5.k {
    public final int f9373a = 0;
    public final e5.z f9374b;

    @Override
    public final void invoke(Object obj) {
        switch (this.f9373a) {
            case 0:
                ((a2) obj).onVideoSizeChanged(this.f9374b);
                return;
            default:
                e5.z zVar = this.f9374b;
                ((i3.b) obj).d(zVar);
                int i9 = zVar.f4954a;
                return;
        }
    }

    public d0(i3.a aVar, e5.z zVar) {
        this.f9374b = zVar;
    }
}
