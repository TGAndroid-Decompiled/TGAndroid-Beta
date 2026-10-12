package j9;
public final class e implements Runnable {
    public final o f12921a;
    public final y f12922b;

    public e(o oVar, y yVar) {
        this.f12921a = oVar;
        this.f12922b = yVar;
    }

    @Override
    public final void run() {
        if (this.f12921a.f12935a == this) {
            if (o.f12934f.b(this.f12921a, this, o.j(this.f12922b))) {
                o.g(this.f12921a, false);
            }
        }
    }
}
