package defpackage;
public final class qt2 implements Runnable {
    public final byte a;
    public final cu2 b;

    public qt2(cu2 cu2Var, byte b) {
        this.a = b;
        this.b = cu2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        cu2 cu2Var = this.b;
        switch (b) {
            case 0:
                cu2Var.d0();
                return;
            case 1:
                if (cu2Var.K) {
                    cu2Var.d.d.requestFocus();
                    hl.E3(cu2Var.d.d);
                    return;
                }
                return;
            default:
                cu2Var.presentFragment(zu1.ha(cu2Var.I), true);
                return;
        }
    }
}
