package m9;
public final class e implements Runnable {
    public final o f20931a;
    public final y f20932b;

    public e(o oVar, y yVar) {
        this.f20931a = oVar;
        this.f20932b = yVar;
    }

    @Override
    public final void run() {
        if (this.f20931a.f20947a == this) {
            if (o.f20946f.b(this.f20931a, this, o.j(this.f20932b))) {
                o.g(this.f20931a, false);
            }
        }
    }
}
