package ai;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class bb implements DialogInterface.OnDismissListener {
    public final int f1042a;
    public final Object f1043b;

    public bb(Object obj, int i10) {
        this.f1042a = i10;
        this.f1043b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.h0 h0Var;
        switch (this.f1042a) {
            case 0:
                ((w8) this.f1043b).run();
                return;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f1043b);
                return;
            case 2:
                ((a1.f) this.f1043b).run();
                return;
            case 3:
                ((androidx.fragment.app.d) this.f1043b).run();
                return;
            case 4:
                ci.z9 z9Var = (ci.z9) this.f1043b;
                if (dialogInterface == z9Var.f6254u0) {
                    z9Var.f6254u0 = null;
                    z9Var.P();
                    return;
                }
                return;
            case 5:
                AndroidUtilities.hideKeyboard((ig.s) this.f1043b);
                return;
            case 6:
                AndroidUtilities.hideKeyboard((ig.q1) this.f1043b);
                return;
            case 7:
                ((ki.q) this.f1043b).O = null;
                return;
            case 8:
                ((ki.d2) this.f1043b).O0 = null;
                return;
            case 9:
                Runnable[] runnableArr = (Runnable[]) this.f1043b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.web.b1 b1Var = ((org.telegram.ui.web.n0) this.f1043b).e.Q;
                if (b1Var != null && (h0Var = b1Var.f42523c) != null) {
                    h0Var.y();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.h0 h0Var2 = ((org.telegram.ui.web.u0) this.f1043b).f42745b.e.Q.f42523c;
                if (h0Var2 != null) {
                    h0Var2.y();
                    return;
                }
                return;
            case 12:
                sg.k0 k0Var = (sg.k0) this.f1043b;
                k0Var.f46284f0 = false;
                k0Var.f46301x0.f24282d0 = true;
                k0Var.E0.invalidate();
                k0Var.f46301x0.invalidate();
                return;
            case 13:
                sg.m1 m1Var = (sg.m1) this.f1043b;
                zd zdVar = m1Var.f46336r0;
                if (zdVar != null) {
                    zdVar.setDialogVisible(false);
                }
                m1Var.f46335q0.setPaused(false);
                return;
            default:
                ((xh.k) this.f1043b).f49872s = null;
                return;
        }
    }
}
