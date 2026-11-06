package m9;
public final class e implements Runnable {
    public final o f19970a;
    public final y f19971b;

    public e(o oVar, y yVar) {
        this.f19970a = oVar;
        this.f19971b = yVar;
    }

    @Override
    public final void run() {
        if (this.f19970a.f19986a == this) {
            if (o.f19985f.b(this.f19970a, this, o.j(this.f19971b))) {
                o.g(this.f19970a, false);
            }
        }
    }
}
