package defpackage;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class v42 implements Runnable {
    public final byte a;
    public final c52 b;

    public v42(c52 c52Var, byte b) {
        this.a = b;
        this.b = c52Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        c52 c52Var = this.b;
        switch (b) {
            case 0:
                c52Var.Z();
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = c52Var.T;
                if (!c52Var.L && !c52Var.O0 && !c52Var.b.J && c52Var.M0 && c52Var.U0 == null && editTextBoldCursor.hasFocus() && c52Var.isShown()) {
                    gm.E3(editTextBoldCursor);
                    return;
                }
                return;
            case 2:
                if (!c52Var.L && c52Var.M0 && c52Var.isShown()) {
                    c52Var.c0();
                    return;
                }
                return;
            case 3:
                if (!c52Var.L) {
                    float f = c52Var.n0;
                    if (f < 1.0f && c52Var.m0 == null) {
                        zna znaVar = new zna(new xk4(f));
                        c52Var.m0 = znaVar;
                        aoa aoaVar = new aoa(1.0f);
                        aoaVar.a(0.55f);
                        aoaVar.b(65.0f);
                        znaVar.m = aoaVar;
                        c52Var.m0.f(0.001f);
                        c52Var.m0.b(new h20(c52Var, (byte) 4));
                        c52Var.m0.a(new hx0(c52Var, (byte) 4));
                        c52Var.m0.h();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (c52Var.M0 && !c52Var.L) {
                    c52Var.b0();
                    if (c52Var.N0) {
                        c52Var.c0();
                        return;
                    }
                    return;
                }
                return;
            default:
                if (!c52Var.q0) {
                    c52Var.p0.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
