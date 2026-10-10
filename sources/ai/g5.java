package ai;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.eg0;
import org.telegram.ui.m31;
public final class g5 implements DialogInterface.OnDismissListener {
    public final int f1053a;
    public final Object f1054b;

    public g5(Object obj, int i10) {
        this.f1053a = i10;
        this.f1054b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.g0 g0Var;
        switch (this.f1053a) {
            case 0:
                ((a3.d) this.f1054b).run();
                return;
            case 1:
                kc kcVar = (kc) this.f1054b;
                if (dialogInterface == kcVar.f1299u0) {
                    kcVar.f1299u0 = null;
                    kcVar.P();
                    return;
                }
                return;
            case 2:
                AndroidUtilities.hideKeyboard((hg.t) this.f1054b);
                return;
            case 3:
                AndroidUtilities.hideKeyboard((hg.s1) this.f1054b);
                return;
            case 4:
                ((ii.r) this.f1054b).O = null;
                return;
            case 5:
                ((ii.e2) this.f1054b).O0 = null;
                return;
            case 6:
                Runnable[] runnableArr = (Runnable[]) this.f1054b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 7:
                org.telegram.ui.web.b1 b1Var = ((org.telegram.ui.web.m0) this.f1054b).f43439e.Q;
                if (b1Var != null && (g0Var = b1Var.f43285c) != null) {
                    g0Var.y();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.web.g0 g0Var2 = ((org.telegram.ui.web.u0) this.f1054b).f43519b.f43564e.Q.f43285c;
                if (g0Var2 != null) {
                    g0Var2.y();
                    return;
                }
                return;
            case 9:
                rg.j0 j0Var = (rg.j0) this.f1054b;
                j0Var.f47323f0 = false;
                j0Var.f47340x0.f24245d0 = true;
                j0Var.E0.invalidate();
                j0Var.f47340x0.invalidate();
                return;
            case 10:
                rg.l1 l1Var = (rg.l1) this.f1054b;
                eg0 eg0Var = l1Var.f47381r0;
                if (eg0Var != null) {
                    eg0Var.setDialogVisible(false);
                }
                l1Var.f47380q0.setPaused(false);
                return;
            case 11:
                ((wh.l) this.f1054b).f50488s = null;
                return;
            case 12:
                ((m31) this.f1054b).run();
                return;
            case 13:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f1054b);
                return;
            default:
                ((u2.p0) this.f1054b).run();
                return;
        }
    }
}
