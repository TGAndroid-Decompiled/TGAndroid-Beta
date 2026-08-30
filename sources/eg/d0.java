package eg;

import android.content.DialogInterface;
import lh.l6;
import nh.i9;
import nh.n5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d0 implements DialogInterface.OnDismissListener {
    public final int f5244a;
    public final Object f5245b;

    public d0(Object obj, int i10) {
        this.f5244a = i10;
        this.f5245b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.e0 e0Var;
        switch (this.f5244a) {
            case 0:
                v0 v0Var = (v0) this.f5245b;
                v0Var.f5536c0 = false;
                v0Var.f5553u0.f23092a0 = true;
                v0Var.B0.invalidate();
                v0Var.f5553u0.invalidate();
                return;
            case 1:
                e2 e2Var = (e2) this.f5245b;
                i iVar = e2Var.f5271o0;
                if (iVar != null) {
                    iVar.setDialogVisible(false);
                }
                e2Var.f5270n0.setPaused(false);
                return;
            case 2:
                ((jh.v) this.f5245b).f9494s = null;
                return;
            case 3:
                ((l6) this.f5245b).run();
                return;
            case 4:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f5245b);
                return;
            case 5:
                ((lh.n2) this.f5245b).run();
                return;
            case 6:
                ((n5) this.f5245b).run();
                return;
            case 7:
                i9 i9Var = (i9) this.f5245b;
                if (dialogInterface == i9Var.f15486r0) {
                    i9Var.f15486r0 = null;
                    i9Var.P();
                    return;
                }
                return;
            case 8:
                Runnable[] runnableArr = (Runnable[]) this.f5245b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 9:
                org.telegram.ui.web.a1 a1Var = ((org.telegram.ui.web.k0) this.f5245b).e.N;
                if (a1Var != null && (e0Var = a1Var.f39424c) != null) {
                    e0Var.y();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.web.e0 e0Var2 = ((org.telegram.ui.web.s0) this.f5245b).f39626b.e.N.f39424c;
                if (e0Var2 != null) {
                    e0Var2.y();
                    return;
                }
                return;
            case 11:
                AndroidUtilities.hideKeyboard((uf.n) this.f5245b);
                return;
            case 12:
                AndroidUtilities.hideKeyboard((uf.g1) this.f5245b);
                return;
            case 13:
                ((vh.p) this.f5245b).L = null;
                return;
            default:
                ((vh.y1) this.f5245b).L0 = null;
                return;
        }
    }
}
