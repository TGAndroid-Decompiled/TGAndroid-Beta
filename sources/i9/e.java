package i9;
public final class e implements Runnable {
    public final c0 f11930a;
    public final w f11931b;

    public e(c0 c0Var, w wVar) {
        this.f11930a = c0Var;
        this.f11931b = wVar;
    }

    @Override
    public final void run() {
        if (this.f11930a.f11943a == this) {
            if (o.f11942f.b(this.f11930a, this, o.j(this.f11931b))) {
                o.g(this.f11930a, false);
            }
        }
    }
}
