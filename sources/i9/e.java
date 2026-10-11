package i9;
public final class e implements Runnable {
    public final c0 f12058a;
    public final w f12059b;

    public e(c0 c0Var, w wVar) {
        this.f12058a = c0Var;
        this.f12059b = wVar;
    }

    @Override
    public final void run() {
        if (this.f12058a.f12071a == this) {
            if (o.f12070f.b(this.f12058a, this, o.j(this.f12059b))) {
                o.g(this.f12058a, false);
            }
        }
    }
}
