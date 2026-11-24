package defpackage;
public final class zg7 implements Runnable {
    public final byte a;
    public final ah7 b;

    public zg7(ah7 ah7Var, byte b) {
        this.a = b;
        this.b = ah7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ah7 ah7Var = this.b;
        switch (b) {
            case 0:
                ah7Var.x();
                return;
            default:
                ah7Var.m(true);
                return;
        }
    }
}
