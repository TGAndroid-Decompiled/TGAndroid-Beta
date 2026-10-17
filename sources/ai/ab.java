package ai;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ab implements DialogInterface.OnDismissListener {
    public final int f975a;
    public final Object f976b;

    public ab(Object obj, int i10) {
        this.f975a = i10;
        this.f976b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.g0 g0Var;
        switch (this.f975a) {
            case 0:
                ((w8) this.f976b).run();
                return;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f976b);
                return;
            case 2:
                ((a1.f) this.f976b).run();
                return;
            case 3:
                ((androidx.fragment.app.d) this.f976b).run();
                return;
            case 4:
                ci.aa aaVar = (ci.aa) this.f976b;
                if (dialogInterface == aaVar.f5221u0) {
                    aaVar.f5221u0 = null;
                    aaVar.P();
                    return;
                }
                return;
            case 5:
                AndroidUtilities.hideKeyboard((ig.s) this.f976b);
                return;
            case 6:
                AndroidUtilities.hideKeyboard((ig.o1) this.f976b);
                return;
            case 7:
                ((ki.q) this.f976b).O = null;
                return;
            case 8:
                ((ki.d2) this.f976b).O0 = null;
                return;
            case 9:
                Runnable[] runnableArr = (Runnable[]) this.f976b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.web.a1 a1Var = ((org.telegram.ui.web.m0) this.f976b).e.Q;
                if (a1Var != null && (g0Var = a1Var.f42518c) != null) {
                    g0Var.y();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.g0 g0Var2 = ((org.telegram.ui.web.t0) this.f976b).f42736b.e.Q.f42518c;
                if (g0Var2 != null) {
                    g0Var2.y();
                    return;
                }
                return;
            case 12:
                sg.j0 j0Var = (sg.j0) this.f976b;
                j0Var.f46283f0 = false;
                j0Var.f46300x0.f24282d0 = true;
                j0Var.E0.invalidate();
                j0Var.f46300x0.invalidate();
                return;
            case 13:
                sg.l1 l1Var = (sg.l1) this.f976b;
                yd ydVar = l1Var.f46339r0;
                if (ydVar != null) {
                    ydVar.setDialogVisible(false);
                }
                l1Var.f46338q0.setPaused(false);
                return;
            default:
                ((xh.k) this.f976b).f49894s = null;
                return;
        }
    }
}
