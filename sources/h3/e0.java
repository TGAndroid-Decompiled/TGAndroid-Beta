package h3;

public final class e0 implements d5.k {

    public final int f7811a = 0;

    public final e5.x f7812b;

    @Override
    public final void invoke(Object obj) {
        switch (this.f7811a) {
            case 0:
                ((a2) obj).onVideoSizeChanged(this.f7812b);
                break;
            default:
                e5.x xVar = this.f7812b;
                ((i3.b) obj).d(xVar);
                int i10 = xVar.f5308a;
                break;
        }
    }

    public e0(i3.a aVar, e5.x xVar) {
        this.f7812b = xVar;
    }
}
