package eg;

import android.content.DialogInterface;
import lh.l6;
import nh.i9;
import nh.n5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d0 implements DialogInterface.OnDismissListener {
    public final int f5233a;
    public final Object f5234b;

    public d0(Object obj, int i10) {
        this.f5233a = i10;
        this.f5234b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.g0 g0Var;
        switch (this.f5233a) {
            case 0:
                v0 v0Var = (v0) this.f5234b;
                v0Var.f5525c0 = false;
                v0Var.f5542u0.f23065a0 = true;
                v0Var.B0.invalidate();
                v0Var.f5542u0.invalidate();
                return;
            case 1:
                e2 e2Var = (e2) this.f5234b;
                i iVar = e2Var.f5260o0;
                if (iVar != null) {
                    iVar.setDialogVisible(false);
                }
                e2Var.f5259n0.setPaused(false);
                return;
            case 2:
                ((jh.v) this.f5234b).f9475s = null;
                return;
            case 3:
                ((l6) this.f5234b).run();
                return;
            case 4:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f5234b);
                return;
            case 5:
                ((lh.n2) this.f5234b).run();
                return;
            case 6:
                ((n5) this.f5234b).run();
                return;
            case 7:
                i9 i9Var = (i9) this.f5234b;
                if (dialogInterface == i9Var.f15466r0) {
                    i9Var.f15466r0 = null;
                    i9Var.P();
                    return;
                }
                return;
            case 8:
                Runnable[] runnableArr = (Runnable[]) this.f5234b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 9:
                org.telegram.ui.web.c1 c1Var = ((org.telegram.ui.web.m0) this.f5234b).e.N;
                if (c1Var != null && (g0Var = c1Var.f39385c) != null) {
                    g0Var.y();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.web.g0 g0Var2 = ((org.telegram.ui.web.u0) this.f5234b).f39592b.e.N.f39385c;
                if (g0Var2 != null) {
                    g0Var2.y();
                    return;
                }
                return;
            case 11:
                AndroidUtilities.hideKeyboard((uf.n) this.f5234b);
                return;
            case 12:
                AndroidUtilities.hideKeyboard((uf.g1) this.f5234b);
                return;
            case 13:
                ((vh.q) this.f5234b).L = null;
                return;
            default:
                ((vh.y1) this.f5234b).L0 = null;
                return;
        }
    }
}
