package defpackage;

import android.util.SparseIntArray;
import org.telegram.ui.ActionBar.e;
public final class ru1 implements Runnable {
    public final byte a;
    public final xu1 b;

    public ru1(xu1 xu1Var, byte b) {
        this.a = b;
        this.b = xu1Var;
    }

    @Override
    public final void run() {
        wk5 wk5Var;
        wk5 wk5Var2;
        byte b = this.a;
        xu1 xu1Var = this.b;
        switch (b) {
            case 0:
                xu1Var.e = new SparseIntArray();
                zu1 zu1Var = xu1Var.G;
                t37 t37Var = (t37) zu1Var.getThemedDrawable("drawableMsgOut");
                xu1Var.t = t37Var;
                wk5Var = ((e) zu1Var).parentLayout;
                t37Var.J = wk5Var.getMessageDrawableOutStart();
                t37 t37Var2 = (t37) zu1Var.getThemedDrawable("drawableMsgOutMedia");
                xu1Var.u = t37Var2;
                wk5Var2 = ((e) zu1Var).parentLayout;
                t37Var2.J = wk5Var2.getMessageDrawableOutMediaStart();
                xu1Var.t.K = 0.0f;
                xu1Var.u.K = 0.0f;
                zu1Var.cd();
                xu1Var.t(0.0f);
                return;
            default:
                xu1Var.t.J = null;
                xu1Var.u.J = null;
                xu1Var.e = null;
                xu1Var.t(1.0f);
                return;
        }
    }
}
