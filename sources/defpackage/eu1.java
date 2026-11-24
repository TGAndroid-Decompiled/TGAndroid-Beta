package defpackage;

import android.util.SparseIntArray;
import org.telegram.ui.ActionBar.d;
public final class eu1 implements Runnable {
    public final byte a;
    public final ku1 b;

    public eu1(ku1 ku1Var, byte b) {
        this.a = b;
        this.b = ku1Var;
    }

    @Override
    public final void run() {
        ui5 ui5Var;
        ui5 ui5Var2;
        byte b = this.a;
        ku1 ku1Var = this.b;
        switch (b) {
            case 0:
                ku1Var.e = new SparseIntArray();
                mu1 mu1Var = ku1Var.G;
                m17 m17Var = (m17) mu1Var.getThemedDrawable("drawableMsgOut");
                ku1Var.t = m17Var;
                ui5Var = ((d) mu1Var).parentLayout;
                m17Var.J = ui5Var.getMessageDrawableOutStart();
                m17 m17Var2 = (m17) mu1Var.getThemedDrawable("drawableMsgOutMedia");
                ku1Var.u = m17Var2;
                ui5Var2 = ((d) mu1Var).parentLayout;
                m17Var2.J = ui5Var2.getMessageDrawableOutMediaStart();
                ku1Var.t.K = 0.0f;
                ku1Var.u.K = 0.0f;
                mu1Var.Qc();
                ku1Var.t(0.0f);
                return;
            default:
                ku1Var.t.J = null;
                ku1Var.u.J = null;
                ku1Var.e = null;
                ku1Var.t(1.0f);
                return;
        }
    }
}
