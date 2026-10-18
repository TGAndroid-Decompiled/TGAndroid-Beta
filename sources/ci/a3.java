package ci;

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ti;
import org.telegram.ui.hk;
import org.telegram.ui.lm;
import org.telegram.ui.sn;
public final class a3 extends ti {
    public final int S2;
    public final NotificationCenter.NotificationCenterDelegate T2;

    public a3(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.n2 n2Var2, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(activity, n2Var2, false, false, true, d6Var);
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
                ig.m mVar = (ig.m) notificationCenterDelegate;
                a3 a3Var = mVar.L;
                if (a3Var != null && a3Var.isShowing()) {
                    AndroidUtilities.requestAdjustResize(mVar.getParentActivity(), ig.m.c0(mVar));
                }
                super.dismissInternal();
                return;
            case 2:
                sn snVar = (sn) notificationCenterDelegate;
                a3 a3Var2 = snVar.J1;
                if (a3Var2 != null && (a3Var2.isShowing() || this.f30631x0)) {
                    Activity parentActivity = snVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                snVar.Y9(false, true);
                lm lmVar = snVar.X0;
                if (lmVar != null) {
                    WeakHashMap weakHashMap = r0.i0.f44818a;
                    r0.y.c(lmVar);
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
        hk hkVar;
        switch (this.S2) {
            case 0:
                p4 p4Var = (p4) this.T2;
                a3 a3Var = p4Var.I2;
                if (a3Var != null) {
                    a3Var.setFocusable(false);
                }
                u2 u2Var = p4Var.f5649b2;
                if (u2Var != null && u2Var.getEditField() != null) {
                    p4Var.f5649b2.getEditField().requestFocus();
                    return;
                }
                return;
            case 1:
                ig.m mVar = (ig.m) this.T2;
                a3 a3Var2 = mVar.L;
                if (a3Var2 != null) {
                    a3Var2.setFocusable(false);
                }
                a3 a3Var3 = mVar.L;
                if (a3Var3 != null && a3Var3.isShowing()) {
                    AndroidUtilities.requestAdjustResize(mVar.getParentActivity(), ig.m.d0(mVar));
                    return;
                }
                return;
            default:
                sn snVar = (sn) this.T2;
                boolean z10 = this.f30631x0;
                boolean M = this.B0.M();
                if (!M) {
                    snVar.D3 = false;
                    hk hkVar2 = snVar.Y;
                    if (hkVar2 != null) {
                        if (!z10) {
                            hkVar2.N();
                        }
                        if (snVar.Y.getEditField() != null) {
                            snVar.Y.getEditField().clearFocus();
                        }
                    }
                }
                if (!z10) {
                    a3 a3Var4 = snVar.J1;
                    if (a3Var4 != null) {
                        a3Var4.setFocusable(false);
                    }
                    if (M && (hkVar = snVar.Y) != null && hkVar.getEditField() != null) {
                        snVar.Y.getEditField().requestFocus();
                    }
                    a3 a3Var5 = snVar.J1;
                    if (a3Var5 != null && a3Var5.isShowing()) {
                        Activity parentActivity = snVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    }
                    snVar.Y9(false, false);
                    return;
                }
                return;
        }
    }

    public a3(p4 p4Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, false, false, true, d6Var);
        this.S2 = 0;
        this.T2 = p4Var;
    }
}
