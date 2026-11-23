package m9;
public final class e implements Runnable {
    public final o f20928a;
    public final y f20929b;

    public e(o oVar, y yVar) {
        this.f20928a = oVar;
        this.f20929b = yVar;
    }

    @Override
    public final void run() {
        if (this.f20928a.f20944a == this) {
            if (o.f20943f.b(this.f20928a, this, o.j(this.f20929b))) {
                o.g(this.f20928a, false);
            }
        }
    }
}
