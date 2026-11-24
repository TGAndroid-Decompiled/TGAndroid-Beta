package defpackage;
public final class lb1 implements Runnable {
    public final byte a;
    public final mb1 b;
    public final boolean c;

    public lb1(mb1 mb1Var, boolean z, byte b) {
        this.a = b;
        this.b = mb1Var;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        mb1 mb1Var = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    mb1Var.Z0.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!z) {
                    mb1Var.V0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
