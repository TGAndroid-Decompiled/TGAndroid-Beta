package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.d;
public final class e51 extends i22 {
    public final byte H4;
    public final Object I4;

    public e51(Context context, d dVar, ylb ylbVar, fo1 fo1Var) {
        super(context, dVar, false, false, true, ylbVar);
        this.H4 = (byte) 2;
        this.I4 = fo1Var;
    }

    @Override
    public final void H() {
        int i;
        byte b = this.H4;
        Object obj = this.I4;
        switch (b) {
            case 0:
                f51 f51Var = (f51) obj;
                e51 e51Var = f51Var.M;
                if (e51Var != null && e51Var.isShowing()) {
                    gm.V2(f51Var.getParentActivity(), f51.e0(f51Var));
                }
                super.H();
                return;
            case 1:
                yv1 yv1Var = (yv1) obj;
                e51 e51Var2 = yv1Var.Y1;
                if (e51Var2 != null && (e51Var2.isShowing() || this.r2)) {
                    Activity parentActivity = yv1Var.getParentActivity();
                    i = ((d) yv1Var).classGuid;
                    gm.V2(parentActivity, i);
                }
                super.H();
                yv1Var.ia(false, true);
                mu1 mu1Var = yv1Var.m1;
                if (mu1Var != null) {
                    WeakHashMap weakHashMap = kfc.a;
                    afc.c(mu1Var);
                    return;
                }
                return;
            case 2:
                super.H();
                fo1 fo1Var = (fo1) obj;
                if (fo1Var != null) {
                    fo1Var.run();
                    return;
                }
                return;
            default:
                super.H();
                return;
        }
    }

    @Override
    public final void k0() {
        int i;
        ms1 ms1Var;
        byte b = this.H4;
        Object obj = this.I4;
        switch (b) {
            case 0:
                f51 f51Var = (f51) obj;
                e51 e51Var = f51Var.M;
                if (e51Var != null) {
                    e51Var.v0(false);
                }
                e51 e51Var2 = f51Var.M;
                if (e51Var2 != null && e51Var2.isShowing()) {
                    gm.V2(f51Var.getParentActivity(), f51.f0(f51Var));
                    return;
                }
                return;
            case 1:
                yv1 yv1Var = (yv1) obj;
                boolean z = this.r2;
                boolean N = this.v2.N();
                if (!N) {
                    yv1Var.S3 = false;
                    ms1 ms1Var2 = yv1Var.a0;
                    if (ms1Var2 != null) {
                        if (!z) {
                            ms1Var2.R();
                        }
                        if (yv1Var.a0.getEditField() != null) {
                            yv1Var.a0.getEditField().clearFocus();
                        }
                    }
                }
                if (!z) {
                    e51 e51Var3 = yv1Var.Y1;
                    if (e51Var3 != null) {
                        e51Var3.v0(false);
                    }
                    if (N && (ms1Var = yv1Var.a0) != null && ms1Var.getEditField() != null) {
                        yv1Var.a0.getEditField().requestFocus();
                    }
                    e51 e51Var4 = yv1Var.Y1;
                    if (e51Var4 != null && e51Var4.isShowing()) {
                        Activity parentActivity = yv1Var.getParentActivity();
                        i = ((d) yv1Var).classGuid;
                        gm.V2(parentActivity, i);
                    }
                    yv1Var.ia(false, false);
                    mu1 mu1Var = yv1Var.m1;
                    if (mu1Var != null) {
                        WeakHashMap weakHashMap = kfc.a;
                        afc.c(mu1Var);
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                a58 a58Var = (a58) obj;
                e51 e51Var5 = a58Var.y2;
                if (e51Var5 != null) {
                    e51Var5.v0(false);
                }
                t38 t38Var = a58Var.R1;
                if (t38Var != null && t38Var.getEditField() != null) {
                    a58Var.R1.getEditField().requestFocus();
                    return;
                }
                return;
        }
    }

    public e51(d dVar, Activity activity, d dVar2, ylb ylbVar, byte b) {
        super(activity, dVar2, false, false, true, ylbVar);
        this.H4 = b;
        this.I4 = dVar;
    }

    public e51(a58 a58Var, Context context, r63 r63Var) {
        super(context, null, false, false, true, r63Var);
        this.H4 = (byte) 3;
        this.I4 = a58Var;
    }
}
