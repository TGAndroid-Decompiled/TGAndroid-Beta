package defpackage;
public final class mx4 implements Runnable {
    public final byte a;
    public final ox4 b;
    public final boolean c;

    public mx4(ox4 ox4Var, boolean z, byte b) {
        this.a = b;
        this.b = ox4Var;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        ox4 ox4Var = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    ox4Var.H.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!z) {
                    ox4Var.w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
