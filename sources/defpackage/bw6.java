package defpackage;
public final class bw6 implements Runnable {
    public final byte a;
    public final cw6 b;

    public bw6(cw6 cw6Var, byte b) {
        this.a = b;
        this.b = cw6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        this.b.j();
    }
}
