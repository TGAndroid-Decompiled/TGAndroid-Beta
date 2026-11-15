package di;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r9 implements DialogInterface.OnDismissListener {
    public final int f9347a;
    public final Object f9348b;

    public r9(Object obj, int i7) {
        this.f9347a = i7;
        this.f9348b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.c0 c0Var;
        switch (this.f9347a) {
            case 0:
                org.telegram.messenger.g0.v1((EditTextBoldCursor) this.f9348b);
                return;
            case 1:
                ((s2) this.f9348b).run();
                return;
            case 2:
                ((d8) this.f9348b).run();
                return;
            case 3:
                ((fi.c1) this.f9348b).run();
                return;
            case 4:
                fi.i9 i9Var = (fi.i9) this.f9348b;
                if (dialogInterface == i9Var.f11877v0) {
                    i9Var.f11877v0 = null;
                    i9Var.V();
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.v1((kg.s) this.f9348b);
                return;
            case 6:
                org.telegram.messenger.g0.v1((kg.x0) this.f9348b);
                return;
            case 7:
                ((oi.o) this.f9348b).P = null;
                return;
            case 8:
                ((oi.z1) this.f9348b).P0 = null;
                return;
            case 9:
                ((org.telegram.ui.ActionBar.t1) this.f9348b).L = null;
                return;
            case 10:
                Runnable[] runnableArr = (Runnable[]) this.f9348b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.v0 v0Var = ((org.telegram.ui.web.i0) this.f9348b).f52635e.R;
                if (v0Var != null && (c0Var = v0Var.f52815c) != null) {
                    c0Var.z();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.c0 c0Var2 = ((org.telegram.ui.web.o0) this.f9348b).f52735b.f52747e.R.f52815c;
                if (c0Var2 != null) {
                    c0Var2.z();
                    return;
                }
                return;
            case 13:
                ug.j0 j0Var = (ug.j0) this.f9348b;
                j0Var.f58131b2 = false;
                j0Var.f58148t2.f32635e0 = true;
                j0Var.A2.invalidate();
                j0Var.f58148t2.invalidate();
                return;
            case 14:
                ug.g1 g1Var = (ug.g1) this.f9348b;
                yb ybVar = g1Var.f58099n2;
                if (ybVar != null) {
                    ybVar.setDialogVisible(false);
                }
                g1Var.f58098m2.setPaused(false);
                return;
            default:
                ((zh.l) this.f9348b).f61458s = null;
                return;
        }
    }
}
