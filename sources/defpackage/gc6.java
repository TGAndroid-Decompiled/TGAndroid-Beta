package defpackage;
public final class gc6 implements Runnable {
    public final byte a = 1;
    public final mf6 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public gc6(mf6 mf6Var, int i, boolean z, boolean z2) {
        this.b = mf6Var;
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
        mf6 mf6Var = this.b;
        switch (b) {
            case 0:
                mf6Var.K1(z3, z2, z);
                return;
            default:
                boolean z4 = mf6Var.K;
                mf6Var.K = z3;
                mf6Var.K1(z2, z, true);
                mf6Var.K = z4;
                return;
        }
    }

    public gc6(mf6 mf6Var, boolean z, boolean z2, boolean z3) {
        this.b = mf6Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }
}
