package ai;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class bb implements DialogInterface.OnDismissListener {
    public final int f1051a;
    public final Object f1052b;

    public bb(Object obj, int i10) {
        this.f1051a = i10;
        this.f1052b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.g0 g0Var;
        switch (this.f1051a) {
            case 0:
                ((x8) this.f1052b).run();
                return;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f1052b);
                return;
            case 2:
                ((a1.f) this.f1052b).run();
                return;
            case 3:
                ((androidx.fragment.app.d) this.f1052b).run();
                return;
            case 4:
                ci.aa aaVar = (ci.aa) this.f1052b;
                if (dialogInterface == aaVar.f5219u0) {
                    aaVar.f5219u0 = null;
                    aaVar.P();
                    return;
                }
                return;
            case 5:
                AndroidUtilities.hideKeyboard((ig.s) this.f1052b);
                return;
            case 6:
                AndroidUtilities.hideKeyboard((ig.q1) this.f1052b);
                return;
            case 7:
                ((ki.q) this.f1052b).O = null;
                return;
            case 8:
                ((ki.d2) this.f1052b).O0 = null;
                return;
            case 9:
                Runnable[] runnableArr = (Runnable[]) this.f1052b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.web.a1 a1Var = ((org.telegram.ui.web.m0) this.f1052b).e.Q;
                if (a1Var != null && (g0Var = a1Var.f42559c) != null) {
                    g0Var.y();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.g0 g0Var2 = ((org.telegram.ui.web.t0) this.f1052b).f42778b.e.Q.f42559c;
                if (g0Var2 != null) {
                    g0Var2.y();
                    return;
                }
                return;
            case 12:
                sg.k0 k0Var = (sg.k0) this.f1052b;
                k0Var.f46286f0 = false;
                k0Var.f46303x0.f24283d0 = true;
                k0Var.E0.invalidate();
                k0Var.f46303x0.invalidate();
                return;
            case 13:
                sg.m1 m1Var = (sg.m1) this.f1052b;
                zd zdVar = m1Var.f46338r0;
                if (zdVar != null) {
                    zdVar.setDialogVisible(false);
                }
                m1Var.f46337q0.setPaused(false);
                return;
            default:
                ((xh.k) this.f1052b).f49873s = null;
                return;
        }
    }
}
