package defpackage;
public final class gw6 implements Runnable {
    public final byte a;
    public final hw6 b;

    public gw6(hw6 hw6Var, byte b) {
        this.a = b;
        this.b = hw6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        this.b.j();
    }
}
