package oh;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.mi;
import org.telegram.ui.jk;
import org.telegram.ui.xn;
public final class u2 extends mi {
    public final int M2;
    public final NotificationCenter.NotificationCenterDelegate N2;

    public u2(org.telegram.ui.ActionBar.p2 p2Var, Activity activity, org.telegram.ui.ActionBar.p2 p2Var2, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(activity, p2Var2, false, false, true, g6Var);
        this.M2 = i10;
        this.N2 = (NotificationCenter.NotificationCenterDelegate) p2Var;
    }

    @Override
    public void dismissInternal() {
        int i10;
        int i11;
        switch (this.M2) {
            case 1:
                xn xnVar = (xn) this.N2;
                u2 u2Var = xnVar.G1;
                if (u2Var != null && u2Var.isShowing()) {
                    Activity parentActivity = xnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                xnVar.T9(false, true);
                return;
            case 2:
                vf.k kVar = (vf.k) this.N2;
                u2 u2Var2 = kVar.I;
                if (u2Var2 != null && u2Var2.isShowing()) {
                    Activity parentActivity2 = kVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.p2) kVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
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
        int i10;
        int i11;
        switch (this.M2) {
            case 0:
                f4 f4Var = (f4) this.N2;
                u2 u2Var = f4Var.F2;
                if (u2Var != null) {
                    u2Var.setFocusable(false);
                }
                p2 p2Var = f4Var.Y1;
                if (p2Var != null && p2Var.getEditField() != null) {
                    f4Var.Y1.getEditField().requestFocus();
                    return;
                }
                return;
            case 1:
                xn xnVar = (xn) this.N2;
                u2 u2Var2 = xnVar.G1;
                if (u2Var2 != null) {
                    u2Var2.setFocusable(false);
                }
                jk jkVar = xnVar.V;
                if (jkVar != null && jkVar.getEditField() != null) {
                    xnVar.V.getEditField().requestFocus();
                }
                u2 u2Var3 = xnVar.G1;
                if (u2Var3 != null && u2Var3.isShowing()) {
                    Activity parentActivity = xnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                xnVar.T9(false, false);
                return;
            default:
                vf.k kVar = (vf.k) this.N2;
                u2 u2Var4 = kVar.I;
                if (u2Var4 != null) {
                    u2Var4.setFocusable(false);
                }
                u2 u2Var5 = kVar.I;
                if (u2Var5 != null && u2Var5.isShowing()) {
                    Activity parentActivity2 = kVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.p2) kVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity2, i11);
                    return;
                }
                return;
        }
    }

    public u2(f4 f4Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, false, false, true, g6Var);
        this.M2 = 0;
        this.N2 = f4Var;
    }
}
