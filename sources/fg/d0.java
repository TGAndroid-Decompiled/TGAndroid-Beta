package fg;

import android.content.DialogInterface;
import mh.l6;
import oh.i9;
import oh.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d0 implements DialogInterface.OnDismissListener {
    public final int f6268a;
    public final Object f6269b;

    public d0(Object obj, int i10) {
        this.f6268a = i10;
        this.f6269b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.f0 f0Var;
        switch (this.f6268a) {
            case 0:
                v0 v0Var = (v0) this.f6269b;
                v0Var.f6583c0 = false;
                v0Var.f6600u0.f24947a0 = true;
                v0Var.B0.invalidate();
                v0Var.f6600u0.invalidate();
                return;
            case 1:
                d2 d2Var = (d2) this.f6269b;
                i iVar = d2Var.f6287o0;
                if (iVar != null) {
                    iVar.setDialogVisible(false);
                }
                d2Var.f6286n0.setPaused(false);
                return;
            case 2:
                ((kh.v) this.f6269b).f11320s = null;
                return;
            case 3:
                ((l6) this.f6269b).run();
                return;
            case 4:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f6269b);
                return;
            case 5:
                ((mh.m2) this.f6269b).run();
                return;
            case 6:
                ((t3) this.f6269b).run();
                return;
            case 7:
                i9 i9Var = (i9) this.f6269b;
                if (dialogInterface == i9Var.f17293r0) {
                    i9Var.f17293r0 = null;
                    i9Var.P();
                    return;
                }
                return;
            case 8:
                Runnable[] runnableArr = (Runnable[]) this.f6269b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 9:
                org.telegram.ui.web.a1 a1Var = ((org.telegram.ui.web.l0) this.f6269b).f42587e.N;
                if (a1Var != null && (f0Var = a1Var.f42433c) != null) {
                    f0Var.y();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.web.f0 f0Var2 = ((org.telegram.ui.web.t0) this.f6269b).f42661b.f42701e.N.f42433c;
                if (f0Var2 != null) {
                    f0Var2.y();
                    return;
                }
                return;
            case 11:
                AndroidUtilities.hideKeyboard((vf.n) this.f6269b);
                return;
            case 12:
                AndroidUtilities.hideKeyboard((vf.g1) this.f6269b);
                return;
            case 13:
                ((wh.q) this.f6269b).L = null;
                return;
            default:
                ((wh.z1) this.f6269b).L0 = null;
                return;
        }
    }
}
