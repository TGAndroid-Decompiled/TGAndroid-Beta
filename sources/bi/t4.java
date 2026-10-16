package bi;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ig0;
import org.telegram.ui.t31;
public final class t4 implements DialogInterface.OnDismissListener {
    public final int f3739a;
    public final Object f3740b;

    public t4(Object obj, int i10) {
        this.f3739a = i10;
        this.f3740b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.h0 h0Var;
        switch (this.f3739a) {
            case 0:
                ((a3.d) this.f3740b).run();
                return;
            case 1:
                sb sbVar = (sb) this.f3740b;
                if (dialogInterface == sbVar.f3709u0) {
                    sbVar.f3709u0 = null;
                    sbVar.P();
                    return;
                }
                return;
            case 2:
                AndroidUtilities.hideKeyboard((ig.s) this.f3740b);
                return;
            case 3:
                AndroidUtilities.hideKeyboard((ig.r1) this.f3740b);
                return;
            case 4:
                ((ji.r) this.f3740b).O = null;
                return;
            case 5:
                ((ji.d2) this.f3740b).O0 = null;
                return;
            case 6:
                Runnable[] runnableArr = (Runnable[]) this.f3740b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 7:
                org.telegram.ui.web.c1 c1Var = ((org.telegram.ui.web.n0) this.f3740b).e.Q;
                if (c1Var != null && (h0Var = c1Var.f40985c) != null) {
                    h0Var.y();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.web.h0 h0Var2 = ((org.telegram.ui.web.v0) this.f3740b).f41200b.e.Q.f40985c;
                if (h0Var2 != null) {
                    h0Var2.y();
                    return;
                }
                return;
            case 9:
                sg.j0 j0Var = (sg.j0) this.f3740b;
                j0Var.f45208f0 = false;
                j0Var.f45225x0.f22927d0 = true;
                j0Var.E0.invalidate();
                j0Var.f45225x0.invalidate();
                return;
            case 10:
                sg.m1 m1Var = (sg.m1) this.f3740b;
                ig0 ig0Var = m1Var.f45268r0;
                if (ig0Var != null) {
                    ig0Var.setDialogVisible(false);
                }
                m1Var.f45267q0.setPaused(false);
                return;
            case 11:
                ((xh.l) this.f3740b).f48489s = null;
                return;
            case 12:
                ((t31) this.f3740b).run();
                return;
            case 13:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f3740b);
                return;
            default:
                ((zh.m) this.f3740b).run();
                return;
        }
    }
}
