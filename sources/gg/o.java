package gg;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.eg0;
import org.telegram.ui.s31;
import zh.k5;
import zh.u7;
public final class o implements DialogInterface.OnDismissListener {
    public final int f8976a;
    public final Object f8977b;

    public o(Object obj, int i10) {
        this.f8976a = i10;
        this.f8977b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.h0 h0Var;
        switch (this.f8976a) {
            case 0:
                AndroidUtilities.hideKeyboard((u) this.f8977b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard((a2) this.f8977b);
                return;
            case 2:
                ((hi.s) this.f8977b).O = null;
                return;
            case 3:
                ((hi.g2) this.f8977b).O0 = null;
                return;
            case 4:
                Runnable[] runnableArr = (Runnable[]) this.f8977b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.web.c1 c1Var = ((org.telegram.ui.web.n0) this.f8977b).e.Q;
                if (c1Var != null && (h0Var = c1Var.f37880c) != null) {
                    h0Var.y();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.web.h0 h0Var2 = ((org.telegram.ui.web.u0) this.f8977b).f38088b.e.Q.f37880c;
                if (h0Var2 != null) {
                    h0Var2.y();
                    return;
                }
                return;
            case 7:
                qg.k0 k0Var = (qg.k0) this.f8977b;
                k0Var.f40769f0 = false;
                k0Var.f40786x0.f21192d0 = true;
                k0Var.E0.invalidate();
                k0Var.f40786x0.invalidate();
                return;
            case 8:
                qg.m1 m1Var = (qg.m1) this.f8977b;
                eg0 eg0Var = m1Var.f40828r0;
                if (eg0Var != null) {
                    eg0Var.setDialogVisible(false);
                }
                m1Var.f40827q0.setPaused(false);
                return;
            case 9:
                ((vh.p) this.f8977b).f43413s = null;
                return;
            case 10:
                ((s31) this.f8977b).run();
                return;
            case 11:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f8977b);
                return;
            case 12:
                ((u2.k0) this.f8977b).run();
                return;
            case 13:
                ((k5) this.f8977b).run();
                return;
            default:
                u7 u7Var = (u7) this.f8977b;
                if (dialogInterface == u7Var.f48963u0) {
                    u7Var.f48963u0 = null;
                    u7Var.P();
                    return;
                }
                return;
        }
    }
}
