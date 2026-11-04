package ci;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ba implements DialogInterface.OnDismissListener {
    public final int f4887a;
    public final Object f4888b;

    public ba(Object obj, int i3) {
        this.f4887a = i3;
        this.f4888b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.d0 d0Var;
        switch (this.f4887a) {
            case 0:
                org.telegram.messenger.g0.v1((EditTextBoldCursor) this.f4888b);
                return;
            case 1:
                ((e0) this.f4888b).run();
                return;
            case 2:
                ((l8) this.f4888b).run();
                return;
            case 3:
                ((ei.z5) this.f4888b).run();
                return;
            case 4:
                ei.r9 r9Var = (ei.r9) this.f4888b;
                if (dialogInterface == r9Var.f10955v0) {
                    r9Var.f10955v0 = null;
                    r9Var.d0();
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.v1((lg.s) this.f4888b);
                return;
            case 6:
                org.telegram.messenger.g0.v1((lg.y0) this.f4888b);
                return;
            case 7:
                ((mi.p) this.f4888b).P = null;
                return;
            case 8:
                ((mi.c2) this.f4888b).P0 = null;
                return;
            case 9:
                ((org.telegram.ui.ActionBar.s1) this.f4888b).L = null;
                return;
            case 10:
                Runnable[] runnableArr = (Runnable[]) this.f4888b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.w0 w0Var = ((org.telegram.ui.web.j0) this.f4888b).f50915e.R;
                if (w0Var != null && (d0Var = w0Var.f51064c) != null) {
                    d0Var.z();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.d0 d0Var2 = ((org.telegram.ui.web.p0) this.f4888b).f50986b.f50996e.R.f51064c;
                if (d0Var2 != null) {
                    d0Var2.z();
                    return;
                }
                return;
            case 13:
                vg.i0 i0Var = (vg.i0) this.f4888b;
                i0Var.Y1 = false;
                i0Var.f56666q2.f31528e0 = true;
                i0Var.f56673x2.invalidate();
                i0Var.f56666q2.invalidate();
                return;
            case 14:
                vg.h1 h1Var = (vg.h1) this.f4888b;
                ic icVar = h1Var.f56633k2;
                if (icVar != null) {
                    icVar.setDialogVisible(false);
                }
                h1Var.f56632j2.setPaused(false);
                return;
            default:
                ((zh.k) this.f4888b).f60596s = null;
                return;
        }
    }
}
