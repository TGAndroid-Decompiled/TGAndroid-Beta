package ih;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ki;
import org.telegram.ui.ak;
import org.telegram.ui.qn;
public final class u2 extends ki {
    public final int L2;
    public final NotificationCenter.NotificationCenterDelegate M2;

    public u2(org.telegram.ui.ActionBar.o2 o2Var, Activity activity, org.telegram.ui.ActionBar.o2 o2Var2, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(activity, o2Var2, false, false, true, b6Var);
        this.L2 = i9;
        this.M2 = (NotificationCenter.NotificationCenterDelegate) o2Var;
    }

    @Override
    public void dismissInternal() {
        int i9;
        int i10;
        switch (this.L2) {
            case 1:
                qn qnVar = (qn) this.M2;
                u2 u2Var = qnVar.F1;
                if (u2Var != null && u2Var.isShowing()) {
                    Activity parentActivity = qnVar.getParentActivity();
                    i9 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i9);
                }
                super.dismissInternal();
                qnVar.T9(false, true);
                return;
            case 2:
                pf.l lVar = (pf.l) this.M2;
                u2 u2Var2 = lVar.H;
                if (u2Var2 != null && u2Var2.isShowing()) {
                    Activity parentActivity2 = lVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.o2) lVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i10);
                }
                super.dismissInternal();
                return;
            default:
                super.dismissInternal();
                return;
        }
    }

    @Override
    public final void onDismissAnimationStart() {
        int i9;
        int i10;
        switch (this.L2) {
            case 0:
                i4 i4Var = (i4) this.M2;
                u2 u2Var = i4Var.E2;
                if (u2Var != null) {
                    u2Var.setFocusable(false);
                }
                p2 p2Var = i4Var.X1;
                if (p2Var != null && p2Var.getEditField() != null) {
                    i4Var.X1.getEditField().requestFocus();
                    return;
                }
                return;
            case 1:
                qn qnVar = (qn) this.M2;
                u2 u2Var2 = qnVar.F1;
                if (u2Var2 != null) {
                    u2Var2.setFocusable(false);
                }
                ak akVar = qnVar.U;
                if (akVar != null && akVar.getEditField() != null) {
                    qnVar.U.getEditField().requestFocus();
                }
                u2 u2Var3 = qnVar.F1;
                if (u2Var3 != null && u2Var3.isShowing()) {
                    Activity parentActivity = qnVar.getParentActivity();
                    i9 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i9);
                }
                qnVar.T9(false, false);
                return;
            default:
                pf.l lVar = (pf.l) this.M2;
                u2 u2Var4 = lVar.H;
                if (u2Var4 != null) {
                    u2Var4.setFocusable(false);
                }
                u2 u2Var5 = lVar.H;
                if (u2Var5 != null && u2Var5.isShowing()) {
                    Activity parentActivity2 = lVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.o2) lVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i10);
                    return;
                }
                return;
        }
    }

    public u2(i4 i4Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null, false, false, true, b6Var);
        this.L2 = 0;
        this.M2 = i4Var;
    }
}
