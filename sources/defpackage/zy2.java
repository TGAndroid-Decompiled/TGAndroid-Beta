package defpackage;
public final class zy2 implements Runnable {
    public final byte a;
    public final zc1 b;
    public final oy8 c;

    public zy2(zc1 zc1Var, oy8 oy8Var, byte b) {
        this.a = b;
        this.b = zc1Var;
        this.c = oy8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        oy8 oy8Var = this.c;
        zc1 zc1Var = this.b;
        switch (b) {
            case 0:
                zc1Var.a(oy8Var);
                return;
            default:
                zc1Var.a(oy8Var);
                return;
        }
    }
}
