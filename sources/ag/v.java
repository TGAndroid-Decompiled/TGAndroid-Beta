package ag;

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.bi;
import org.telegram.ui.km;
import org.telegram.ui.mk;
import org.telegram.ui.un;
public final class v extends bi {
    public final int F4;
    public final Object G4;

    public v(org.telegram.ui.ActionBar.k2 k2Var, Activity activity, org.telegram.ui.ActionBar.k2 k2Var2, p6 p6Var, int i10) {
        super(activity, k2Var2, false, false, true, p6Var);
        this.F4 = i10;
        this.G4 = k2Var;
    }

    @Override
    public void L() {
        int i10;
        int i11 = this.F4;
        Object obj = this.G4;
        switch (i11) {
            case 0:
                w wVar = (w) obj;
                v vVar = wVar.L;
                if (vVar != null && vVar.isShowing()) {
                    org.telegram.messenger.i0.Z2(wVar.getParentActivity(), w.g0(wVar));
                }
                super.L();
                return;
            case 1:
                un unVar = (un) obj;
                v vVar2 = unVar.X1;
                if (vVar2 != null && (vVar2.isShowing() || this.f24705o2)) {
                    Activity parentActivity = unVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
                    org.telegram.messenger.i0.Z2(parentActivity, i10);
                }
                super.L();
                unVar.ja(false, true);
                km kmVar = unVar.l1;
                if (kmVar != null) {
                    WeakHashMap weakHashMap = r0.h0.f46123a;
                    r0.x.c(kmVar);
                    return;
                }
                return;
            case 2:
                super.L();
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                super.L();
                return;
        }
    }

    @Override
    public void n0() {
        int i10;
        mk mkVar;
        int i11 = this.F4;
        Object obj = this.G4;
        switch (i11) {
            case 0:
                w wVar = (w) obj;
                v vVar = wVar.L;
                if (vVar != null) {
                    vVar.A0(false);
                }
                v vVar2 = wVar.L;
                if (vVar2 != null && vVar2.isShowing()) {
                    org.telegram.messenger.i0.Z2(wVar.getParentActivity(), w.h0(wVar));
                    return;
                }
                return;
            case 1:
                un unVar = (un) obj;
                boolean z10 = this.f24705o2;
                boolean M = this.f24721s2.M();
                if (!M) {
                    unVar.R3 = false;
                    mk mkVar2 = unVar.Z;
                    if (mkVar2 != null) {
                        if (!z10) {
                            mkVar2.L();
                        }
                        if (unVar.Z.getEditField() != null) {
                            unVar.Z.getEditField().clearFocus();
                        }
                    }
                }
                if (!z10) {
                    v vVar3 = unVar.X1;
                    if (vVar3 != null) {
                        vVar3.A0(false);
                    }
                    if (M && (mkVar = unVar.Z) != null && mkVar.getEditField() != null) {
                        unVar.Z.getEditField().requestFocus();
                    }
                    v vVar4 = unVar.X1;
                    if (vVar4 != null && vVar4.isShowing()) {
                        Activity parentActivity = unVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
                        org.telegram.messenger.i0.Z2(parentActivity, i10);
                    }
                    unVar.ja(false, false);
                    km kmVar = unVar.l1;
                    if (kmVar != null) {
                        WeakHashMap weakHashMap = r0.h0.f46123a;
                        r0.x.c(kmVar);
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                th.z2 z2Var = (th.z2) obj;
                v vVar5 = z2Var.f49753r2;
                if (vVar5 != null) {
                    vVar5.A0(false);
                }
                th.t1 t1Var = z2Var.K1;
                if (t1Var != null && t1Var.getEditField() != null) {
                    z2Var.K1.getEditField().requestFocus();
                    return;
                }
                return;
        }
    }

    public v(Context context, org.telegram.ui.ActionBar.k2 k2Var, p6 p6Var, Runnable runnable) {
        super(context, k2Var, false, false, true, p6Var);
        this.F4 = 2;
        this.G4 = runnable;
    }

    public v(th.z2 z2Var, Context context, p6 p6Var) {
        super(context, null, false, false, true, p6Var);
        this.F4 = 3;
        this.G4 = z2Var;
    }
}
