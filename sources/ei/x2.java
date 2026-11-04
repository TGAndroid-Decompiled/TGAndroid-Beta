package ei;

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.ui.Components.bi;
import org.telegram.ui.kl;
import org.telegram.ui.mj;
import org.telegram.ui.wm;
public final class x2 extends bi {
    public final int G4;
    public final Object H4;

    public x2(org.telegram.ui.ActionBar.d2 d2Var, Activity activity, org.telegram.ui.ActionBar.d2 d2Var2, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(activity, d2Var2, false, false, true, e6Var);
        this.G4 = i3;
        this.H4 = d2Var;
    }

    @Override
    public void K() {
        int i3;
        int i10 = this.G4;
        Object obj = this.H4;
        switch (i10) {
            case 1:
                lg.m mVar = (lg.m) obj;
                x2 x2Var = mVar.M;
                if (x2Var != null && x2Var.isShowing()) {
                    org.telegram.messenger.g0.a3(mVar.getParentActivity(), lg.m.h0(mVar));
                }
                super.K();
                return;
            case 2:
                wm wmVar = (wm) obj;
                x2 x2Var2 = wmVar.Y1;
                if (x2Var2 != null && (x2Var2.isShowing() || this.f32259p2)) {
                    Activity parentActivity = wmVar.getParentActivity();
                    i3 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
                    org.telegram.messenger.g0.a3(parentActivity, i3);
                }
                super.K();
                wmVar.ta(false, true);
                kl klVar = wmVar.m1;
                if (klVar != null) {
                    WeakHashMap weakHashMap = r0.i0.f54015a;
                    r0.y.c(klVar);
                    return;
                }
                return;
            case 3:
                super.K();
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                super.K();
                return;
        }
    }

    @Override
    public void n0() {
        int i3;
        mj mjVar;
        int i10 = this.G4;
        Object obj = this.H4;
        switch (i10) {
            case 0:
                j4 j4Var = (j4) obj;
                x2 x2Var = j4Var.f10504s2;
                if (x2Var != null) {
                    x2Var.A0(false);
                }
                s2 s2Var = j4Var.L1;
                if (s2Var != null && s2Var.getEditField() != null) {
                    j4Var.L1.getEditField().requestFocus();
                    return;
                }
                return;
            case 1:
                lg.m mVar = (lg.m) obj;
                x2 x2Var2 = mVar.M;
                if (x2Var2 != null) {
                    x2Var2.A0(false);
                }
                x2 x2Var3 = mVar.M;
                if (x2Var3 != null && x2Var3.isShowing()) {
                    org.telegram.messenger.g0.a3(mVar.getParentActivity(), lg.m.i0(mVar));
                    return;
                }
                return;
            case 2:
                wm wmVar = (wm) obj;
                boolean z10 = this.f32259p2;
                boolean N = this.f32275t2.N();
                if (!N) {
                    wmVar.S3 = false;
                    mj mjVar2 = wmVar.f51237a0;
                    if (mjVar2 != null) {
                        if (!z10) {
                            mjVar2.L();
                        }
                        if (wmVar.f51237a0.getEditField() != null) {
                            wmVar.f51237a0.getEditField().clearFocus();
                        }
                    }
                }
                if (!z10) {
                    x2 x2Var4 = wmVar.Y1;
                    if (x2Var4 != null) {
                        x2Var4.A0(false);
                    }
                    if (N && (mjVar = wmVar.f51237a0) != null && mjVar.getEditField() != null) {
                        wmVar.f51237a0.getEditField().requestFocus();
                    }
                    x2 x2Var5 = wmVar.Y1;
                    if (x2Var5 != null && x2Var5.isShowing()) {
                        Activity parentActivity = wmVar.getParentActivity();
                        i3 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
                        org.telegram.messenger.g0.a3(parentActivity, i3);
                    }
                    wmVar.ta(false, false);
                    kl klVar = wmVar.m1;
                    if (klVar != null) {
                        WeakHashMap weakHashMap = r0.i0.f54015a;
                        r0.y.c(klVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public x2(Context context, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable) {
        super(context, d2Var, false, false, true, e6Var);
        this.G4 = 3;
        this.H4 = runnable;
    }

    public x2(j4 j4Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, false, false, true, e6Var);
        this.G4 = 0;
        this.H4 = j4Var;
    }
}
