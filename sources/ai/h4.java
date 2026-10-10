package ai;

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.yi;
import org.telegram.ui.ok;
import org.telegram.ui.sm;
import org.telegram.ui.zn;
public final class h4 extends yi {
    public final int S2;
    public final NotificationCenter.NotificationCenterDelegate T2;

    public h4(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.n2 n2Var2, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(activity, n2Var2, false, false, true, e6Var);
        this.S2 = i10;
        this.T2 = (NotificationCenter.NotificationCenterDelegate) n2Var;
    }

    @Override
    public void dismissInternal() {
        int i10;
        int i11 = this.S2;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.T2;
        switch (i11) {
            case 1:
                hg.n nVar = (hg.n) notificationCenterDelegate;
                h4 h4Var = nVar.L;
                if (h4Var != null && h4Var.isShowing()) {
                    AndroidUtilities.requestAdjustResize(nVar.getParentActivity(), hg.n.c0(nVar));
                }
                super.dismissInternal();
                return;
            case 2:
                zn znVar = (zn) notificationCenterDelegate;
                h4 h4Var2 = znVar.J1;
                if (h4Var2 != null && (h4Var2.isShowing() || this.f33292x0)) {
                    Activity parentActivity = znVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                znVar.Y9(false, true);
                sm smVar = znVar.X0;
                if (smVar != null) {
                    WeakHashMap weakHashMap = r0.i0.f46810a;
                    r0.y.c(smVar);
                    return;
                }
                return;
            default:
                super.dismissInternal();
                return;
        }
    }

    @Override
    public final void onDismissAnimationStart() {
        int i10;
        ok okVar;
        switch (this.S2) {
            case 0:
                f6 f6Var = (f6) this.T2;
                h4 h4Var = f6Var.I2;
                if (h4Var != null) {
                    h4Var.setFocusable(false);
                }
                b4 b4Var = f6Var.f952b2;
                if (b4Var != null && b4Var.getEditField() != null) {
                    f6Var.f952b2.getEditField().requestFocus();
                    return;
                }
                return;
            case 1:
                hg.n nVar = (hg.n) this.T2;
                h4 h4Var2 = nVar.L;
                if (h4Var2 != null) {
                    h4Var2.setFocusable(false);
                }
                h4 h4Var3 = nVar.L;
                if (h4Var3 != null && h4Var3.isShowing()) {
                    AndroidUtilities.requestAdjustResize(nVar.getParentActivity(), hg.n.d0(nVar));
                    return;
                }
                return;
            default:
                zn znVar = (zn) this.T2;
                boolean z10 = this.f33292x0;
                boolean M = this.B0.M();
                if (!M) {
                    znVar.D3 = false;
                    ok okVar2 = znVar.Y;
                    if (okVar2 != null) {
                        if (!z10) {
                            okVar2.N();
                        }
                        if (znVar.Y.getEditField() != null) {
                            znVar.Y.getEditField().clearFocus();
                        }
                    }
                }
                if (!z10) {
                    h4 h4Var4 = znVar.J1;
                    if (h4Var4 != null) {
                        h4Var4.setFocusable(false);
                    }
                    if (M && (okVar = znVar.Y) != null && okVar.getEditField() != null) {
                        znVar.Y.getEditField().requestFocus();
                    }
                    h4 h4Var5 = znVar.J1;
                    if (h4Var5 != null && h4Var5.isShowing()) {
                        Activity parentActivity = znVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    }
                    znVar.Y9(false, false);
                    return;
                }
                return;
        }
    }

    public h4(f6 f6Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, false, false, true, e6Var);
        this.S2 = 0;
        this.T2 = f6Var;
    }
}
