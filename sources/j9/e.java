package j9;
public final class e implements Runnable {
    public final o f14382a;
    public final y f14383b;

    public e(o oVar, y yVar) {
        this.f14382a = oVar;
        this.f14383b = yVar;
    }

    @Override
    public final void run() {
        if (this.f14382a.f14396a == this) {
            if (o.f14395f.b(this.f14382a, this, o.j(this.f14383b))) {
                o.g(this.f14382a, false);
            }
        }
    }
}
