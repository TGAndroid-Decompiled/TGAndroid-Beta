package di;

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ti;
import org.telegram.ui.jk;
import org.telegram.ui.om;
import org.telegram.ui.wn;
public final class a3 extends ti {
    public final int O2;
    public final NotificationCenter.NotificationCenterDelegate P2;

    public a3(org.telegram.ui.ActionBar.r2 r2Var, Activity activity, org.telegram.ui.ActionBar.r2 r2Var2, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(activity, r2Var2, false, false, true, u6Var);
        this.O2 = i10;
        this.P2 = (NotificationCenter.NotificationCenterDelegate) r2Var;
    }

    @Override
    public void dismissInternal() {
        int i10;
        int i11 = this.O2;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.P2;
        switch (i11) {
            case 1:
                jg.n nVar = (jg.n) notificationCenterDelegate;
                a3 a3Var = nVar.L;
                if (a3Var != null && a3Var.isShowing()) {
                    AndroidUtilities.requestAdjustResize(nVar.getParentActivity(), jg.n.d0(nVar));
                }
                super.dismissInternal();
                return;
            case 2:
                wn wnVar = (wn) notificationCenterDelegate;
                a3 a3Var2 = wnVar.V1;
                if (a3Var2 != null && (a3Var2.isShowing() || this.f33047x0)) {
                    Activity parentActivity = wnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                wnVar.ga(false, true);
                om omVar = wnVar.f45163j1;
                if (omVar != null) {
                    WeakHashMap weakHashMap = r0.i0.f47143a;
                    r0.y.c(omVar);
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
        jk jkVar;
        int i11 = this.O2;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.P2;
        switch (i11) {
            case 0:
                q4 q4Var = (q4) notificationCenterDelegate;
                a3 a3Var = q4Var.f9044x2;
                if (a3Var != null) {
                    a3Var.setFocusable(false);
                }
                u2 u2Var = q4Var.Q1;
                if (u2Var != null && u2Var.getEditField() != null) {
                    q4Var.Q1.getEditField().requestFocus();
                    return;
                }
                return;
            case 1:
                jg.n nVar = (jg.n) notificationCenterDelegate;
                a3 a3Var2 = nVar.L;
                if (a3Var2 != null) {
                    a3Var2.setFocusable(false);
                }
                a3 a3Var3 = nVar.L;
                if (a3Var3 != null && a3Var3.isShowing()) {
                    AndroidUtilities.requestAdjustResize(nVar.getParentActivity(), jg.n.e0(nVar));
                    return;
                }
                return;
            default:
                wn wnVar = (wn) notificationCenterDelegate;
                boolean z10 = this.f33047x0;
                boolean M = this.B0.M();
                if (!M) {
                    wnVar.P3 = false;
                    jk jkVar2 = wnVar.Y;
                    if (jkVar2 != null) {
                        if (!z10) {
                            jkVar2.L();
                        }
                        if (wnVar.Y.getEditField() != null) {
                            wnVar.Y.getEditField().clearFocus();
                        }
                    }
                }
                if (!z10) {
                    a3 a3Var4 = wnVar.V1;
                    if (a3Var4 != null) {
                        a3Var4.setFocusable(false);
                    }
                    if (M && (jkVar = wnVar.Y) != null && jkVar.getEditField() != null) {
                        wnVar.Y.getEditField().requestFocus();
                    }
                    a3 a3Var5 = wnVar.V1;
                    if (a3Var5 != null && a3Var5.isShowing()) {
                        Activity parentActivity = wnVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    }
                    wnVar.ga(false, false);
                    om omVar = wnVar.f45163j1;
                    if (omVar != null) {
                        WeakHashMap weakHashMap = r0.i0.f47143a;
                        r0.y.c(omVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public a3(q4 q4Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null, false, false, true, u6Var);
        this.O2 = 0;
        this.P2 = q4Var;
    }
}
