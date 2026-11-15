package fi;

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.ui.Components.ki;
import org.telegram.ui.an;
import org.telegram.ui.ol;
import org.telegram.ui.qj;
public final class p2 extends ki {
    public final int J4;
    public final Object K4;

    public p2(org.telegram.ui.ActionBar.e2 e2Var, Activity activity, org.telegram.ui.ActionBar.e2 e2Var2, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(activity, e2Var2, false, false, true, e6Var);
        this.J4 = i7;
        this.K4 = e2Var;
    }

    @Override
    public void L() {
        int i7;
        int i10 = this.J4;
        Object obj = this.K4;
        switch (i10) {
            case 1:
                kg.n nVar = (kg.n) obj;
                p2 p2Var = nVar.M;
                if (p2Var != null && p2Var.isShowing()) {
                    org.telegram.messenger.g0.a3(nVar.getParentActivity(), kg.n.h0(nVar));
                }
                super.L();
                return;
            case 2:
                an anVar = (an) obj;
                p2 p2Var2 = anVar.Y1;
                if (p2Var2 != null && (p2Var2.isShowing() || this.f36493s2)) {
                    Activity parentActivity = anVar.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
                    org.telegram.messenger.g0.a3(parentActivity, i7);
                }
                super.L();
                anVar.wa(false, true);
                ol olVar = anVar.f45278m1;
                if (olVar != null) {
                    WeakHashMap weakHashMap = r0.i0.f55671a;
                    r0.y.c(olVar);
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
        qj qjVar;
        int i10 = this.J4;
        Object obj = this.K4;
        switch (i10) {
            case 0:
                b4 b4Var = (b4) obj;
                p2 p2Var = b4Var.f11520s2;
                if (p2Var != null) {
                    p2Var.A0(false);
                }
                k2 k2Var = b4Var.L1;
                if (k2Var != null && k2Var.getEditField() != null) {
                    b4Var.L1.getEditField().requestFocus();
                    return;
                }
                return;
            case 1:
                kg.n nVar = (kg.n) obj;
                p2 p2Var2 = nVar.M;
                if (p2Var2 != null) {
                    p2Var2.A0(false);
                }
                p2 p2Var3 = nVar.M;
                if (p2Var3 != null && p2Var3.isShowing()) {
                    org.telegram.messenger.g0.a3(nVar.getParentActivity(), kg.n.i0(nVar));
                    return;
                }
                return;
            case 2:
                an anVar = (an) obj;
                boolean z10 = this.f36493s2;
                boolean O = this.f36509w2.O();
                if (!O) {
                    anVar.S3 = false;
                    qj qjVar2 = anVar.f45118a0;
                    if (qjVar2 != null) {
                        if (!z10) {
                            qjVar2.S();
                        }
                        if (anVar.f45118a0.getEditField() != null) {
                            anVar.f45118a0.getEditField().clearFocus();
                        }
                    }
                }
                if (!z10) {
                    p2 p2Var4 = anVar.Y1;
                    if (p2Var4 != null) {
                        p2Var4.A0(false);
                    }
                    if (O && (qjVar = anVar.f45118a0) != null && qjVar.getEditField() != null) {
                        anVar.f45118a0.getEditField().requestFocus();
                    }
                    p2 p2Var5 = anVar.Y1;
                    if (p2Var5 != null && p2Var5.isShowing()) {
                        Activity parentActivity = anVar.getParentActivity();
                        i7 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
                        org.telegram.messenger.g0.a3(parentActivity, i7);
                    }
                    anVar.wa(false, false);
                    ol olVar = anVar.f45278m1;
                    if (olVar != null) {
                        WeakHashMap weakHashMap = r0.i0.f55671a;
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

    public p2(Context context, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable) {
        super(context, e2Var, false, false, true, e6Var);
        this.J4 = 3;
        this.K4 = runnable;
    }

    public p2(b4 b4Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, false, false, true, e6Var);
        this.J4 = 0;
        this.K4 = b4Var;
    }
}
