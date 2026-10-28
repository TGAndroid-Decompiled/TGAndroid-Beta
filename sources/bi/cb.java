package bi;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cb implements DialogInterface.OnDismissListener {
    public final int f4463a;
    public final Object f4464b;

    public cb(Object obj, int i10) {
        this.f4463a = i10;
        this.f4464b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.g0 g0Var;
        switch (this.f4463a) {
            case 0:
                ((s8) this.f4464b).run();
                return;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f4464b);
                return;
            case 2:
                ((f2) this.f4464b).run();
                return;
            case 3:
                ((u6) this.f4464b).run();
                return;
            case 4:
                di.y9 y9Var = (di.y9) this.f4464b;
                if (dialogInterface == y9Var.f9460u0) {
                    y9Var.f9460u0 = null;
                    y9Var.Q();
                    return;
                }
                return;
            case 5:
                AndroidUtilities.hideKeyboard((jg.t) this.f4464b);
                return;
            case 6:
                AndroidUtilities.hideKeyboard((jg.s1) this.f4464b);
                return;
            case 7:
                ((li.q) this.f4464b).O = null;
                return;
            case 8:
                ((li.b2) this.f4464b).O0 = null;
                return;
            case 9:
                Runnable[] runnableArr = (Runnable[]) this.f4464b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.web.a1 a1Var = ((org.telegram.ui.web.m0) this.f4464b).e.Q;
                if (a1Var != null && (g0Var = a1Var.f44669c) != null) {
                    g0Var.z();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.g0 g0Var2 = ((org.telegram.ui.web.t0) this.f4464b).f44891b.e.Q.f44669c;
                if (g0Var2 != null) {
                    g0Var2.z();
                    return;
                }
                return;
            case 12:
                tg.j0 j0Var = (tg.j0) this.f4464b;
                j0Var.f48924f0 = false;
                j0Var.f48941x0.f26225d0 = true;
                j0Var.E0.invalidate();
                j0Var.f48941x0.invalidate();
                return;
            case 13:
                tg.m1 m1Var = (tg.m1) this.f4464b;
                qd qdVar = m1Var.f48984r0;
                if (qdVar != null) {
                    qdVar.setDialogVisible(false);
                }
                m1Var.f48983q0.setPaused(false);
                return;
            default:
                ((yh.k) this.f4464b).f52683s = null;
                return;
        }
    }
}
