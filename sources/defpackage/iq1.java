package defpackage;
public final class iq1 extends n8 {
    public final zu1 o;

    public iq1(zu1 zu1Var, gq1 gq1Var) {
        super(gq1Var, -2, -2);
        this.o = zu1Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        zu1 zu1Var = this.o;
        if (zu1Var.g9 == this) {
            zu1Var.g9 = null;
            zu1Var.l9 = null;
            zu1Var.k9 = null;
            zu1Var.C0.R = true;
            if (zu1Var.h9) {
                zu1Var.y6(false, true, 0.0f);
            } else {
                zu1Var.h9 = true;
            }
            nr1 nr1Var = zu1Var.a0;
            if (nr1Var != null && nr1Var.getEditField() != null) {
                zu1Var.a0.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
