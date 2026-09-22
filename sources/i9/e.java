package i9;
public final class e implements Runnable {
    public final c0 f11037a;
    public final w f11038b;

    public e(c0 c0Var, w wVar) {
        this.f11037a = c0Var;
        this.f11038b = wVar;
    }

    @Override
    public final void run() {
        if (this.f11037a.f11048a == this) {
            if (o.f11047f.b(this.f11037a, this, o.j(this.f11038b))) {
                o.g(this.f11037a, false);
            }
        }
    }
}
