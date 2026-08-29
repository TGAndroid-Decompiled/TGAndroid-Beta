package cg;

import android.content.DialogInterface;
import jh.l6;
import lh.i9;
import lh.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d0 implements DialogInterface.OnDismissListener {
    public final int f3087a;
    public final Object f3088b;

    public d0(Object obj, int i10) {
        this.f3087a = i10;
        this.f3088b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.f0 f0Var;
        switch (this.f3087a) {
            case 0:
                v0 v0Var = (v0) this.f3088b;
                v0Var.f3402b0 = false;
                v0Var.f3419t0.W = true;
                v0Var.A0.invalidate();
                v0Var.f3419t0.invalidate();
                return;
            case 1:
                f2 f2Var = (f2) this.f3088b;
                i iVar = f2Var.f3134n0;
                if (iVar != null) {
                    iVar.setDialogVisible(false);
                }
                f2Var.m0.setPaused(false);
                return;
            case 2:
                ((hh.v) this.f3088b).f8136s = null;
                return;
            case 3:
                ((l6) this.f3088b).run();
                return;
            case 4:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f3088b);
                return;
            case 5:
                ((jh.w2) this.f3088b).run();
                return;
            case 6:
                ((m5) this.f3088b).run();
                return;
            case 7:
                i9 i9Var = (i9) this.f3088b;
                if (dialogInterface == i9Var.f15778q0) {
                    i9Var.f15778q0 = null;
                    i9Var.P();
                    return;
                }
                return;
            case 8:
                Runnable[] runnableArr = (Runnable[]) this.f3088b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 9:
                org.telegram.ui.web.z0 z0Var = ((org.telegram.ui.web.l0) this.f3088b).f44109e.M;
                if (z0Var != null && (f0Var = z0Var.f44264c) != null) {
                    f0Var.y();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.web.f0 f0Var2 = ((org.telegram.ui.web.s0) this.f3088b).f44196b.f44205e.M.f44264c;
                if (f0Var2 != null) {
                    f0Var2.y();
                    return;
                }
                return;
            case 11:
                AndroidUtilities.hideKeyboard((sf.o) this.f3088b);
                return;
            case 12:
                AndroidUtilities.hideKeyboard((sf.h1) this.f3088b);
                return;
            case 13:
                ((th.p) this.f3088b).K = null;
                return;
            default:
                ((th.x1) this.f3088b).K0 = null;
                return;
        }
    }
}
