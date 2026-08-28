package i3;
public final class c implements d5.k {
    public final int f10883a;
    public final a f10884b;

    public c(a aVar, int i9) {
        this.f10883a = i9;
        this.f10884b = aVar;
    }

    @Override
    public final void invoke(Object obj) {
        switch (this.f10883a) {
            case 0:
                ((b) obj).onSeekStarted(this.f10884b);
                return;
            default:
                ((b) obj).f(this.f10884b);
                return;
        }
    }
}
