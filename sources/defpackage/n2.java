package defpackage;
public final class n2 implements Runnable {
    public final u2 a;
    public final x76 b;

    public n2(u2 u2Var, x76 x76Var) {
        this.a = u2Var;
        this.b = x76Var;
    }

    @Override
    public final void run() {
        if (this.a.a == this) {
            if (u2.f.b(this.a, this, u2.i(this.b))) {
                u2.f(this.a, false);
            }
        }
    }
}
