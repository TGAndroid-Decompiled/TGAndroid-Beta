package j9;
public final class e implements Runnable {
    public final o f14332a;
    public final y f14333b;

    public e(o oVar, y yVar) {
        this.f14332a = oVar;
        this.f14333b = yVar;
    }

    @Override
    public final void run() {
        if (this.f14332a.f14346a == this) {
            if (o.f14345f.b(this.f14332a, this, o.j(this.f14333b))) {
                o.g(this.f14332a, false);
            }
        }
    }
}
