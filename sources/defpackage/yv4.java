package defpackage;
public final class yv4 implements Runnable {
    public final byte a;
    public final fw4 b;

    public yv4(fw4 fw4Var, byte b) {
        this.a = b;
        this.b = fw4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        fw4 fw4Var = this.b;
        switch (b) {
            case 0:
                g0d g0dVar = fw4Var.q1;
                va2 va2Var = fw4Var.p1;
                if (va2Var != null) {
                    va2Var.d();
                }
                dw4 dw4Var = fw4Var.B1;
                if (dw4Var != null) {
                    dw4Var.setTranslationY(-g0dVar.d());
                }
                io ioVar = fw4Var.v1;
                if (ioVar != null) {
                    ioVar.setTranslationY(-g0dVar.d());
                }
                fw4Var.D0();
                return;
            case 1:
                fw4Var.B1.performClick();
                return;
            case 2:
                fw4Var.r1.k1();
                return;
            default:
                fw4Var.dismiss();
                return;
        }
    }
}
