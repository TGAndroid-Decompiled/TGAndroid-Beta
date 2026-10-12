package i9;
public final class e implements Runnable {
    public final c0 f12057a;
    public final w f12058b;

    public e(c0 c0Var, w wVar) {
        this.f12057a = c0Var;
        this.f12058b = wVar;
    }

    @Override
    public final void run() {
        if (this.f12057a.f12070a == this) {
            if (o.f12069f.b(this.f12057a, this, o.j(this.f12058b))) {
                o.g(this.f12057a, false);
            }
        }
    }
}
