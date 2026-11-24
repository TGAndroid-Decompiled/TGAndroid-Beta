package defpackage;
public final class nx7 implements ed {
    public final byte a;
    public final rx7 b;

    public nx7(rx7 rx7Var, byte b) {
        this.a = b;
        this.b = rx7Var;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        rx7 rx7Var = this.b;
        switch (b) {
            case 0:
                rx7Var.d(true);
                rx7Var.R.M1(null, 0, true);
                return;
            default:
                rx7Var.d(true);
                rx7Var.R.finishFragment();
                return;
        }
    }
}
