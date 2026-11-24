package defpackage;
public final class ux6 implements Runnable {
    public final byte a;
    public final ly6 b;

    public ux6(ly6 ly6Var, byte b) {
        this.a = b;
        this.b = ly6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ly6 ly6Var = this.b;
        switch (b) {
            case 0:
                ly6Var.m0(new ux6(ly6Var, (byte) 1));
                return;
            default:
                ly6Var.p0();
                return;
        }
    }
}
