package di;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t9 implements DialogInterface.OnDismissListener {
    public final int f9819a;
    public final Object f9820b;

    public t9(Object obj, int i7) {
        this.f9819a = i7;
        this.f9820b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.c0 c0Var;
        switch (this.f9819a) {
            case 0:
                org.telegram.messenger.g0.v1((EditTextBoldCursor) this.f9820b);
                return;
            case 1:
                ((w2) this.f9820b).run();
                return;
            case 2:
                ((f8) this.f9820b).run();
                return;
            case 3:
                ((f2.a) this.f9820b).run();
                return;
            case 4:
                fi.f9 f9Var = (fi.f9) this.f9820b;
                if (dialogInterface == f9Var.f11999v0) {
                    f9Var.f11999v0 = null;
                    f9Var.V();
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.v1((kg.s) this.f9820b);
                return;
            case 6:
                org.telegram.messenger.g0.v1((kg.a1) this.f9820b);
                return;
            case 7:
                ((oi.o) this.f9820b).P = null;
                return;
            case 8:
                ((oi.z1) this.f9820b).P0 = null;
                return;
            case 9:
                ((org.telegram.ui.ActionBar.u1) this.f9820b).L = null;
                return;
            case 10:
                Runnable[] runnableArr = (Runnable[]) this.f9820b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.v0 v0Var = ((org.telegram.ui.web.i0) this.f9820b).f53118e.R;
                if (v0Var != null && (c0Var = v0Var.f53298c) != null) {
                    c0Var.z();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.c0 c0Var2 = ((org.telegram.ui.web.o0) this.f9820b).f53218b.f53230e.R.f53298c;
                if (c0Var2 != null) {
                    c0Var2.z();
                    return;
                }
                return;
            case 13:
                ug.l0 l0Var = (ug.l0) this.f9820b;
                l0Var.f58730b2 = false;
                l0Var.f58747t2.f33032e0 = true;
                l0Var.A2.invalidate();
                l0Var.f58747t2.invalidate();
                return;
            case 14:
                ug.i1 i1Var = (ug.i1) this.f9820b;
                bc bcVar = i1Var.f58690n2;
                if (bcVar != null) {
                    bcVar.setDialogVisible(false);
                }
                i1Var.f58689m2.setPaused(false);
                return;
            default:
                ((zh.l) this.f9820b).f62025s = null;
                return;
        }
    }
}
