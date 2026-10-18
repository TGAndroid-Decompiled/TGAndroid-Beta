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
public final class b3 extends ti {
    public final int S2;
    public final NotificationCenter.NotificationCenterDelegate T2;

    public b3(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.n2 n2Var2, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
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
                b3 b3Var = mVar.L;
                if (b3Var != null && b3Var.isShowing()) {
                    AndroidUtilities.requestAdjustResize(mVar.getParentActivity(), ig.m.c0(mVar));
                }
                super.dismissInternal();
                return;
            case 2:
                sn snVar = (sn) notificationCenterDelegate;
                b3 b3Var2 = snVar.J1;
                if (b3Var2 != null && (b3Var2.isShowing() || this.f30638x0)) {
                    Activity parentActivity = snVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                snVar.Y9(false, true);
                lm lmVar = snVar.X0;
                if (lmVar != null) {
                    WeakHashMap weakHashMap = r0.i0.f44864a;
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
                q4 q4Var = (q4) this.T2;
                b3 b3Var = q4Var.I2;
                if (b3Var != null) {
                    b3Var.setFocusable(false);
                }
                v2 v2Var = q4Var.f5769b2;
                if (v2Var != null && v2Var.getEditField() != null) {
                    q4Var.f5769b2.getEditField().requestFocus();
                    return;
                }
                return;
            case 1:
                ig.m mVar = (ig.m) this.T2;
                b3 b3Var2 = mVar.L;
                if (b3Var2 != null) {
                    b3Var2.setFocusable(false);
                }
                b3 b3Var3 = mVar.L;
                if (b3Var3 != null && b3Var3.isShowing()) {
                    AndroidUtilities.requestAdjustResize(mVar.getParentActivity(), ig.m.d0(mVar));
                    return;
                }
                return;
            default:
                sn snVar = (sn) this.T2;
                boolean z10 = this.f30638x0;
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
                    b3 b3Var4 = snVar.J1;
                    if (b3Var4 != null) {
                        b3Var4.setFocusable(false);
                    }
                    if (M && (hkVar = snVar.Y) != null && hkVar.getEditField() != null) {
                        snVar.Y.getEditField().requestFocus();
                    }
                    b3 b3Var5 = snVar.J1;
                    if (b3Var5 != null && b3Var5.isShowing()) {
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

    public b3(q4 q4Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, false, false, true, d6Var);
        this.S2 = 0;
        this.T2 = q4Var;
    }
}
