package eh;

import android.content.DialogInterface;
import gh.o6;
import ih.m9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.web.e0;
import org.telegram.ui.web.k0;
import org.telegram.ui.web.r0;
import org.telegram.ui.web.y0;
import pf.h1;
import qh.x1;
import zf.j0;
import zf.k1;
public final class l implements DialogInterface.OnDismissListener {
    public final int f5208a;
    public final Object f5209b;

    public l(Object obj, int i9) {
        this.f5208a = i9;
        this.f5209b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        e0 e0Var;
        switch (this.f5208a) {
            case 0:
                ((x) this.f5209b).f5262s = null;
                return;
            case 1:
                ((o6) this.f5209b).run();
                return;
            case 2:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f5209b);
                return;
            case 3:
                ((e5.u) this.f5209b).run();
                return;
            case 4:
                ((ih.g) this.f5209b).run();
                return;
            case 5:
                m9 m9Var = (m9) this.f5209b;
                if (dialogInterface == m9Var.f11819q0) {
                    m9Var.f11819q0 = null;
                    m9Var.P();
                    return;
                }
                return;
            case 6:
                Runnable[] runnableArr = (Runnable[]) this.f5209b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 7:
                y0 y0Var = ((k0) this.f5209b).f43919e.M;
                if (y0Var != null && (e0Var = y0Var.f44074c) != null) {
                    e0Var.y();
                    return;
                }
                return;
            case 8:
                e0 e0Var2 = ((r0) this.f5209b).f44006b.f44015e.M.f44074c;
                if (e0Var2 != null) {
                    e0Var2.y();
                    return;
                }
                return;
            case 9:
                AndroidUtilities.hideKeyboard((pf.o) this.f5209b);
                return;
            case 10:
                AndroidUtilities.hideKeyboard((h1) this.f5209b);
                return;
            case 11:
                ((qh.p) this.f5209b).K = null;
                return;
            case 12:
                ((x1) this.f5209b).K0 = null;
                return;
            case 13:
                j0 j0Var = (j0) this.f5209b;
                j0Var.f50533b0 = false;
                j0Var.f50550t0.W = true;
                j0Var.A0.invalidate();
                j0Var.f50550t0.invalidate();
                return;
            default:
                k1 k1Var = (k1) this.f5209b;
                dg.q qVar = k1Var.f50579n0;
                if (qVar != null) {
                    qVar.setDialogVisible(false);
                }
                k1Var.m0.setPaused(false);
                return;
        }
    }
}
