package i9;
public final class e implements Runnable {
    public final c0 f11035a;
    public final w f11036b;

    public e(c0 c0Var, w wVar) {
        this.f11035a = c0Var;
        this.f11036b = wVar;
    }

    @Override
    public final void run() {
        if (this.f11035a.f11046a == this) {
            if (o.f11045f.b(this.f11035a, this, o.j(this.f11036b))) {
                o.g(this.f11035a, false);
            }
        }
    }
}
