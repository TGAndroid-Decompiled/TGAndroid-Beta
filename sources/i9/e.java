package i9;
public final class e implements Runnable {
    public final c0 f11038a;
    public final w f11039b;

    public e(c0 c0Var, w wVar) {
        this.f11038a = c0Var;
        this.f11039b = wVar;
    }

    @Override
    public final void run() {
        if (this.f11038a.f11049a == this) {
            if (o.f11048f.b(this.f11038a, this, o.j(this.f11039b))) {
                o.g(this.f11038a, false);
            }
        }
    }
}
