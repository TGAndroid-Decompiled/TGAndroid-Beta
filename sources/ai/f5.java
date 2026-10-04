package ai;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.cg0;
import org.telegram.ui.g31;
public final class f5 implements DialogInterface.OnDismissListener {
    public final int f943a;
    public final Object f944b;

    public f5(Object obj, int i10) {
        this.f943a = i10;
        this.f944b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.h0 h0Var;
        switch (this.f943a) {
            case 0:
                ((a3.d) this.f944b).run();
                return;
            case 1:
                jc jcVar = (jc) this.f944b;
                if (dialogInterface == jcVar.f1190u0) {
                    jcVar.f1190u0 = null;
                    jcVar.P();
                    return;
                }
                return;
            case 2:
                AndroidUtilities.hideKeyboard((hg.s) this.f944b);
                return;
            case 3:
                AndroidUtilities.hideKeyboard((hg.r1) this.f944b);
                return;
            case 4:
                ((ii.r) this.f944b).O = null;
                return;
            case 5:
                ((ii.e2) this.f944b).O0 = null;
                return;
            case 6:
                Runnable[] runnableArr = (Runnable[]) this.f944b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 7:
                org.telegram.ui.web.c1 c1Var = ((org.telegram.ui.web.n0) this.f944b).f42280e.Q;
                if (c1Var != null && (h0Var = c1Var.f42123c) != null) {
                    h0Var.y();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.web.h0 h0Var2 = ((org.telegram.ui.web.v0) this.f944b).f42364b.f42405e.Q.f42123c;
                if (h0Var2 != null) {
                    h0Var2.y();
                    return;
                }
                return;
            case 9:
                rg.k0 k0Var = (rg.k0) this.f944b;
                k0Var.f46149f0 = false;
                k0Var.f46166x0.f24238d0 = true;
                k0Var.E0.invalidate();
                k0Var.f46166x0.invalidate();
                return;
            case 10:
                rg.m1 m1Var = (rg.m1) this.f944b;
                cg0 cg0Var = m1Var.f46202r0;
                if (cg0Var != null) {
                    cg0Var.setDialogVisible(false);
                }
                m1Var.f46201q0.setPaused(false);
                return;
            case 11:
                ((wh.n) this.f944b).f49151s = null;
                return;
            case 12:
                ((g31) this.f944b).run();
                return;
            case 13:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f944b);
                return;
            default:
                ((u2.i0) this.f944b).run();
                return;
        }
    }
}
