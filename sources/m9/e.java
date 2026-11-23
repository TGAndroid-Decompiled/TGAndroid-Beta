package m9;
public final class e implements Runnable {
    public final o f20962a;
    public final y f20963b;

    public e(o oVar, y yVar) {
        this.f20962a = oVar;
        this.f20963b = yVar;
    }

    @Override
    public final void run() {
        if (this.f20962a.f20978a == this) {
            if (o.f20977f.b(this.f20962a, this, o.j(this.f20963b))) {
                o.g(this.f20962a, false);
            }
        }
    }
}
