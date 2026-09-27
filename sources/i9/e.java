package i9;
public final class e implements Runnable {
    public final c0 f11028a;
    public final w f11029b;

    public e(c0 c0Var, w wVar) {
        this.f11028a = c0Var;
        this.f11029b = wVar;
    }

    @Override
    public final void run() {
        if (this.f11028a.f11039a == this) {
            if (o.f11038f.b(this.f11028a, this, o.j(this.f11029b))) {
                o.g(this.f11028a, false);
            }
        }
    }
}
