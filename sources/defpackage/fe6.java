package defpackage;
public final class fe6 implements Runnable {
    public final byte a = 1;
    public final mh6 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public fe6(mh6 mh6Var, int i, boolean z, boolean z2) {
        this.b = mh6Var;
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
        mh6 mh6Var = this.b;
        switch (b) {
            case 0:
                mh6Var.L1(z3, z2, z);
                return;
            default:
                boolean z4 = mh6Var.K;
                mh6Var.K = z3;
                mh6Var.L1(z2, z, true);
                mh6Var.K = z4;
                return;
        }
    }

    public fe6(mh6 mh6Var, boolean z, boolean z2, boolean z3) {
        this.b = mh6Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }
}
