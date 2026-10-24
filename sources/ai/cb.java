package ai;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cb implements DialogInterface.OnDismissListener {
    public final int f1106a;
    public final Object f1107b;

    public cb(Object obj, int i10) {
        this.f1106a = i10;
        this.f1107b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.h0 h0Var;
        switch (this.f1106a) {
            case 0:
                ((x8) this.f1107b).run();
                return;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f1107b);
                return;
            case 2:
                ((a1.f) this.f1107b).run();
                return;
            case 3:
                ((androidx.fragment.app.d) this.f1107b).run();
                return;
            case 4:
                ci.z9 z9Var = (ci.z9) this.f1107b;
                if (dialogInterface == z9Var.f6265u0) {
                    z9Var.f6265u0 = null;
                    z9Var.P();
                    return;
                }
                return;
            case 5:
                AndroidUtilities.hideKeyboard((ig.s) this.f1107b);
                return;
            case 6:
                AndroidUtilities.hideKeyboard((ig.p1) this.f1107b);
                return;
            case 7:
                ((ki.q) this.f1107b).O = null;
                return;
            case 8:
                ((ki.d2) this.f1107b).O0 = null;
                return;
            case 9:
                Runnable[] runnableArr = (Runnable[]) this.f1107b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.web.b1 b1Var = ((org.telegram.ui.web.n0) this.f1107b).e.Q;
                if (b1Var != null && (h0Var = b1Var.f43036c) != null) {
                    h0Var.z();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.h0 h0Var2 = ((org.telegram.ui.web.u0) this.f1107b).f43256b.e.Q.f43036c;
                if (h0Var2 != null) {
                    h0Var2.z();
                    return;
                }
                return;
            case 12:
                sg.j0 j0Var = (sg.j0) this.f1107b;
                j0Var.f46710f0 = false;
                j0Var.f46727x0.f24431d0 = true;
                j0Var.E0.invalidate();
                j0Var.f46727x0.invalidate();
                return;
            case 13:
                sg.m1 m1Var = (sg.m1) this.f1107b;
                ae aeVar = m1Var.f46770r0;
                if (aeVar != null) {
                    aeVar.setDialogVisible(false);
                }
                m1Var.f46769q0.setPaused(false);
                return;
            default:
                ((xh.k) this.f1107b).f50321s = null;
                return;
        }
    }
}
