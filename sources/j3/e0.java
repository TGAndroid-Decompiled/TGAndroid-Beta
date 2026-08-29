package j3;
public final class e0 implements f5.j {
    public final int f10418a = 0;
    public final g5.y f10419b;

    @Override
    public final void invoke(Object obj) {
        switch (this.f10418a) {
            case 0:
                ((a2) obj).onVideoSizeChanged(this.f10419b);
                return;
            default:
                g5.y yVar = this.f10419b;
                ((k3.b) obj).d(yVar);
                int i10 = yVar.f7106a;
                return;
        }
    }

    public e0(k3.a aVar, g5.y yVar) {
        this.f10419b = yVar;
    }
}
