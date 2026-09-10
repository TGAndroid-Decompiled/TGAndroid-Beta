package gg;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.yi;
import org.telegram.ui.eo;
import org.telegram.ui.ok;
import zh.a3;
public final class m extends yi {
    public final int P2;
    public final NotificationCenter.NotificationCenterDelegate Q2;

    public m(p2 p2Var, Activity activity, p2 p2Var2, f6 f6Var, int i10) {
        super(activity, p2Var2, false, false, true, f6Var);
        this.P2 = i10;
        this.Q2 = (NotificationCenter.NotificationCenterDelegate) p2Var;
    }

    @Override
    public void dismissInternal() {
        int i10;
        switch (this.P2) {
            case 0:
                n nVar = (n) this.Q2;
                m mVar = nVar.L;
                if (mVar != null && mVar.isShowing()) {
                    AndroidUtilities.requestAdjustResize(nVar.getParentActivity(), n.c0(nVar));
                }
                super.dismissInternal();
                return;
            case 1:
                eo eoVar = (eo) this.Q2;
                m mVar2 = eoVar.J1;
                if (mVar2 != null && mVar2.isShowing()) {
                    Activity parentActivity = eoVar.getParentActivity();
                    i10 = ((p2) eoVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                eoVar.T9(false, true);
                return;
            default:
                super.dismissInternal();
                return;
        }
    }

    @Override
    public final void onDismissAnimationStart() {
        int i10;
        switch (this.P2) {
            case 0:
                n nVar = (n) this.Q2;
                m mVar = nVar.L;
                if (mVar != null) {
                    mVar.setFocusable(false);
                }
                m mVar2 = nVar.L;
                if (mVar2 != null && mVar2.isShowing()) {
                    AndroidUtilities.requestAdjustResize(nVar.getParentActivity(), n.d0(nVar));
                    return;
                }
                return;
            case 1:
                eo eoVar = (eo) this.Q2;
                m mVar3 = eoVar.J1;
                if (mVar3 != null) {
                    mVar3.setFocusable(false);
                }
                ok okVar = eoVar.Y;
                if (okVar != null && okVar.getEditField() != null) {
                    eoVar.Y.getEditField().requestFocus();
                }
                m mVar4 = eoVar.J1;
                if (mVar4 != null && mVar4.isShowing()) {
                    Activity parentActivity = eoVar.getParentActivity();
                    i10 = ((p2) eoVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                eoVar.T9(false, false);
                return;
            default:
                a3 a3Var = (a3) this.Q2;
                m mVar5 = a3Var.I2;
                if (mVar5 != null) {
                    mVar5.setFocusable(false);
                }
                zh.t1 t1Var = a3Var.f48157b2;
                if (t1Var != null && t1Var.getEditField() != null) {
                    a3Var.f48157b2.getEditField().requestFocus();
                    return;
                }
                return;
        }
    }

    public m(a3 a3Var, Context context, f6 f6Var) {
        super(context, null, false, false, true, f6Var);
        this.P2 = 2;
        this.Q2 = a3Var;
    }
}
