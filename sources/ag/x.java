package ag;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.qz0;
import th.o7;
public final class x implements DialogInterface.OnDismissListener {
    public final int f781a;
    public final Object f782b;

    public x(Object obj, int i10) {
        this.f781a = i10;
        this.f782b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.d0 d0Var;
        switch (this.f781a) {
            case 0:
                org.telegram.messenger.i0.v1((f0) this.f782b);
                return;
            case 1:
                org.telegram.messenger.i0.v1((a2) this.f782b);
                return;
            case 2:
                ((bi.t) this.f782b).O = null;
                return;
            case 3:
                ((bi.k2) this.f782b).O0 = null;
                return;
            case 4:
                kg.q0 q0Var = (kg.q0) this.f782b;
                q0Var.X1 = false;
                q0Var.f11239p2.f24103d0 = true;
                q0Var.f11246w2.invalidate();
                q0Var.f11239p2.invalidate();
                return;
            case 5:
                kg.v1 v1Var = (kg.v1) this.f782b;
                kg.h hVar = v1Var.f11301j2;
                if (hVar != null) {
                    hVar.setDialogVisible(false);
                }
                v1Var.f11300i2.setPaused(false);
                return;
            case 6:
                ((oh.q) this.f782b).f14307s = null;
                return;
            case 7:
                ((org.telegram.ui.ActionBar.x1) this.f782b).K = null;
                return;
            case 8:
                Runnable[] runnableArr = (Runnable[]) this.f782b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 9:
                org.telegram.ui.web.z0 z0Var = ((org.telegram.ui.web.j0) this.f782b).e.Q;
                if (z0Var != null && (d0Var = z0Var.f43261c) != null) {
                    d0Var.z();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.web.d0 d0Var2 = ((org.telegram.ui.web.r0) this.f782b).f43180b.e.Q.f43261c;
                if (d0Var2 != null) {
                    d0Var2.z();
                    return;
                }
                return;
            case 11:
                org.telegram.messenger.i0.v1((EditTextBoldCursor) this.f782b);
                return;
            case 12:
                ((rh.o) this.f782b).run();
                return;
            case 13:
                ((qz0) this.f782b).run();
                return;
            case 14:
                ((sg.v) this.f782b).run();
                return;
            default:
                o7 o7Var = (o7) this.f782b;
                if (dialogInterface == o7Var.f49335u0) {
                    o7Var.f49335u0 = null;
                    o7Var.d0();
                    return;
                }
                return;
        }
    }
}
