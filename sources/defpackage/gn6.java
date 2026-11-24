package defpackage;
public final class gn6 implements Runnable {
    public final byte a;
    public final hq6 b;
    public final boolean c;
    public final int d;

    public gn6(hq6 hq6Var, boolean z, int i, byte b) {
        this.a = b;
        this.b = hq6Var;
        this.c = z;
        this.d = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.d;
        boolean z = this.c;
        hq6 hq6Var = this.b;
        switch (b) {
            case 0:
                hq6Var.x0[z ? 1 : 0] = false;
                hq6Var.y0[z ? 1 : 0] = true;
                hq6Var.r0[z ? 1 : 0] = i;
                return;
            default:
                hq6Var.r0[z ? 1 : 0] = i;
                return;
        }
    }
}
