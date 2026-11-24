package defpackage;
public final class lv4 implements Runnable {
    public final byte a;
    public final nv4 b;
    public final boolean c;

    public lv4(nv4 nv4Var, boolean z, byte b) {
        this.a = b;
        this.b = nv4Var;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        nv4 nv4Var = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    nv4Var.H.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!z) {
                    nv4Var.w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
