package bi;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.vi;
import org.telegram.ui.co;
import org.telegram.ui.mk;
public final class t3 extends vi {
    public final int P2;
    public final NotificationCenter.NotificationCenterDelegate Q2;

    public t3(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.n2 n2Var2, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(activity, n2Var2, false, false, true, f6Var);
        this.P2 = i10;
        this.Q2 = (NotificationCenter.NotificationCenterDelegate) n2Var;
    }

    @Override
    public void dismissInternal() {
        int i10;
        switch (this.P2) {
            case 1:
                ig.m mVar = (ig.m) this.Q2;
                t3 t3Var = mVar.L;
                if (t3Var != null && t3Var.isShowing()) {
                    AndroidUtilities.requestAdjustResize(mVar.getParentActivity(), ig.m.c0(mVar));
                }
                super.dismissInternal();
                return;
            case 2:
                co coVar = (co) this.Q2;
                t3 t3Var2 = coVar.J1;
                if (t3Var2 != null && t3Var2.isShowing()) {
                    Activity parentActivity = coVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                coVar.T9(false, true);
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
                o5 o5Var = (o5) this.Q2;
                t3 t3Var = o5Var.I2;
                if (t3Var != null) {
                    t3Var.setFocusable(false);
                }
                n3 n3Var = o5Var.f3433b2;
                if (n3Var != null && n3Var.getEditField() != null) {
                    o5Var.f3433b2.getEditField().requestFocus();
                    return;
                }
                return;
            case 1:
                ig.m mVar = (ig.m) this.Q2;
                t3 t3Var2 = mVar.L;
                if (t3Var2 != null) {
                    t3Var2.setFocusable(false);
                }
                t3 t3Var3 = mVar.L;
                if (t3Var3 != null && t3Var3.isShowing()) {
                    AndroidUtilities.requestAdjustResize(mVar.getParentActivity(), ig.m.d0(mVar));
                    return;
                }
                return;
            default:
                co coVar = (co) this.Q2;
                t3 t3Var4 = coVar.J1;
                if (t3Var4 != null) {
                    t3Var4.setFocusable(false);
                }
                mk mkVar = coVar.Y;
                if (mkVar != null && mkVar.getEditField() != null) {
                    coVar.Y.getEditField().requestFocus();
                }
                t3 t3Var5 = coVar.J1;
                if (t3Var5 != null && t3Var5.isShowing()) {
                    Activity parentActivity = coVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                coVar.T9(false, false);
                return;
        }
    }

    public t3(o5 o5Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, true, f6Var);
        this.P2 = 0;
        this.Q2 = o5Var;
    }
}
