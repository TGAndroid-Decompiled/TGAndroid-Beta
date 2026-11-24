package defpackage;

import android.util.SparseIntArray;
import org.telegram.ui.ActionBar.d;
public final class qv1 implements Runnable {
    public final byte a;
    public final wv1 b;

    public qv1(wv1 wv1Var, byte b) {
        this.a = b;
        this.b = wv1Var;
    }

    @Override
    public final void run() {
        tk5 tk5Var;
        tk5 tk5Var2;
        byte b = this.a;
        wv1 wv1Var = this.b;
        switch (b) {
            case 0:
                wv1Var.e = new SparseIntArray();
                yv1 yv1Var = wv1Var.G;
                m37 m37Var = (m37) yv1Var.getThemedDrawable("drawableMsgOut");
                wv1Var.t = m37Var;
                tk5Var = ((d) yv1Var).parentLayout;
                m37Var.J = tk5Var.getMessageDrawableOutStart();
                m37 m37Var2 = (m37) yv1Var.getThemedDrawable("drawableMsgOutMedia");
                wv1Var.u = m37Var2;
                tk5Var2 = ((d) yv1Var).parentLayout;
                m37Var2.J = tk5Var2.getMessageDrawableOutMediaStart();
                wv1Var.t.K = 0.0f;
                wv1Var.u.K = 0.0f;
                yv1Var.cd();
                wv1Var.t(0.0f);
                return;
            default:
                wv1Var.t.J = null;
                wv1Var.u.J = null;
                wv1Var.e = null;
                wv1Var.t(1.0f);
                return;
        }
    }
}
