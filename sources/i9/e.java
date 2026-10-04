package i9;
public final class e implements Runnable {
    public final c0 f12008a;
    public final w f12009b;

    public e(c0 c0Var, w wVar) {
        this.f12008a = c0Var;
        this.f12009b = wVar;
    }

    @Override
    public final void run() {
        if (this.f12008a.f12021a == this) {
            if (o.f12020f.b(this.f12008a, this, o.j(this.f12009b))) {
                o.g(this.f12008a, false);
            }
        }
    }
}
