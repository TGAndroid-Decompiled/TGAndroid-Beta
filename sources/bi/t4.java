package bi;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.jg0;
import org.telegram.ui.t31;
public final class t4 implements DialogInterface.OnDismissListener {
    public final int f3735a;
    public final Object f3736b;

    public t4(Object obj, int i10) {
        this.f3735a = i10;
        this.f3736b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.h0 h0Var;
        switch (this.f3735a) {
            case 0:
                ((a3.d) this.f3736b).run();
                return;
            case 1:
                sb sbVar = (sb) this.f3736b;
                if (dialogInterface == sbVar.f3705u0) {
                    sbVar.f3705u0 = null;
                    sbVar.P();
                    return;
                }
                return;
            case 2:
                AndroidUtilities.hideKeyboard((ig.s) this.f3736b);
                return;
            case 3:
                AndroidUtilities.hideKeyboard((ig.r1) this.f3736b);
                return;
            case 4:
                ((ji.r) this.f3736b).O = null;
                return;
            case 5:
                ((ji.d2) this.f3736b).O0 = null;
                return;
            case 6:
                Runnable[] runnableArr = (Runnable[]) this.f3736b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 7:
                org.telegram.ui.web.b1 b1Var = ((org.telegram.ui.web.n0) this.f3736b).e.Q;
                if (b1Var != null && (h0Var = b1Var.f41286c) != null) {
                    h0Var.y();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.web.h0 h0Var2 = ((org.telegram.ui.web.u0) this.f3736b).f41499b.e.Q.f41286c;
                if (h0Var2 != null) {
                    h0Var2.y();
                    return;
                }
                return;
            case 9:
                sg.j0 j0Var = (sg.j0) this.f3736b;
                j0Var.f45208f0 = false;
                j0Var.f45225x0.f23227d0 = true;
                j0Var.E0.invalidate();
                j0Var.f45225x0.invalidate();
                return;
            case 10:
                sg.m1 m1Var = (sg.m1) this.f3736b;
                jg0 jg0Var = m1Var.f45268r0;
                if (jg0Var != null) {
                    jg0Var.setDialogVisible(false);
                }
                m1Var.f45267q0.setPaused(false);
                return;
            case 11:
                ((xh.l) this.f3736b).f48490s = null;
                return;
            case 12:
                ((t31) this.f3736b).run();
                return;
            case 13:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f3736b);
                return;
            default:
                ((zh.m) this.f3736b).run();
                return;
        }
    }
}
