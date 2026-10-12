package ai;

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.aj;
import org.telegram.ui.eo;
import org.telegram.ui.sk;
import org.telegram.ui.wm;
public final class h4 extends aj {
    public final int S2;
    public final NotificationCenter.NotificationCenterDelegate T2;

    public h4(org.telegram.ui.ActionBar.m2 m2Var, Activity activity, org.telegram.ui.ActionBar.m2 m2Var2, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(activity, m2Var2, false, false, true, c6Var);
        this.S2 = i10;
        this.T2 = (NotificationCenter.NotificationCenterDelegate) m2Var;
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
                eo eoVar = (eo) notificationCenterDelegate;
                h4 h4Var2 = eoVar.J1;
                if (h4Var2 != null && (h4Var2.isShowing() || this.f24395x0)) {
                    Activity parentActivity = eoVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.m2) eoVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                eoVar.Y9(false, true);
                wm wmVar = eoVar.X0;
                if (wmVar != null) {
                    WeakHashMap weakHashMap = r0.i0.f46989a;
                    r0.y.c(wmVar);
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
        sk skVar;
        switch (this.S2) {
            case 0:
                f6 f6Var = (f6) this.T2;
                h4 h4Var = f6Var.I2;
                if (h4Var != null) {
                    h4Var.setFocusable(false);
                }
                b4 b4Var = f6Var.f950b2;
                if (b4Var != null && b4Var.getEditField() != null) {
                    f6Var.f950b2.getEditField().requestFocus();
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
                eo eoVar = (eo) this.T2;
                boolean z10 = this.f24395x0;
                boolean M = this.B0.M();
                if (!M) {
                    eoVar.D3 = false;
                    sk skVar2 = eoVar.Y;
                    if (skVar2 != null) {
                        if (!z10) {
                            skVar2.Q();
                        }
                        if (eoVar.Y.getEditField() != null) {
                            eoVar.Y.getEditField().clearFocus();
                        }
                    }
                }
                if (!z10) {
                    h4 h4Var4 = eoVar.J1;
                    if (h4Var4 != null) {
                        h4Var4.setFocusable(false);
                    }
                    if (M && (skVar = eoVar.Y) != null && skVar.getEditField() != null) {
                        eoVar.Y.getEditField().requestFocus();
                    }
                    h4 h4Var5 = eoVar.J1;
                    if (h4Var5 != null && h4Var5.isShowing()) {
                        Activity parentActivity = eoVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.m2) eoVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    }
                    eoVar.Y9(false, false);
                    return;
                }
                return;
        }
    }

    public h4(f6 f6Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, false, false, true, c6Var);
        this.S2 = 0;
        this.T2 = f6Var;
    }
}
