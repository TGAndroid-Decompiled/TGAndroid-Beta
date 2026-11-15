package di;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class q9 implements DialogInterface.OnDismissListener {
    public final int f9283a;
    public final Object f9284b;

    public q9(Object obj, int i7) {
        this.f9283a = i7;
        this.f9284b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.c0 c0Var;
        switch (this.f9283a) {
            case 0:
                org.telegram.messenger.g0.v1((EditTextBoldCursor) this.f9284b);
                return;
            case 1:
                ((s2) this.f9284b).run();
                return;
            case 2:
                ((c8) this.f9284b).run();
                return;
            case 3:
                ((fi.c1) this.f9284b).run();
                return;
            case 4:
                fi.i9 i9Var = (fi.i9) this.f9284b;
                if (dialogInterface == i9Var.f11877v0) {
                    i9Var.f11877v0 = null;
                    i9Var.V();
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.v1((kg.s) this.f9284b);
                return;
            case 6:
                org.telegram.messenger.g0.v1((kg.x0) this.f9284b);
                return;
            case 7:
                ((oi.o) this.f9284b).P = null;
                return;
            case 8:
                ((oi.z1) this.f9284b).P0 = null;
                return;
            case 9:
                ((org.telegram.ui.ActionBar.t1) this.f9284b).L = null;
                return;
            case 10:
                Runnable[] runnableArr = (Runnable[]) this.f9284b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.v0 v0Var = ((org.telegram.ui.web.i0) this.f9284b).f52638e.R;
                if (v0Var != null && (c0Var = v0Var.f52818c) != null) {
                    c0Var.z();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.c0 c0Var2 = ((org.telegram.ui.web.o0) this.f9284b).f52738b.f52750e.R.f52818c;
                if (c0Var2 != null) {
                    c0Var2.z();
                    return;
                }
                return;
            case 13:
                ug.j0 j0Var = (ug.j0) this.f9284b;
                j0Var.f58131b2 = false;
                j0Var.f58148t2.f32635e0 = true;
                j0Var.A2.invalidate();
                j0Var.f58148t2.invalidate();
                return;
            case 14:
                ug.g1 g1Var = (ug.g1) this.f9284b;
                xb xbVar = g1Var.f58099n2;
                if (xbVar != null) {
                    xbVar.setDialogVisible(false);
                }
                g1Var.f58098m2.setPaused(false);
                return;
            default:
                ((zh.l) this.f9284b).f61458s = null;
                return;
        }
    }
}
