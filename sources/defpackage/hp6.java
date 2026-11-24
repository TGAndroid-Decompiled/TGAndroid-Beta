package defpackage;
public final class hp6 implements Runnable {
    public final byte a;
    public final hs6 b;
    public final boolean c;
    public final int d;

    public hp6(hs6 hs6Var, boolean z, int i, byte b) {
        this.a = b;
        this.b = hs6Var;
        this.c = z;
        this.d = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.d;
        boolean z = this.c;
        hs6 hs6Var = this.b;
        switch (b) {
            case 0:
                hs6Var.x0[z ? 1 : 0] = false;
                hs6Var.y0[z ? 1 : 0] = true;
                hs6Var.r0[z ? 1 : 0] = i;
                return;
            default:
                hs6Var.r0[z ? 1 : 0] = i;
                return;
        }
    }
}
