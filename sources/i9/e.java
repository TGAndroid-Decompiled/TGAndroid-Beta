package i9;
public final class e implements Runnable {
    public final c0 f12059a;
    public final w f12060b;

    public e(c0 c0Var, w wVar) {
        this.f12059a = c0Var;
        this.f12060b = wVar;
    }

    @Override
    public final void run() {
        if (this.f12059a.f12072a == this) {
            if (o.f12071f.b(this.f12059a, this, o.j(this.f12060b))) {
                o.g(this.f12059a, false);
            }
        }
    }
}
