package defpackage;
public final class t08 implements fd {
    public final byte a;
    public final x08 b;

    public t08(x08 x08Var, byte b) {
        this.a = b;
        this.b = x08Var;
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        x08 x08Var = this.b;
        switch (b) {
            case 0:
                x08Var.c(true);
                x08Var.R.N1(null, 0, true);
                return;
            default:
                x08Var.c(true);
                x08Var.R.finishFragment();
                return;
        }
    }
}
