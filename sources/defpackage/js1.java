package defpackage;

import android.content.Context;
public final class js1 extends ne2 {
    public final yv1 f;

    public js1(yv1 yv1Var, Context context) {
        super(context);
        this.f = yv1Var;
    }

    @Override
    public final void a(boolean z) {
        yv1 yv1Var = this.f;
        yv1Var.G5();
        yv1Var.E5();
        yv1Var.H5();
        yv1Var.I5();
        ft1 ft1Var = yv1Var.Jb;
        if (ft1Var != null) {
            ft1Var.setTranslationY(yv1Var.T9 + getCurrentHeight());
        }
        if (z) {
            yv1Var.aa = true;
            yv1Var.Rc();
            return;
        }
        yv1Var.O7();
    }
}
