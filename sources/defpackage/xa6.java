package defpackage;
public final class xa6 implements Runnable {
    public final byte a;
    public final dt5 b;
    public final gb6 c;

    public xa6(dt5 dt5Var, gb6 gb6Var, byte b) {
        this.a = b;
        this.b = dt5Var;
        this.c = gb6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        gb6 gb6Var = this.c;
        dt5 dt5Var = this.b;
        switch (b) {
            case 0:
                dt5Var.run();
                gb6Var.a();
                return;
            default:
                dt5Var.run();
                gb6Var.a();
                return;
        }
    }
}
