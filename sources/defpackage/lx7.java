package defpackage;
public final class lx7 implements Runnable {
    public final byte a;
    public final nx7 b;
    public final rx c;

    public lx7(nx7 nx7Var, rx rxVar, byte b) {
        this.a = b;
        this.b = nx7Var;
        this.c = rxVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        rx rxVar = this.c;
        nx7 nx7Var = this.b;
        switch (b) {
            case 0:
                nx7Var.p(rxVar, true);
                return;
            default:
                nx7Var.f.f(new lx7(nx7Var, rxVar, (byte) 0));
                return;
        }
    }
}
