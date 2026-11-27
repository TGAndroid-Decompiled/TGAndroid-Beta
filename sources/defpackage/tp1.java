package defpackage;
public final class tp1 extends n8 {
    public final i49 o;
    public final zu1 p;

    public tp1(zu1 zu1Var, hf1 hf1Var, i49 i49Var) {
        super(hf1Var, -2, -2);
        this.p = zu1Var;
        this.o = i49Var;
    }

    @Override
    public final void d(boolean z) {
        super.d(z);
        i49 i49Var = this.o;
        if (i49Var != null) {
            i49Var.a(z);
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        zu1 zu1Var = this.p;
        if (zu1Var.g9 == this) {
            v21 v21Var = v21.x;
            v21 v21Var2 = zu1Var.C1;
            if (v21Var == v21Var2 && v21Var2 != null) {
                v21Var2.b();
                zu1Var.C1 = null;
            }
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
