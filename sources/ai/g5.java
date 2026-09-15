package ai;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.eg0;
import org.telegram.ui.m31;
public final class g5 implements DialogInterface.OnDismissListener {
    public final int f893a;
    public final Object f894b;

    public g5(Object obj, int i10) {
        this.f893a = i10;
        this.f894b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.h0 h0Var;
        switch (this.f893a) {
            case 0:
                ((a3.d) this.f894b).run();
                return;
            case 1:
                jc jcVar = (jc) this.f894b;
                if (dialogInterface == jcVar.f1107u0) {
                    jcVar.f1107u0 = null;
                    jcVar.P();
                    return;
                }
                return;
            case 2:
                AndroidUtilities.hideKeyboard((hg.s) this.f894b);
                return;
            case 3:
                AndroidUtilities.hideKeyboard((hg.r1) this.f894b);
                return;
            case 4:
                ((ii.r) this.f894b).O = null;
                return;
            case 5:
                ((ii.d2) this.f894b).O0 = null;
                return;
            case 6:
                Runnable[] runnableArr = (Runnable[]) this.f894b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 7:
                org.telegram.ui.web.d1 d1Var = ((org.telegram.ui.web.n0) this.f894b).e.Q;
                if (d1Var != null && (h0Var = d1Var.f38897c) != null) {
                    h0Var.y();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.web.h0 h0Var2 = ((org.telegram.ui.web.v0) this.f894b).f39105b.e.Q.f38897c;
                if (h0Var2 != null) {
                    h0Var2.y();
                    return;
                }
                return;
            case 9:
                rg.j0 j0Var = (rg.j0) this.f894b;
                j0Var.f42315f0 = false;
                j0Var.f42332x0.f22107d0 = true;
                j0Var.E0.invalidate();
                j0Var.f42332x0.invalidate();
                return;
            case 10:
                rg.k1 k1Var = (rg.k1) this.f894b;
                eg0 eg0Var = k1Var.f42360r0;
                if (eg0Var != null) {
                    eg0Var.setDialogVisible(false);
                }
                k1Var.f42359q0.setPaused(false);
                return;
            case 11:
                ((wh.n) this.f894b).f45126s = null;
                return;
            case 12:
                ((m31) this.f894b).run();
                return;
            case 13:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f894b);
                return;
            default:
                ((uh.i) this.f894b).run();
                return;
        }
    }
}
