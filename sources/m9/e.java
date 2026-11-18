package m9;
public final class e implements Runnable {
    public final o f20934a;
    public final y f20935b;

    public e(o oVar, y yVar) {
        this.f20934a = oVar;
        this.f20935b = yVar;
    }

    @Override
    public final void run() {
        if (this.f20934a.f20950a == this) {
            if (o.f20949f.b(this.f20934a, this, o.j(this.f20935b))) {
                o.g(this.f20934a, false);
            }
        }
    }
}
