package j9;
public final class e implements Runnable {
    public final o f9744a;
    public final y f9745b;

    public e(o oVar, y yVar) {
        this.f9744a = oVar;
        this.f9745b = yVar;
    }

    @Override
    public final void run() {
        if (this.f9744a.f9758a == this) {
            if (o.f9757f.b(this.f9744a, this, o.j(this.f9745b))) {
                o.g(this.f9744a, false);
            }
        }
    }
}
