package di;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class u9 implements DialogInterface.OnDismissListener {
    public final int f9915a;
    public final Object f9916b;

    public u9(Object obj, int i7) {
        this.f9915a = i7;
        this.f9916b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.c0 c0Var;
        switch (this.f9915a) {
            case 0:
                org.telegram.messenger.g0.v1((EditTextBoldCursor) this.f9916b);
                return;
            case 1:
                ((f2) this.f9916b).run();
                return;
            case 2:
                ((g8) this.f9916b).run();
                return;
            case 3:
                ((f2.a) this.f9916b).run();
                return;
            case 4:
                fi.f9 f9Var = (fi.f9) this.f9916b;
                if (dialogInterface == f9Var.f12043v0) {
                    f9Var.f12043v0 = null;
                    f9Var.V();
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.v1((kg.s) this.f9916b);
                return;
            case 6:
                org.telegram.messenger.g0.v1((kg.z0) this.f9916b);
                return;
            case 7:
                ((oi.o) this.f9916b).P = null;
                return;
            case 8:
                ((oi.b2) this.f9916b).P0 = null;
                return;
            case 9:
                ((org.telegram.ui.ActionBar.t1) this.f9916b).L = null;
                return;
            case 10:
                Runnable[] runnableArr = (Runnable[]) this.f9916b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.v0 v0Var = ((org.telegram.ui.web.i0) this.f9916b).f53165e.R;
                if (v0Var != null && (c0Var = v0Var.f53345c) != null) {
                    c0Var.z();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.c0 c0Var2 = ((org.telegram.ui.web.o0) this.f9916b).f53265b.f53277e.R.f53345c;
                if (c0Var2 != null) {
                    c0Var2.z();
                    return;
                }
                return;
            case 13:
                ug.k0 k0Var = (ug.k0) this.f9916b;
                k0Var.f58769b2 = false;
                k0Var.f58786t2.f33068e0 = true;
                k0Var.A2.invalidate();
                k0Var.f58786t2.invalidate();
                return;
            case 14:
                ug.h1 h1Var = (ug.h1) this.f9916b;
                bc bcVar = h1Var.f58728n2;
                if (bcVar != null) {
                    bcVar.setDialogVisible(false);
                }
                h1Var.f58727m2.setPaused(false);
                return;
            default:
                ((zh.l) this.f9916b).f62070s = null;
                return;
        }
    }
}
