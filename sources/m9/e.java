package m9;
public final class e implements Runnable {
    public final o f21024a;
    public final y f21025b;

    public e(o oVar, y yVar) {
        this.f21024a = oVar;
        this.f21025b = yVar;
    }

    @Override
    public final void run() {
        if (this.f21024a.f21040a == this) {
            if (o.f21039f.b(this.f21024a, this, o.j(this.f21025b))) {
                o.g(this.f21024a, false);
            }
        }
    }
}
