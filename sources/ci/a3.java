package ci;

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ti;
import org.telegram.ui.gk;
import org.telegram.ui.km;
import org.telegram.ui.sn;
public final class a3 extends ti {
    public final int V2;
    public final NotificationCenter.NotificationCenterDelegate W2;

    public a3(org.telegram.ui.ActionBar.o2 o2Var, Activity activity, org.telegram.ui.ActionBar.o2 o2Var2, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(activity, o2Var2, false, false, true, g6Var);
        this.V2 = i10;
        this.W2 = (NotificationCenter.NotificationCenterDelegate) o2Var;
    }

    @Override
    public void dismissInternal() {
        int i10;
        int i11 = this.V2;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.W2;
        switch (i11) {
            case 1:
                ig.m mVar = (ig.m) notificationCenterDelegate;
                a3 a3Var = mVar.O;
                if (a3Var != null && a3Var.isShowing()) {
                    AndroidUtilities.requestAdjustResize(mVar.getParentActivity(), ig.m.c0(mVar));
                }
                super.dismissInternal();
                return;
            case 2:
                sn snVar = (sn) notificationCenterDelegate;
                a3 a3Var2 = snVar.V1;
                if (a3Var2 != null && (a3Var2.isShowing() || this.f30787x0)) {
                    Activity parentActivity = snVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.o2) snVar).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                }
                super.dismissInternal();
                snVar.Y9(false, true);
                km kmVar = snVar.f41561j1;
                if (kmVar != null) {
                    WeakHashMap weakHashMap = r0.i0.f45242a;
                    r0.y.c(kmVar);
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
        gk gkVar;
        int i11 = this.V2;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.W2;
        switch (i11) {
            case 0:
                p4 p4Var = (p4) notificationCenterDelegate;
                a3 a3Var = p4Var.I2;
                if (a3Var != null) {
                    a3Var.setFocusable(false);
                }
                u2 u2Var = p4Var.f5653b2;
                if (u2Var != null && u2Var.getEditField() != null) {
                    p4Var.f5653b2.getEditField().requestFocus();
                    return;
                }
                return;
            case 1:
                ig.m mVar = (ig.m) notificationCenterDelegate;
                a3 a3Var2 = mVar.O;
                if (a3Var2 != null) {
                    a3Var2.setFocusable(false);
                }
                a3 a3Var3 = mVar.O;
                if (a3Var3 != null && a3Var3.isShowing()) {
                    AndroidUtilities.requestAdjustResize(mVar.getParentActivity(), ig.m.d0(mVar));
                    return;
                }
                return;
            default:
                sn snVar = (sn) notificationCenterDelegate;
                boolean z10 = this.f30787x0;
                boolean M = this.B0.M();
                if (!M) {
                    snVar.P3 = false;
                    gk gkVar2 = snVar.Y;
                    if (gkVar2 != null) {
                        if (!z10) {
                            gkVar2.M();
                        }
                        if (snVar.Y.getEditField() != null) {
                            snVar.Y.getEditField().clearFocus();
                        }
                    }
                }
                if (!z10) {
                    a3 a3Var4 = snVar.V1;
                    if (a3Var4 != null) {
                        a3Var4.setFocusable(false);
                    }
                    if (M && (gkVar = snVar.Y) != null && gkVar.getEditField() != null) {
                        snVar.Y.getEditField().requestFocus();
                    }
                    a3 a3Var5 = snVar.V1;
                    if (a3Var5 != null && a3Var5.isShowing()) {
                        Activity parentActivity = snVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.o2) snVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    }
                    snVar.Y9(false, false);
                    km kmVar = snVar.f41561j1;
                    if (kmVar != null) {
                        WeakHashMap weakHashMap = r0.i0.f45242a;
                        r0.y.c(kmVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public a3(p4 p4Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, false, false, true, g6Var);
        this.V2 = 0;
        this.W2 = p4Var;
    }
}
