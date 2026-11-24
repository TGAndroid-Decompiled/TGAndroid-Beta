package defpackage;
public final class qj0 implements Runnable {
    public final byte a;
    public final int b;
    public final CharSequence c;
    public final ak0 d;

    public qj0(ak0 ak0Var, int i, CharSequence charSequence, byte b) {
        this.a = b;
        this.d = ak0Var;
        this.b = i;
        this.c = charSequence;
    }

    @Override
    public final void run() {
        byte b = this.a;
        CharSequence charSequence = this.c;
        int i = this.b;
        ak0 ak0Var = this.d;
        switch (b) {
            case 0:
                lk0 lk0Var = ak0Var.m0;
                dqd dqdVar = lk0Var.c;
                dqd dqdVar2 = dqdVar;
                if (dqdVar == null) {
                    ?? obj = new Object();
                    lk0Var.c = obj;
                    dqdVar2 = obj;
                }
                dqdVar2.a(i, charSequence);
                return;
            default:
                ak0Var.U(i, charSequence);
                return;
        }
    }
}
