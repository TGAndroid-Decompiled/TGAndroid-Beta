package bi;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.eg0;
import org.telegram.ui.o31;
public final class r4 implements DialogInterface.OnDismissListener {
    public final int f3653a;
    public final Object f3654b;

    public r4(Object obj, int i10) {
        this.f3653a = i10;
        this.f3654b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.i0 i0Var;
        switch (this.f3653a) {
            case 0:
                ((a3.d) this.f3654b).run();
                return;
            case 1:
                pb pbVar = (pb) this.f3654b;
                if (dialogInterface == pbVar.f3604u0) {
                    pbVar.f3604u0 = null;
                    pbVar.P();
                    return;
                }
                return;
            case 2:
                AndroidUtilities.hideKeyboard((ig.s) this.f3654b);
                return;
            case 3:
                AndroidUtilities.hideKeyboard((ig.r1) this.f3654b);
                return;
            case 4:
                ((ji.r) this.f3654b).O = null;
                return;
            case 5:
                ((ji.c2) this.f3654b).O0 = null;
                return;
            case 6:
                Runnable[] runnableArr = (Runnable[]) this.f3654b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 7:
                org.telegram.ui.web.d1 d1Var = ((org.telegram.ui.web.o0) this.f3654b).f42226e.Q;
                if (d1Var != null && (i0Var = d1Var.f42066c) != null) {
                    i0Var.y();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.web.i0 i0Var2 = ((org.telegram.ui.web.v0) this.f3654b).f42287b.f42300e.Q.f42066c;
                if (i0Var2 != null) {
                    i0Var2.y();
                    return;
                }
                return;
            case 9:
                sg.k0 k0Var = (sg.k0) this.f3654b;
                k0Var.f46163f0 = false;
                k0Var.f46180x0.f24078d0 = true;
                k0Var.E0.invalidate();
                k0Var.f46180x0.invalidate();
                return;
            case 10:
                sg.o1 o1Var = (sg.o1) this.f3654b;
                eg0 eg0Var = o1Var.f46238r0;
                if (eg0Var != null) {
                    eg0Var.setDialogVisible(false);
                }
                o1Var.f46237q0.setPaused(false);
                return;
            case 11:
                ((xh.n) this.f3654b).f49487s = null;
                return;
            case 12:
                ((o31) this.f3654b).run();
                return;
            case 13:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f3654b);
                return;
            default:
                ((ug.r) this.f3654b).run();
                return;
        }
    }
}
