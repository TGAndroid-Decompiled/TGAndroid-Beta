package defpackage;

import android.content.Context;
public final class kr1 extends sd2 {
    public final zu1 f;

    public kr1(zu1 zu1Var, Context context) {
        super(context);
        this.f = zu1Var;
    }

    @Override
    public final void a(boolean z) {
        zu1 zu1Var = this.f;
        zu1Var.F5();
        zu1Var.D5();
        zu1Var.G5();
        zu1Var.H5();
        gs1 gs1Var = zu1Var.Mb;
        if (gs1Var != null) {
            gs1Var.setTranslationY(zu1Var.T9 + getCurrentHeight());
        }
        if (z) {
            zu1Var.aa = true;
            zu1Var.Rc();
            return;
        }
        zu1Var.O7();
    }
}
