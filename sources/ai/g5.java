package ai;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.fg0;
import org.telegram.ui.m31;
public final class g5 implements DialogInterface.OnDismissListener {
    public final int f898a;
    public final Object f899b;

    public g5(Object obj, int i10) {
        this.f898a = i10;
        this.f899b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.h0 h0Var;
        switch (this.f898a) {
            case 0:
                ((a3.d) this.f899b).run();
                return;
            case 1:
                jc jcVar = (jc) this.f899b;
                if (dialogInterface == jcVar.f1112u0) {
                    jcVar.f1112u0 = null;
                    jcVar.P();
                    return;
                }
                return;
            case 2:
                AndroidUtilities.hideKeyboard((hg.s) this.f899b);
                return;
            case 3:
                AndroidUtilities.hideKeyboard((hg.r1) this.f899b);
                return;
            case 4:
                ((ii.r) this.f899b).O = null;
                return;
            case 5:
                ((ii.d2) this.f899b).O0 = null;
                return;
            case 6:
                Runnable[] runnableArr = (Runnable[]) this.f899b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 7:
                org.telegram.ui.web.d1 d1Var = ((org.telegram.ui.web.n0) this.f899b).e.Q;
                if (d1Var != null && (h0Var = d1Var.f38855c) != null) {
                    h0Var.y();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.web.h0 h0Var2 = ((org.telegram.ui.web.v0) this.f899b).f39061b.e.Q.f38855c;
                if (h0Var2 != null) {
                    h0Var2.y();
                    return;
                }
                return;
            case 9:
                rg.j0 j0Var = (rg.j0) this.f899b;
                j0Var.f42569f0 = false;
                j0Var.f42586x0.f22293d0 = true;
                j0Var.E0.invalidate();
                j0Var.f42586x0.invalidate();
                return;
            case 10:
                rg.k1 k1Var = (rg.k1) this.f899b;
                fg0 fg0Var = k1Var.f42614r0;
                if (fg0Var != null) {
                    fg0Var.setDialogVisible(false);
                }
                k1Var.f42613q0.setPaused(false);
                return;
            case 11:
                ((wh.n) this.f899b).f45377s = null;
                return;
            case 12:
                ((m31) this.f899b).run();
                return;
            case 13:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f899b);
                return;
            default:
                ((uf.b) this.f899b).run();
                return;
        }
    }
}
