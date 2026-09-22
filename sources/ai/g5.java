package ai;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.eg0;
import org.telegram.ui.n31;
public final class g5 implements DialogInterface.OnDismissListener {
    public final int f895a;
    public final Object f896b;

    public g5(Object obj, int i10) {
        this.f895a = i10;
        this.f896b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.h0 h0Var;
        switch (this.f895a) {
            case 0:
                ((a3.d) this.f896b).run();
                return;
            case 1:
                jc jcVar = (jc) this.f896b;
                if (dialogInterface == jcVar.f1109u0) {
                    jcVar.f1109u0 = null;
                    jcVar.P();
                    return;
                }
                return;
            case 2:
                AndroidUtilities.hideKeyboard((hg.u) this.f896b);
                return;
            case 3:
                AndroidUtilities.hideKeyboard((hg.s1) this.f896b);
                return;
            case 4:
                ((ii.r) this.f896b).O = null;
                return;
            case 5:
                ((ii.d2) this.f896b).O0 = null;
                return;
            case 6:
                Runnable[] runnableArr = (Runnable[]) this.f896b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 7:
                org.telegram.ui.web.d1 d1Var = ((org.telegram.ui.web.n0) this.f896b).e.Q;
                if (d1Var != null && (h0Var = d1Var.f38903c) != null) {
                    h0Var.y();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.web.h0 h0Var2 = ((org.telegram.ui.web.v0) this.f896b).f39109b.e.Q.f38903c;
                if (h0Var2 != null) {
                    h0Var2.y();
                    return;
                }
                return;
            case 9:
                rg.j0 j0Var = (rg.j0) this.f896b;
                j0Var.f42311f0 = false;
                j0Var.f42328x0.f22104d0 = true;
                j0Var.E0.invalidate();
                j0Var.f42328x0.invalidate();
                return;
            case 10:
                rg.k1 k1Var = (rg.k1) this.f896b;
                eg0 eg0Var = k1Var.f42356r0;
                if (eg0Var != null) {
                    eg0Var.setDialogVisible(false);
                }
                k1Var.f42355q0.setPaused(false);
                return;
            case 11:
                ((wh.n) this.f896b).f45122s = null;
                return;
            case 12:
                ((n31) this.f896b).run();
                return;
            case 13:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f896b);
                return;
            default:
                ((uh.i) this.f896b).run();
                return;
        }
    }
}
