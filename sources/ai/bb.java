package ai;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class bb implements DialogInterface.OnDismissListener {
    public final int f1041a;
    public final Object f1042b;

    public bb(Object obj, int i10) {
        this.f1041a = i10;
        this.f1042b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.g0 g0Var;
        switch (this.f1041a) {
            case 0:
                ((w8) this.f1042b).run();
                return;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f1042b);
                return;
            case 2:
                ((a1.f) this.f1042b).run();
                return;
            case 3:
                ((androidx.fragment.app.d) this.f1042b).run();
                return;
            case 4:
                ci.aa aaVar = (ci.aa) this.f1042b;
                if (dialogInterface == aaVar.f5221u0) {
                    aaVar.f5221u0 = null;
                    aaVar.P();
                    return;
                }
                return;
            case 5:
                AndroidUtilities.hideKeyboard((ig.s) this.f1042b);
                return;
            case 6:
                AndroidUtilities.hideKeyboard((ig.q1) this.f1042b);
                return;
            case 7:
                ((ki.q) this.f1042b).O = null;
                return;
            case 8:
                ((ki.d2) this.f1042b).O0 = null;
                return;
            case 9:
                Runnable[] runnableArr = (Runnable[]) this.f1042b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.web.a1 a1Var = ((org.telegram.ui.web.m0) this.f1042b).e.Q;
                if (a1Var != null && (g0Var = a1Var.f42558c) != null) {
                    g0Var.y();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.g0 g0Var2 = ((org.telegram.ui.web.t0) this.f1042b).f42777b.e.Q.f42558c;
                if (g0Var2 != null) {
                    g0Var2.y();
                    return;
                }
                return;
            case 12:
                sg.k0 k0Var = (sg.k0) this.f1042b;
                k0Var.f46284f0 = false;
                k0Var.f46301x0.f24285d0 = true;
                k0Var.E0.invalidate();
                k0Var.f46301x0.invalidate();
                return;
            case 13:
                sg.m1 m1Var = (sg.m1) this.f1042b;
                zd zdVar = m1Var.f46336r0;
                if (zdVar != null) {
                    zdVar.setDialogVisible(false);
                }
                m1Var.f46335q0.setPaused(false);
                return;
            default:
                ((xh.k) this.f1042b).f49871s = null;
                return;
        }
    }
}
