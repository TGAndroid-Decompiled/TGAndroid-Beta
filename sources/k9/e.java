package k9;
public final class e implements Runnable {
    public final o f16472a;
    public final y f16473b;

    public e(o oVar, y yVar) {
        this.f16472a = oVar;
        this.f16473b = yVar;
    }

    @Override
    public final void run() {
        if (this.f16472a.f16486a == this) {
            if (o.f16485f.b(this.f16472a, this, o.j(this.f16473b))) {
                o.g(this.f16472a, false);
            }
        }
    }
}
