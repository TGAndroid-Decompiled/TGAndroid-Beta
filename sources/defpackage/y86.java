package defpackage;
public final class y86 implements Runnable {
    public final byte a;
    public final sx5 b;
    public final h96 c;

    public y86(sx5 sx5Var, h96 h96Var, byte b) {
        this.a = b;
        this.b = sx5Var;
        this.c = h96Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        h96 h96Var = this.c;
        sx5 sx5Var = this.b;
        switch (b) {
            case 0:
                sx5Var.run();
                h96Var.a();
                return;
            default:
                sx5Var.run();
                h96Var.a();
                return;
        }
    }
}
