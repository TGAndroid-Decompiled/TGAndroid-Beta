package i9;
public final class e implements Runnable {
    public final c0 f11025a;
    public final w f11026b;

    public e(c0 c0Var, w wVar) {
        this.f11025a = c0Var;
        this.f11026b = wVar;
    }

    @Override
    public final void run() {
        if (this.f11025a.f11036a == this) {
            if (o.f11035f.b(this.f11025a, this, o.j(this.f11026b))) {
                o.g(this.f11025a, false);
            }
        }
    }
}
