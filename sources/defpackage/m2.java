package defpackage;
public final class m2 implements Runnable {
    public final t2 a;
    public final t56 b;

    public m2(t2 t2Var, t56 t56Var) {
        this.a = t2Var;
        this.b = t56Var;
    }

    @Override
    public final void run() {
        if (this.a.a == this) {
            if (t2.f.b(this.a, this, t2.i(this.b))) {
                t2.f(this.a, false);
            }
        }
    }
}
