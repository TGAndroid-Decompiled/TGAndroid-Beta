package k9;
public final class e implements Runnable {
    public final o f16471a;
    public final y f16472b;

    public e(o oVar, y yVar) {
        this.f16471a = oVar;
        this.f16472b = yVar;
    }

    @Override
    public final void run() {
        if (this.f16471a.f16485a == this) {
            if (o.f16484f.b(this.f16471a, this, o.j(this.f16472b))) {
                o.g(this.f16471a, false);
            }
        }
    }
}
