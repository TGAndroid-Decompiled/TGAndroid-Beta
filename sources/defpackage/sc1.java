package defpackage;
public final class sc1 implements Runnable {
    public final byte a;
    public final tc1 b;
    public final boolean c;

    public sc1(tc1 tc1Var, boolean z, byte b) {
        this.a = b;
        this.b = tc1Var;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        tc1 tc1Var = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    tc1Var.Z0.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!z) {
                    tc1Var.V0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
