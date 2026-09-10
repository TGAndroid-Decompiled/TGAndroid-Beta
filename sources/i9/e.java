package i9;
public final class e implements Runnable {
    public final c0 f10519a;
    public final w f10520b;

    public e(c0 c0Var, w wVar) {
        this.f10519a = c0Var;
        this.f10520b = wVar;
    }

    @Override
    public final void run() {
        if (this.f10519a.f10530a == this) {
            if (o.f10529f.b(this.f10519a, this, o.j(this.f10520b))) {
                o.g(this.f10519a, false);
            }
        }
    }
}
