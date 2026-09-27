package ai;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.bg0;
import org.telegram.ui.g31;
public final class f5 implements DialogInterface.OnDismissListener {
    public final int f877a;
    public final Object f878b;

    public f5(Object obj, int i10) {
        this.f877a = i10;
        this.f878b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.h0 h0Var;
        switch (this.f877a) {
            case 0:
                ((a3.d) this.f878b).run();
                return;
            case 1:
                jc jcVar = (jc) this.f878b;
                if (dialogInterface == jcVar.f1105u0) {
                    jcVar.f1105u0 = null;
                    jcVar.P();
                    return;
                }
                return;
            case 2:
                AndroidUtilities.hideKeyboard((hg.s) this.f878b);
                return;
            case 3:
                AndroidUtilities.hideKeyboard((hg.r1) this.f878b);
                return;
            case 4:
                ((ii.r) this.f878b).O = null;
                return;
            case 5:
                ((ii.e2) this.f878b).O0 = null;
                return;
            case 6:
                Runnable[] runnableArr = (Runnable[]) this.f878b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 7:
                org.telegram.ui.web.c1 c1Var = ((org.telegram.ui.web.n0) this.f878b).e.Q;
                if (c1Var != null && (h0Var = c1Var.f38962c) != null) {
                    h0Var.y();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.web.h0 h0Var2 = ((org.telegram.ui.web.v0) this.f878b).f39180b.e.Q.f38962c;
                if (h0Var2 != null) {
                    h0Var2.y();
                    return;
                }
                return;
            case 9:
                rg.j0 j0Var = (rg.j0) this.f878b;
                j0Var.f42644f0 = false;
                j0Var.f42661x0.f22332d0 = true;
                j0Var.E0.invalidate();
                j0Var.f42661x0.invalidate();
                return;
            case 10:
                rg.k1 k1Var = (rg.k1) this.f878b;
                bg0 bg0Var = k1Var.f42689r0;
                if (bg0Var != null) {
                    bg0Var.setDialogVisible(false);
                }
                k1Var.f42688q0.setPaused(false);
                return;
            case 11:
                ((wh.n) this.f878b).f45450s = null;
                return;
            case 12:
                ((g31) this.f878b).run();
                return;
            case 13:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f878b);
                return;
            default:
                ((uf.b) this.f878b).run();
                return;
        }
    }
}
