package defpackage;
public final class ri0 implements Runnable {
    public final byte a;
    public final int b;
    public final CharSequence c;
    public final bj0 d;

    public ri0(bj0 bj0Var, int i, CharSequence charSequence, byte b) {
        this.a = b;
        this.d = bj0Var;
        this.b = i;
        this.c = charSequence;
    }

    @Override
    public final void run() {
        byte b = this.a;
        CharSequence charSequence = this.c;
        int i = this.b;
        bj0 bj0Var = this.d;
        switch (b) {
            case 0:
                mj0 mj0Var = bj0Var.m0;
                rsd rsdVar = mj0Var.c;
                rsd rsdVar2 = rsdVar;
                if (rsdVar == null) {
                    ?? obj = new Object();
                    mj0Var.c = obj;
                    rsdVar2 = obj;
                }
                rsdVar2.a(i, charSequence);
                return;
            default:
                bj0Var.U(i, charSequence);
                return;
        }
    }
}
