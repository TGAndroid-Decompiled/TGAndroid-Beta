package m9;
public final class e implements Runnable {
    public final o f19973a;
    public final y f19974b;

    public e(o oVar, y yVar) {
        this.f19973a = oVar;
        this.f19974b = yVar;
    }

    @Override
    public final void run() {
        if (this.f19973a.f19989a == this) {
            if (o.f19988f.b(this.f19973a, this, o.j(this.f19974b))) {
                o.g(this.f19973a, false);
            }
        }
    }
}
