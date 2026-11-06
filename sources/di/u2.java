package di;

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.ui.Components.di;
import org.telegram.ui.an;
import org.telegram.ui.ol;
import org.telegram.ui.qj;
public final class u2 extends di {
    public final int F4;
    public final Object G4;

    public u2(org.telegram.ui.ActionBar.f2 f2Var, Activity activity, org.telegram.ui.ActionBar.f2 f2Var2, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(activity, f2Var2, false, false, true, f6Var);
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
                an anVar = (an) obj;
                u2 u2Var2 = anVar.X1;
                if (u2Var2 != null && (u2Var2.isShowing() || this.f32927o2)) {
                    Activity parentActivity = anVar.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
                    org.telegram.messenger.g0.a3(parentActivity, i7);
                }
                super.K();
                anVar.ta(false, true);
                ol olVar = anVar.l1;
                if (olVar != null) {
                    WeakHashMap weakHashMap = r0.i0.f54073a;
                    r0.y.c(olVar);
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
        qj qjVar;
        int i10 = this.F4;
        Object obj = this.G4;
        switch (i10) {
            case 0:
                i4 i4Var = (i4) obj;
                u2 u2Var = i4Var.f9190r2;
                if (u2Var != null) {
                    u2Var.A0(false);
                }
                o2 o2Var = i4Var.K1;
                if (o2Var != null && o2Var.getEditField() != null) {
                    i4Var.K1.getEditField().requestFocus();
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
                an anVar = (an) obj;
                boolean z9 = this.f32927o2;
                boolean N = this.f32942s2.N();
                if (!N) {
                    anVar.R3 = false;
                    qj qjVar2 = anVar.Z;
                    if (qjVar2 != null) {
                        if (!z9) {
                            qjVar2.L();
                        }
                        if (anVar.Z.getEditField() != null) {
                            anVar.Z.getEditField().clearFocus();
                        }
                    }
                }
                if (!z9) {
                    u2 u2Var4 = anVar.X1;
                    if (u2Var4 != null) {
                        u2Var4.A0(false);
                    }
                    if (N && (qjVar = anVar.Z) != null && qjVar.getEditField() != null) {
                        anVar.Z.getEditField().requestFocus();
                    }
                    u2 u2Var5 = anVar.X1;
                    if (u2Var5 != null && u2Var5.isShowing()) {
                        Activity parentActivity = anVar.getParentActivity();
                        i7 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
                        org.telegram.messenger.g0.a3(parentActivity, i7);
                    }
                    anVar.ta(false, false);
                    ol olVar = anVar.l1;
                    if (olVar != null) {
                        WeakHashMap weakHashMap = r0.i0.f54073a;
                        r0.y.c(olVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public u2(Context context, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.f6 f6Var, Runnable runnable) {
        super(context, f2Var, false, false, true, f6Var);
        this.F4 = 3;
        this.G4 = runnable;
    }

    public u2(i4 i4Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, true, f6Var);
        this.F4 = 0;
        this.G4 = i4Var;
    }
}
