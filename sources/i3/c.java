package i3;

public final class c implements d5.k {

    public final int f10524a;

    public final a f10525b;

    public c(a aVar, int i10) {
        this.f10524a = i10;
        this.f10525b = aVar;
    }

    @Override
    public final void invoke(Object obj) {
        switch (this.f10524a) {
            case 0:
                ((b) obj).onSeekStarted(this.f10525b);
                break;
            default:
                ((b) obj).f(this.f10525b);
                break;
        }
    }
}
