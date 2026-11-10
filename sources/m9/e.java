package m9;
public final class e implements Runnable {
    public final o f19978a;
    public final y f19979b;

    public e(o oVar, y yVar) {
        this.f19978a = oVar;
        this.f19979b = yVar;
    }

    @Override
    public final void run() {
        if (this.f19978a.f19994a == this) {
            if (o.f19993f.b(this.f19978a, this, o.j(this.f19979b))) {
                o.g(this.f19978a, false);
            }
        }
    }
}
