package ai;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.eg0;
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
                org.telegram.ui.web.b1 b1Var = ((org.telegram.ui.web.m0) this.f1052b).f43340e.Q;
                if (b1Var != null && (g0Var = b1Var.f43183c) != null) {
                    g0Var.y();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.web.g0 g0Var2 = ((org.telegram.ui.web.u0) this.f1052b).f43413b.f43458e.Q.f43183c;
                if (g0Var2 != null) {
                    g0Var2.y();
                    return;
                }
                return;
            case 9:
                rg.j0 j0Var = (rg.j0) this.f1052b;
                j0Var.f47493f0 = false;
                j0Var.f47510x0.f24018d0 = true;
                j0Var.E0.invalidate();
                j0Var.f47510x0.invalidate();
                return;
            case 10:
                rg.l1 l1Var = (rg.l1) this.f1052b;
                eg0 eg0Var = l1Var.f47551r0;
                if (eg0Var != null) {
                    eg0Var.setDialogVisible(false);
                }
                l1Var.f47550q0.setPaused(false);
                return;
            case 11:
                ((wh.l) this.f1052b).f50673s = null;
                return;
            case 12:
                ((o31) this.f1052b).run();
                return;
            case 13:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f1052b);
                return;
            default:
                ((tg.c1) this.f1052b).run();
                return;
        }
    }
}
