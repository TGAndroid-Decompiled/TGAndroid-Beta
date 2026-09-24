package ai;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.wi;
import org.telegram.ui.jk;
import org.telegram.ui.wn;
public final class g4 extends wi {
    public final int P2;
    public final NotificationCenter.NotificationCenterDelegate Q2;

    public g4(org.telegram.ui.ActionBar.m2 m2Var, Activity activity, org.telegram.ui.ActionBar.m2 m2Var2, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(activity, m2Var2, false, false, true, d6Var);
        this.P2 = i10;
        this.Q2 = (NotificationCenter.NotificationCenterDelegate) m2Var;
    }

    @Override
    public void dismissInternal() {
        int i10;
        switch (this.P2) {
            case 1:
                hg.n nVar = (hg.n) this.Q2;
                g4 g4Var = nVar.L;
                if (g4Var != null && g4Var.isShowing()) {
                    AndroidUtilities.requestAdjustResize(nVar.getParentActivity(), hg.n.c0(nVar));
                }
                super.dismissInternal();
                return;
            case 2:
                wn wnVar = (wn) this.Q2;
                g4 g4Var2 = wnVar.J1;
                if (g4Var2 != null && g4Var2.isShowing()) {
                    Activity parentActivity = wnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                wnVar.T9(false, true);
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
                e6 e6Var = (e6) this.Q2;
                g4 g4Var = e6Var.I2;
                if (g4Var != null) {
                    g4Var.setFocusable(false);
                }
                a4 a4Var = e6Var.f773b2;
                if (a4Var != null && a4Var.getEditField() != null) {
                    e6Var.f773b2.getEditField().requestFocus();
                    return;
                }
                return;
            case 1:
                hg.n nVar = (hg.n) this.Q2;
                g4 g4Var2 = nVar.L;
                if (g4Var2 != null) {
                    g4Var2.setFocusable(false);
                }
                g4 g4Var3 = nVar.L;
                if (g4Var3 != null && g4Var3.isShowing()) {
                    AndroidUtilities.requestAdjustResize(nVar.getParentActivity(), hg.n.d0(nVar));
                    return;
                }
                return;
            default:
                wn wnVar = (wn) this.Q2;
                g4 g4Var4 = wnVar.J1;
                if (g4Var4 != null) {
                    g4Var4.setFocusable(false);
                }
                jk jkVar = wnVar.Y;
                if (jkVar != null && jkVar.getEditField() != null) {
                    wnVar.Y.getEditField().requestFocus();
                }
                g4 g4Var5 = wnVar.J1;
                if (g4Var5 != null && g4Var5.isShowing()) {
                    Activity parentActivity = wnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                wnVar.T9(false, false);
                return;
        }
    }

    public g4(e6 e6Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, false, false, true, d6Var);
        this.P2 = 0;
        this.Q2 = e6Var;
    }
}
