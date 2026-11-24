package defpackage;
public final class ts7 implements Runnable {
    public final byte a;
    public final wt7 b;
    public final am9 c;

    public ts7(wt7 wt7Var, am9 am9Var, byte b) {
        this.a = b;
        this.b = wt7Var;
        this.c = am9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        am9 am9Var = this.c;
        wt7 wt7Var = this.b;
        switch (b) {
            case 0:
                wt7Var.D0(am9Var, true);
                return;
            default:
                wt7Var.B0(am9Var);
                return;
        }
    }
}
