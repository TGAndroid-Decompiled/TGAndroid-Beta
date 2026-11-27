package defpackage;
public final class zp6 implements Runnable {
    public final byte a;
    public final ls6 b;
    public final boolean c;
    public final int d;

    public zp6(ls6 ls6Var, boolean z, int i, byte b) {
        this.a = b;
        this.b = ls6Var;
        this.c = z;
        this.d = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.d;
        boolean z = this.c;
        ls6 ls6Var = this.b;
        switch (b) {
            case 0:
                ls6Var.r0[z ? 1 : 0] = i;
                return;
            default:
                ls6Var.x0[z ? 1 : 0] = false;
                ls6Var.y0[z ? 1 : 0] = true;
                ls6Var.r0[z ? 1 : 0] = i;
                return;
        }
    }
}
