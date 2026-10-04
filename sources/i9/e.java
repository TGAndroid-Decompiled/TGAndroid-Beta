package i9;
public final class e implements Runnable {
    public final c0 f12009a;
    public final w f12010b;

    public e(c0 c0Var, w wVar) {
        this.f12009a = c0Var;
        this.f12010b = wVar;
    }

    @Override
    public final void run() {
        if (this.f12009a.f12022a == this) {
            if (o.f12021f.b(this.f12009a, this, o.j(this.f12010b))) {
                o.g(this.f12009a, false);
            }
        }
    }
}
