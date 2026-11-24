package defpackage;
public final class bu6 implements Runnable {
    public final byte a;
    public final cu6 b;

    public bu6(cu6 cu6Var, byte b) {
        this.a = b;
        this.b = cu6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        this.b.i();
    }
}
