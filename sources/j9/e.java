package j9;
public final class e implements Runnable {
    public final o f9745a;
    public final y f9746b;

    public e(o oVar, y yVar) {
        this.f9745a = oVar;
        this.f9746b = yVar;
    }

    @Override
    public final void run() {
        if (this.f9745a.f9759a == this) {
            if (o.f9758f.b(this.f9745a, this, o.j(this.f9746b))) {
                o.g(this.f9745a, false);
            }
        }
    }
}
