package di;

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.ui.Components.di;
import org.telegram.ui.cn;
import org.telegram.ui.ql;
import org.telegram.ui.sj;
public final class u2 extends di {
    public final int F4;
    public final Object G4;

    public u2(org.telegram.ui.ActionBar.f2 f2Var, Activity activity, org.telegram.ui.ActionBar.f2 f2Var2, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        super(activity, f2Var2, false, false, true, g6Var);
        this.F4 = i7;
        this.G4 = f2Var;
    }

    @Override
    public void K() {
        int i7;
        int i10 = this.F4;
        Object obj = this.G4;
        switch (i10) {
            case 1:
                kg.m mVar = (kg.m) obj;
                u2 u2Var = mVar.L;
                if (u2Var != null && u2Var.isShowing()) {
                    org.telegram.messenger.g0.a3(mVar.getParentActivity(), kg.m.h0(mVar));
                }
                super.K();
                return;
            case 2:
                cn cnVar = (cn) obj;
                u2 u2Var2 = cnVar.X1;
                if (u2Var2 != null && (u2Var2.isShowing() || this.f33032o2)) {
                    Activity parentActivity = cnVar.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
                    org.telegram.messenger.g0.a3(parentActivity, i7);
                }
                super.K();
                cnVar.va(false, true);
                ql qlVar = cnVar.l1;
                if (qlVar != null) {
                    WeakHashMap weakHashMap = r0.i0.f54203a;
                    r0.y.c(qlVar);
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
        int i7;
        sj sjVar;
        int i10 = this.F4;
        Object obj = this.G4;
        switch (i10) {
            case 0:
                j4 j4Var = (j4) obj;
                u2 u2Var = j4Var.f9222r2;
                if (u2Var != null) {
                    u2Var.A0(false);
                }
                o2 o2Var = j4Var.K1;
                if (o2Var != null && o2Var.getEditField() != null) {
                    j4Var.K1.getEditField().requestFocus();
                    return;
                }
                return;
            case 1:
                kg.m mVar = (kg.m) obj;
                u2 u2Var2 = mVar.L;
                if (u2Var2 != null) {
                    u2Var2.A0(false);
                }
                u2 u2Var3 = mVar.L;
                if (u2Var3 != null && u2Var3.isShowing()) {
                    org.telegram.messenger.g0.a3(mVar.getParentActivity(), kg.m.i0(mVar));
                    return;
                }
                return;
            case 2:
                cn cnVar = (cn) obj;
                boolean z9 = this.f33032o2;
                boolean N = this.f33047s2.N();
                if (!N) {
                    cnVar.R3 = false;
                    sj sjVar2 = cnVar.Z;
                    if (sjVar2 != null) {
                        if (!z9) {
                            sjVar2.L();
                        }
                        if (cnVar.Z.getEditField() != null) {
                            cnVar.Z.getEditField().clearFocus();
                        }
                    }
                }
                if (!z9) {
                    u2 u2Var4 = cnVar.X1;
                    if (u2Var4 != null) {
                        u2Var4.A0(false);
                    }
                    if (N && (sjVar = cnVar.Z) != null && sjVar.getEditField() != null) {
                        cnVar.Z.getEditField().requestFocus();
                    }
                    u2 u2Var5 = cnVar.X1;
                    if (u2Var5 != null && u2Var5.isShowing()) {
                        Activity parentActivity = cnVar.getParentActivity();
                        i7 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
                        org.telegram.messenger.g0.a3(parentActivity, i7);
                    }
                    cnVar.va(false, false);
                    ql qlVar = cnVar.l1;
                    if (qlVar != null) {
                        WeakHashMap weakHashMap = r0.i0.f54203a;
                        r0.y.c(qlVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public u2(Context context, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.g6 g6Var, Runnable runnable) {
        super(context, f2Var, false, false, true, g6Var);
        this.F4 = 3;
        this.G4 = runnable;
    }

    public u2(j4 j4Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, false, false, true, g6Var);
        this.F4 = 0;
        this.G4 = j4Var;
    }
}
