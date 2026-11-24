package defpackage;
public final class hl9 implements Runnable {
    public final byte a;
    public final ul9 b;
    public final ql9 c;

    public hl9(ul9 ul9Var, ql9 ql9Var, Exception exc) {
        this.a = (byte) 1;
        this.b = ul9Var;
        this.c = ql9Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                ul9 ul9Var = this.b;
                ql9 ql9Var = this.c;
                ((lgb) ul9Var.e).c(ql9Var.a);
                return;
            case 1:
                ul9 ul9Var2 = this.b;
                ql9 ql9Var2 = this.c;
                rl9 rl9Var = ul9Var2.e;
                long j = ql9Var2.a;
                lgb lgbVar = (lgb) rl9Var;
                synchronized (lgbVar) {
                    lgbVar.c(j);
                }
                return;
            default:
                ul9 ul9Var3 = this.b;
                ql9 ql9Var3 = this.c;
                ((lgb) ul9Var3.e).c(ql9Var3.a);
                return;
        }
    }

    public hl9(ul9 ul9Var, ql9 ql9Var, int i, byte b) {
        this.a = b;
        this.b = ul9Var;
        this.c = ql9Var;
    }
}
