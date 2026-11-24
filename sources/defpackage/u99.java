package defpackage;
public final class u99 implements Runnable {
    public final byte a;
    public final y99 b;

    public u99(y99 y99Var, byte b) {
        this.a = b;
        this.b = y99Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        y99 y99Var = this.b;
        switch (b) {
            case 0:
                y99Var.Y0();
                return;
            default:
                y99Var.d2.O(true);
                gl.e3(new u99(y99Var, (byte) 0), 150L);
                return;
        }
    }
}
