package j9;
public final class e implements Runnable {
    public final o f14337a;
    public final y f14338b;

    public e(o oVar, y yVar) {
        this.f14337a = oVar;
        this.f14338b = yVar;
    }

    @Override
    public final void run() {
        if (this.f14337a.f14351a == this) {
            if (o.f14350f.b(this.f14337a, this, o.j(this.f14338b))) {
                o.g(this.f14337a, false);
            }
        }
    }
}
