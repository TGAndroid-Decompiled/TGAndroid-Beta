package i9;
public final class e implements Runnable {
    public final c0 f11039a;
    public final w f11040b;

    public e(c0 c0Var, w wVar) {
        this.f11039a = c0Var;
        this.f11040b = wVar;
    }

    @Override
    public final void run() {
        if (this.f11039a.f11050a == this) {
            if (o.f11049f.b(this.f11039a, this, o.j(this.f11040b))) {
                o.g(this.f11039a, false);
            }
        }
    }
}
