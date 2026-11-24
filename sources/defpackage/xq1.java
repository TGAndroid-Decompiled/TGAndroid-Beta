package defpackage;

import android.content.Context;
public final class xq1 extends cd2 {
    public final mu1 f;

    public xq1(mu1 mu1Var, Context context) {
        super(context);
        this.f = mu1Var;
    }

    @Override
    public final void a(boolean z) {
        mu1 mu1Var = this.f;
        mu1Var.y5();
        mu1Var.w5();
        mu1Var.z5();
        mu1Var.A5();
        sr1 sr1Var = mu1Var.Bb;
        if (sr1Var != null) {
            sr1Var.setTranslationY(mu1Var.T9 + getCurrentHeight());
        }
        if (z) {
            mu1Var.aa = true;
            mu1Var.Dc();
            return;
        }
        mu1Var.E7();
    }
}
