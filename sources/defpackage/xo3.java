package defpackage;
public final class xo3 implements Runnable {
    public final boolean a;
    public final xm5 b;

    public xo3(int i, xm5 xm5Var) {
        this.a = i;
        this.b = xm5Var;
    }

    @Override
    public final void run() {
        this.b.run();
    }
}
