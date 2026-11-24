package defpackage;
public final class ma1 implements Runnable {
    public final byte a;
    public final oa1 b;

    public ma1(oa1 oa1Var, byte b) {
        this.a = b;
        this.b = oa1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        oa1 oa1Var = this.b;
        switch (b) {
            case 0:
                oa1Var.x = false;
                oa1Var.c();
                return;
            default:
                oa1Var.a.setVisibility(4);
                return;
        }
    }
}
