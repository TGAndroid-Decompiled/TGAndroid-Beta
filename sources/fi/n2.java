package fi;

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.ui.Components.si;
import org.telegram.ui.bn;
import org.telegram.ui.pl;
import org.telegram.ui.rj;
public final class n2 extends si {
    public final int J4;
    public final Object K4;

    public n2(org.telegram.ui.ActionBar.h2 h2Var, Activity activity, org.telegram.ui.ActionBar.h2 h2Var2, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(activity, h2Var2, false, false, true, i6Var);
        this.J4 = i7;
        this.K4 = h2Var;
    }

    @Override
    public void L() {
        int i7;
        int i10 = this.J4;
        Object obj = this.K4;
        switch (i10) {
            case 1:
                kg.n nVar = (kg.n) obj;
                n2 n2Var = nVar.M;
                if (n2Var != null && n2Var.isShowing()) {
                    org.telegram.messenger.g0.Z2(nVar.getParentActivity(), kg.n.h0(nVar));
                }
                super.L();
                return;
            case 2:
                bn bnVar = (bn) obj;
                n2 n2Var2 = bnVar.Y1;
                if (n2Var2 != null && (n2Var2.isShowing() || this.f39716s2)) {
                    Activity parentActivity = bnVar.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
                    org.telegram.messenger.g0.Z2(parentActivity, i7);
                }
                super.L();
                bnVar.wa(false, true);
                pl plVar = bnVar.f46093m1;
                if (plVar != null) {
                    WeakHashMap weakHashMap = r0.i0.f56244a;
                    r0.y.c(plVar);
                    return;
                }
                return;
            case 3:
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
        int i7;
        rj rjVar;
        int i10 = this.J4;
        Object obj = this.K4;
        switch (i10) {
            case 0:
                z3 z3Var = (z3) obj;
                n2 n2Var = z3Var.f12873s2;
                if (n2Var != null) {
                    n2Var.A0(false);
                }
                i2 i2Var = z3Var.L1;
                if (i2Var != null && i2Var.getEditField() != null) {
                    z3Var.L1.getEditField().requestFocus();
                    return;
                }
                return;
            case 1:
                kg.n nVar = (kg.n) obj;
                n2 n2Var2 = nVar.M;
                if (n2Var2 != null) {
                    n2Var2.A0(false);
                }
                n2 n2Var3 = nVar.M;
                if (n2Var3 != null && n2Var3.isShowing()) {
                    org.telegram.messenger.g0.Z2(nVar.getParentActivity(), kg.n.i0(nVar));
                    return;
                }
                return;
            case 2:
                bn bnVar = (bn) obj;
                boolean z10 = this.f39716s2;
                boolean O = this.f39732w2.O();
                if (!O) {
                    bnVar.S3 = false;
                    rj rjVar2 = bnVar.f45932a0;
                    if (rjVar2 != null) {
                        if (!z10) {
                            rjVar2.U();
                        }
                        if (bnVar.f45932a0.getEditField() != null) {
                            bnVar.f45932a0.getEditField().clearFocus();
                        }
                    }
                }
                if (!z10) {
                    n2 n2Var4 = bnVar.Y1;
                    if (n2Var4 != null) {
                        n2Var4.A0(false);
                    }
                    if (O && (rjVar = bnVar.f45932a0) != null && rjVar.getEditField() != null) {
                        bnVar.f45932a0.getEditField().requestFocus();
                    }
                    n2 n2Var5 = bnVar.Y1;
                    if (n2Var5 != null && n2Var5.isShowing()) {
                        Activity parentActivity = bnVar.getParentActivity();
                        i7 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
                        org.telegram.messenger.g0.Z2(parentActivity, i7);
                    }
                    bnVar.wa(false, false);
                    pl plVar = bnVar.f46093m1;
                    if (plVar != null) {
                        WeakHashMap weakHashMap = r0.i0.f56244a;
                        r0.y.c(plVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public n2(Context context, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.i6 i6Var, Runnable runnable) {
        super(context, h2Var, false, false, true, i6Var);
        this.J4 = 3;
        this.K4 = runnable;
    }

    public n2(z3 z3Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, false, false, true, i6Var);
        this.J4 = 0;
        this.K4 = z3Var;
    }
}
