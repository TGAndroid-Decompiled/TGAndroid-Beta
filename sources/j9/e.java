package j9;
public final class e implements Runnable {
    public final o f12925a;
    public final y f12926b;

    public e(o oVar, y yVar) {
        this.f12925a = oVar;
        this.f12926b = yVar;
    }

    @Override
    public final void run() {
        if (this.f12925a.f12939a == this) {
            if (o.f12938f.b(this.f12925a, this, o.j(this.f12926b))) {
                o.g(this.f12925a, false);
            }
        }
    }
}
