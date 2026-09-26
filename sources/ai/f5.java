package ai;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.e31;
import org.telegram.ui.yf0;
public final class f5 implements DialogInterface.OnDismissListener {
    public final int f874a;
    public final Object f875b;

    public f5(Object obj, int i10) {
        this.f874a = i10;
        this.f875b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.g0 g0Var;
        switch (this.f874a) {
            case 0:
                ((a3.d) this.f875b).run();
                return;
            case 1:
                jc jcVar = (jc) this.f875b;
                if (dialogInterface == jcVar.f1103u0) {
                    jcVar.f1103u0 = null;
                    jcVar.P();
                    return;
                }
                return;
            case 2:
                AndroidUtilities.hideKeyboard((hg.u) this.f875b);
                return;
            case 3:
                AndroidUtilities.hideKeyboard((hg.s1) this.f875b);
                return;
            case 4:
                ((ii.r) this.f875b).O = null;
                return;
            case 5:
                ((ii.e2) this.f875b).O0 = null;
                return;
            case 6:
                Runnable[] runnableArr = (Runnable[]) this.f875b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 7:
                org.telegram.ui.web.b1 b1Var = ((org.telegram.ui.web.m0) this.f875b).e.Q;
                if (b1Var != null && (g0Var = b1Var.f39001c) != null) {
                    g0Var.y();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.web.g0 g0Var2 = ((org.telegram.ui.web.u0) this.f875b).f39213b.e.Q.f39001c;
                if (g0Var2 != null) {
                    g0Var2.y();
                    return;
                }
                return;
            case 9:
                rg.j0 j0Var = (rg.j0) this.f875b;
                j0Var.f42599f0 = false;
                j0Var.f42616x0.f22329d0 = true;
                j0Var.E0.invalidate();
                j0Var.f42616x0.invalidate();
                return;
            case 10:
                rg.k1 k1Var = (rg.k1) this.f875b;
                yf0 yf0Var = k1Var.f42644r0;
                if (yf0Var != null) {
                    yf0Var.setDialogVisible(false);
                }
                k1Var.f42643q0.setPaused(false);
                return;
            case 11:
                ((wh.n) this.f875b).f45404s = null;
                return;
            case 12:
                ((e31) this.f875b).run();
                return;
            case 13:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f875b);
                return;
            default:
                ((u2.p0) this.f875b).run();
                return;
        }
    }
}
