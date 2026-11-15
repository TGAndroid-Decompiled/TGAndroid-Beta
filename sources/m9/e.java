package m9;
public final class e implements Runnable {
    public final o f20570a;
    public final y f20571b;

    public e(o oVar, y yVar) {
        this.f20570a = oVar;
        this.f20571b = yVar;
    }

    @Override
    public final void run() {
        if (this.f20570a.f20586a == this) {
            if (o.f20585f.b(this.f20570a, this, o.j(this.f20571b))) {
                o.g(this.f20570a, false);
            }
        }
    }
}
