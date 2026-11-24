package defpackage;
public final class a96 implements Runnable {
    public final byte a;
    public final k96 b;
    public final int c;

    public a96(k96 k96Var, int i, byte b) {
        this.a = b;
        this.b = k96Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        k96 k96Var = this.b;
        switch (b) {
            case 0:
                k96Var.P = false;
                k96Var.j(i);
                return;
            case 1:
                k96Var.P = false;
                k96Var.j(i);
                return;
            case 2:
                k96Var.Z0(i, null, true, null);
                return;
            default:
                k96Var.Z0(i, null, true, null);
                return;
        }
    }
}
