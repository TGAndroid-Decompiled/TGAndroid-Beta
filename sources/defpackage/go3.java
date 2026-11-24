package defpackage;
public final class go3 implements Runnable {
    public final boolean a;
    public final uk5 b;

    public go3(int i, uk5 uk5Var) {
        this.a = i;
        this.b = uk5Var;
    }

    @Override
    public final void run() {
        this.b.run();
    }
}
