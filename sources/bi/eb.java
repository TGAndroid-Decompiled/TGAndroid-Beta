package bi;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class eb implements DialogInterface.OnDismissListener {
    public final int f3830a;
    public final Object f3831b;

    public eb(Object obj, int i7) {
        this.f3830a = i7;
        this.f3831b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.d0 d0Var;
        switch (this.f3830a) {
            case 0:
                org.telegram.messenger.g0.v1((EditTextBoldCursor) this.f3831b);
                return;
            case 1:
                ((a4) this.f3831b).run();
                return;
            case 2:
                ((l9) this.f3831b).run();
                return;
            case 3:
                ((di.s7) this.f3831b).run();
                return;
            case 4:
                di.p9 p9Var = (di.p9) this.f3831b;
                if (dialogInterface == p9Var.f9574u0) {
                    p9Var.f9574u0 = null;
                    p9Var.V();
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.v1((kg.s) this.f3831b);
                return;
            case 6:
                org.telegram.messenger.g0.v1((kg.x0) this.f3831b);
                return;
            case 7:
                ((li.p) this.f3831b).O = null;
                return;
            case 8:
                ((li.b2) this.f3831b).O0 = null;
                return;
            case 9:
                ((org.telegram.ui.ActionBar.u1) this.f3831b).K = null;
                return;
            case 10:
                Runnable[] runnableArr = (Runnable[]) this.f3831b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.x0 x0Var = ((org.telegram.ui.web.j0) this.f3831b).f51166e.Q;
                if (x0Var != null && (d0Var = x0Var.f51352c) != null) {
                    d0Var.z();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.d0 d0Var2 = ((org.telegram.ui.web.q0) this.f3831b).f51270b.f51281e.Q.f51352c;
                if (d0Var2 != null) {
                    d0Var2.z();
                    return;
                }
                return;
            case 13:
                ug.i0 i0Var = (ug.i0) this.f3831b;
                i0Var.X1 = false;
                i0Var.f56501p2.f31450d0 = true;
                i0Var.f56508w2.invalidate();
                i0Var.f56501p2.invalidate();
                return;
            case 14:
                ug.f1 f1Var = (ug.f1) this.f3831b;
                qd qdVar = f1Var.f56454j2;
                if (qdVar != null) {
                    qdVar.setDialogVisible(false);
                }
                f1Var.f56453i2.setPaused(false);
                return;
            default:
                ((yh.m) this.f3831b).f59436s = null;
                return;
        }
    }
}
