package l9;
public final class e implements Runnable {
    public final o f18141a;
    public final y f18142b;

    public e(o oVar, y yVar) {
        this.f18141a = oVar;
        this.f18142b = yVar;
    }

    @Override
    public final void run() {
        if (this.f18141a.f18157a == this) {
            if (o.f18156f.b(this.f18141a, this, o.j(this.f18142b))) {
                o.g(this.f18141a, false);
            }
        }
    }
}
