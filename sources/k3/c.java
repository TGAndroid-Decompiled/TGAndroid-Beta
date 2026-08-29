package k3;
public final class c implements f5.j {
    public final int f13407a;
    public final a f13408b;

    public c(a aVar, int i10) {
        this.f13407a = i10;
        this.f13408b = aVar;
    }

    @Override
    public final void invoke(Object obj) {
        switch (this.f13407a) {
            case 0:
                ((b) obj).onSeekStarted(this.f13408b);
                return;
            default:
                ((b) obj).c(this.f13408b);
                return;
        }
    }
}
