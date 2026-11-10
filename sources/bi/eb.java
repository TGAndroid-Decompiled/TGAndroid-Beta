package bi;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class eb implements DialogInterface.OnDismissListener {
    public final int f3827a;
    public final Object f3828b;

    public eb(Object obj, int i7) {
        this.f3827a = i7;
        this.f3828b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.d0 d0Var;
        switch (this.f3827a) {
            case 0:
                org.telegram.messenger.g0.v1((EditTextBoldCursor) this.f3828b);
                return;
            case 1:
                ((a4) this.f3828b).run();
                return;
            case 2:
                ((l9) this.f3828b).run();
                return;
            case 3:
                ((di.f8) this.f3828b).run();
                return;
            case 4:
                di.q9 q9Var = (di.q9) this.f3828b;
                if (dialogInterface == q9Var.f9644u0) {
                    q9Var.f9644u0 = null;
                    q9Var.V();
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.v1((kg.s) this.f3828b);
                return;
            case 6:
                org.telegram.messenger.g0.v1((kg.x0) this.f3828b);
                return;
            case 7:
                ((li.p) this.f3828b).O = null;
                return;
            case 8:
                ((li.b2) this.f3828b).O0 = null;
                return;
            case 9:
                ((org.telegram.ui.ActionBar.u1) this.f3828b).K = null;
                return;
            case 10:
                Runnable[] runnableArr = (Runnable[]) this.f3828b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.x0 x0Var = ((org.telegram.ui.web.j0) this.f3828b).f51113e.Q;
                if (x0Var != null && (d0Var = x0Var.f51299c) != null) {
                    d0Var.z();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.d0 d0Var2 = ((org.telegram.ui.web.q0) this.f3828b).f51217b.f51228e.Q.f51299c;
                if (d0Var2 != null) {
                    d0Var2.z();
                    return;
                }
                return;
            case 13:
                ug.i0 i0Var = (ug.i0) this.f3828b;
                i0Var.f56615a2 = false;
                i0Var.f56632s2.f31471d0 = true;
                i0Var.f56639z2.invalidate();
                i0Var.f56632s2.invalidate();
                return;
            case 14:
                ug.f1 f1Var = (ug.f1) this.f3828b;
                qd qdVar = f1Var.f56585m2;
                if (qdVar != null) {
                    qdVar.setDialogVisible(false);
                }
                f1Var.f56584l2.setPaused(false);
                return;
            default:
                ((yh.m) this.f3828b).f59566s = null;
                return;
        }
    }
}
