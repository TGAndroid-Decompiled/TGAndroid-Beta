package ai;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.wi;
import org.telegram.ui.lk;
import org.telegram.ui.xn;
public final class g4 extends wi {
    public final int I2;
    public final NotificationCenter.NotificationCenterDelegate J2;

    public g4(org.telegram.ui.ActionBar.o2 o2Var, Activity activity, org.telegram.ui.ActionBar.o2 o2Var2, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(activity, o2Var2, false, false, true, e6Var);
        this.I2 = i10;
        this.J2 = (NotificationCenter.NotificationCenterDelegate) o2Var;
    }

    @Override
    public void dismissInternal() {
        int i10;
        switch (this.I2) {
            case 1:
                hg.m mVar = (hg.m) this.J2;
                g4 g4Var = mVar.M;
                if (g4Var != null && g4Var.isShowing()) {
                    AndroidUtilities.requestAdjustResize(mVar.getParentActivity(), hg.m.c0(mVar));
                }
                super.dismissInternal();
                return;
            case 2:
                xn xnVar = (xn) this.J2;
                g4 g4Var2 = xnVar.J1;
                if (g4Var2 != null && g4Var2.isShowing()) {
                    Activity parentActivity = xnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.o2) xnVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                xnVar.T9(false, true);
                return;
            default:
                super.dismissInternal();
                return;
        }
    }

    @Override
    public final void onDismissAnimationStart() {
        int i10;
        switch (this.I2) {
            case 0:
                e6 e6Var = (e6) this.J2;
                g4 g4Var = e6Var.I2;
                if (g4Var != null) {
                    g4Var.setFocusable(false);
                }
                a4 a4Var = e6Var.f776b2;
                if (a4Var != null && a4Var.getEditField() != null) {
                    e6Var.f776b2.getEditField().requestFocus();
                    return;
                }
                return;
            case 1:
                hg.m mVar = (hg.m) this.J2;
                g4 g4Var2 = mVar.M;
                if (g4Var2 != null) {
                    g4Var2.setFocusable(false);
                }
                g4 g4Var3 = mVar.M;
                if (g4Var3 != null && g4Var3.isShowing()) {
                    AndroidUtilities.requestAdjustResize(mVar.getParentActivity(), hg.m.d0(mVar));
                    return;
                }
                return;
            default:
                xn xnVar = (xn) this.J2;
                g4 g4Var4 = xnVar.J1;
                if (g4Var4 != null) {
                    g4Var4.setFocusable(false);
                }
                lk lkVar = xnVar.Y;
                if (lkVar != null && lkVar.getEditField() != null) {
                    xnVar.Y.getEditField().requestFocus();
                }
                g4 g4Var5 = xnVar.J1;
                if (g4Var5 != null && g4Var5.isShowing()) {
                    Activity parentActivity = xnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.o2) xnVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                xnVar.T9(false, false);
                return;
        }
    }

    public g4(e6 e6Var, Context context, org.telegram.ui.ActionBar.e6 e6Var2) {
        super(context, null, false, false, true, e6Var2);
        this.I2 = 0;
        this.J2 = e6Var;
    }
}
