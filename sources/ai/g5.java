package ai;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.fg0;
import org.telegram.ui.o31;
public final class g5 implements DialogInterface.OnDismissListener {
    public final int f1051a;
    public final Object f1052b;

    public g5(Object obj, int i10) {
        this.f1051a = i10;
        this.f1052b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.g0 g0Var;
        switch (this.f1051a) {
            case 0:
                ((a3.d) this.f1052b).run();
                return;
            case 1:
                kc kcVar = (kc) this.f1052b;
                if (dialogInterface == kcVar.f1297u0) {
                    kcVar.f1297u0 = null;
                    kcVar.P();
                    return;
                }
                return;
            case 2:
                AndroidUtilities.hideKeyboard((hg.t) this.f1052b);
                return;
            case 3:
                AndroidUtilities.hideKeyboard((hg.s1) this.f1052b);
                return;
            case 4:
                ((ii.r) this.f1052b).O = null;
                return;
            case 5:
                ((ii.e2) this.f1052b).O0 = null;
                return;
            case 6:
                Runnable[] runnableArr = (Runnable[]) this.f1052b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 7:
                org.telegram.ui.web.b1 b1Var = ((org.telegram.ui.web.m0) this.f1052b).f43338e.Q;
                if (b1Var != null && (g0Var = b1Var.f43185c) != null) {
                    g0Var.y();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.web.g0 g0Var2 = ((org.telegram.ui.web.u0) this.f1052b).f43418b.f43463e.Q.f43185c;
                if (g0Var2 != null) {
                    g0Var2.y();
                    return;
                }
                return;
            case 9:
                rg.j0 j0Var = (rg.j0) this.f1052b;
                j0Var.f47501f0 = false;
                j0Var.f47518x0.f24019d0 = true;
                j0Var.E0.invalidate();
                j0Var.f47518x0.invalidate();
                return;
            case 10:
                rg.l1 l1Var = (rg.l1) this.f1052b;
                fg0 fg0Var = l1Var.f47559r0;
                if (fg0Var != null) {
                    fg0Var.setDialogVisible(false);
                }
                l1Var.f47558q0.setPaused(false);
                return;
            case 11:
                ((wh.l) this.f1052b).f50681s = null;
                return;
            case 12:
                ((o31) this.f1052b).run();
                return;
            case 13:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f1052b);
                return;
            default:
                ((yh.v4) this.f1052b).run();
                return;
        }
    }
}
