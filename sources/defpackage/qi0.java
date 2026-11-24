package defpackage;
public final class qi0 implements Runnable {
    public final byte a;
    public final int b;
    public final CharSequence c;
    public final aj0 d;

    public qi0(aj0 aj0Var, int i, CharSequence charSequence, byte b) {
        this.a = b;
        this.d = aj0Var;
        this.b = i;
        this.c = charSequence;
    }

    @Override
    public final void run() {
        byte b = this.a;
        CharSequence charSequence = this.c;
        int i = this.b;
        aj0 aj0Var = this.d;
        switch (b) {
            case 0:
                lj0 lj0Var = aj0Var.m0;
                aod aodVar = lj0Var.c;
                aod aodVar2 = aodVar;
                if (aodVar == null) {
                    ?? obj = new Object();
                    lj0Var.c = obj;
                    aodVar2 = obj;
                }
                aodVar2.a(i, charSequence);
                return;
            default:
                aj0Var.U(i, charSequence);
                return;
        }
    }
}
