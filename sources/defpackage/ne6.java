package defpackage;
public final class ne6 implements Runnable {
    public final byte a = 1;
    public final qh6 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ne6(qh6 qh6Var, int i, boolean z, boolean z2) {
        this.b = qh6Var;
        this.c = i;
        this.d = z;
        this.e = z2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.e;
        boolean z2 = this.d;
        boolean z3 = this.c;
        qh6 qh6Var = this.b;
        switch (b) {
            case 0:
                qh6Var.L1(z3, z2, z);
                return;
            default:
                boolean z4 = qh6Var.K;
                qh6Var.K = z3;
                qh6Var.L1(z2, z, true);
                qh6Var.K = z4;
                return;
        }
    }

    public ne6(qh6 qh6Var, boolean z, boolean z2, boolean z3) {
        this.b = qh6Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }
}
