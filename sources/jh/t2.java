package jh;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.gi;
import org.telegram.ui.ck;
import org.telegram.ui.rn;

public final class t2 extends gi {
    public final int L2;
    public final NotificationCenter.NotificationCenterDelegate M2;

    public t2(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.n2 n2Var2, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(activity, n2Var2, false, false, true, c6Var);
        this.L2 = i10;
        this.M2 = (NotificationCenter.NotificationCenterDelegate) n2Var;
    }

    @Override
    public void dismissInternal() {
        switch (this.L2) {
            case 1:
                rn rnVar = (rn) this.M2;
                t2 t2Var = rnVar.F1;
                if (t2Var != null && t2Var.isShowing()) {
                    AndroidUtilities.requestAdjustResize(rnVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) rnVar).classGuid);
                }
                super.dismissInternal();
                rnVar.T9(false, true);
                break;
            case 2:
                qf.m mVar = (qf.m) this.M2;
                t2 t2Var2 = mVar.H;
                if (t2Var2 != null && t2Var2.isShowing()) {
                    AndroidUtilities.requestAdjustResize(mVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) mVar).classGuid);
                }
                super.dismissInternal();
                break;
            default:
                super.dismissInternal();
                break;
        }
    }

    @Override
    public final void onDismissAnimationStart() {
        switch (this.L2) {
            case 0:
                e4 e4Var = (e4) this.M2;
                t2 t2Var = e4Var.E2;
                if (t2Var != null) {
                    t2Var.setFocusable(false);
                }
                o2 o2Var = e4Var.X1;
                if (o2Var != null && o2Var.getEditField() != null) {
                    e4Var.X1.getEditField().requestFocus();
                    break;
                }
                break;
            case 1:
                rn rnVar = (rn) this.M2;
                t2 t2Var2 = rnVar.F1;
                if (t2Var2 != null) {
                    t2Var2.setFocusable(false);
                }
                ck ckVar = rnVar.U;
                if (ckVar != null && ckVar.getEditField() != null) {
                    rnVar.U.getEditField().requestFocus();
                }
                t2 t2Var3 = rnVar.F1;
                if (t2Var3 != null && t2Var3.isShowing()) {
                    AndroidUtilities.requestAdjustResize(rnVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) rnVar).classGuid);
                }
                rnVar.T9(false, false);
                break;
            default:
                qf.m mVar = (qf.m) this.M2;
                t2 t2Var4 = mVar.H;
                if (t2Var4 != null) {
                    t2Var4.setFocusable(false);
                }
                t2 t2Var5 = mVar.H;
                if (t2Var5 != null && t2Var5.isShowing()) {
                    AndroidUtilities.requestAdjustResize(mVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) mVar).classGuid);
                    break;
                }
                break;
        }
    }

    public t2(e4 e4Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, false, false, true, c6Var);
        this.L2 = 0;
        this.M2 = e4Var;
    }
}
