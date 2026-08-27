package ag;

import android.content.DialogInterface;
import hh.m5;
import hh.n6;
import hh.y9;
import jh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class j0 implements DialogInterface.OnDismissListener {

    public final int f486a;

    public final Object f487b;

    public j0(Object obj, int i10) {
        this.f486a = i10;
        this.f487b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.f0 f0Var;
        switch (this.f486a) {
            case 0:
                i1 i1Var = (i1) this.f487b;
                i1Var.f430b0 = false;
                i1Var.f447t0.W = true;
                i1Var.A0.invalidate();
                i1Var.f447t0.invalidate();
                break;
            case 1:
                y2 y2Var = (y2) this.f487b;
                k kVar = y2Var.f720n0;
                if (kVar != null) {
                    kVar.setDialogVisible(false);
                }
                y2Var.m0.setPaused(false);
                break;
            case 2:
                ((fh.v) this.f487b).f6189s = null;
                break;
            case 3:
                ((n6) this.f487b).run();
                break;
            case 4:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f487b);
                break;
            case 5:
                ((m5) this.f487b).run();
                break;
            case 6:
                ((y9) this.f487b).run();
                break;
            case 7:
                i9 i9Var = (i9) this.f487b;
                if (dialogInterface == i9Var.f13500q0) {
                    i9Var.f13500q0 = null;
                    i9Var.P();
                }
                break;
            case 8:
                Runnable[] runnableArr = (Runnable[]) this.f487b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                }
                break;
            case 9:
                org.telegram.ui.web.z0 z0Var = ((org.telegram.ui.web.l0) this.f487b).f43906e.M;
                if (z0Var != null && (f0Var = z0Var.f44061c) != null) {
                    f0Var.y();
                    break;
                }
                break;
            case 10:
                org.telegram.ui.web.f0 f0Var2 = ((org.telegram.ui.web.s0) this.f487b).f43993b.f44002e.M.f44061c;
                if (f0Var2 != null) {
                    f0Var2.y();
                }
                break;
            case 11:
                AndroidUtilities.hideKeyboard((qf.p) this.f487b);
                break;
            case 12:
                AndroidUtilities.hideKeyboard((qf.h1) this.f487b);
                break;
            case 13:
                ((rh.p) this.f487b).K = null;
                break;
            default:
                ((rh.x1) this.f487b).K0 = null;
                break;
        }
    }
}
