package defpackage;
public final class bi8 implements Runnable {
    public final byte a;
    public final ji8 b;

    public bi8(ji8 ji8Var, boolean z) {
        this.a = (byte) 0;
        this.b = ji8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ji8 ji8Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new bi8(ji8Var, (byte) 3));
                wb2 wb2Var = ji8Var.M;
                if (wb2Var != null) {
                    wb2Var.setVisibility(0);
                    wb2 wb2Var2 = ji8Var.M;
                    wb2Var2.d6 = null;
                    wb2Var2.invalidate();
                }
                st1 st1Var = ji8Var.f0;
                if (st1Var != null) {
                    hl.c3(st1Var);
                    ji8Var.f0 = null;
                    return;
                }
                return;
            case 1:
                ji8Var.b(false);
                return;
            case 2:
                ji8Var.b(false);
                return;
            default:
                ji8Var.c();
                return;
        }
    }

    public bi8(ji8 ji8Var, byte b) {
        this.a = b;
        this.b = ji8Var;
    }
}
