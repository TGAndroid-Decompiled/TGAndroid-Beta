package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.e;
public final class f41 extends n12 {
    public final byte H4;
    public final Object I4;

    public f41(Context context, e eVar, vnb vnbVar, go1 go1Var) {
        super(context, eVar, false, false, true, vnbVar);
        this.H4 = (byte) 2;
        this.I4 = go1Var;
    }

    @Override
    public final void H() {
        byte b = this.H4;
        Object obj = this.I4;
        switch (b) {
            case 0:
                g41 g41Var = (g41) obj;
                f41 f41Var = g41Var.M;
                if (f41Var != null && f41Var.isShowing()) {
                    hl.V2(g41Var.getParentActivity(), g41.c0(g41Var));
                }
                super.H();
                return;
            case 1:
                zu1 zu1Var = (zu1) obj;
                f41 f41Var2 = zu1Var.Y1;
                if (f41Var2 != null && (f41Var2.isShowing() || this.r2)) {
                    hl.V2(zu1Var.getParentActivity(), zu1.T3(zu1Var));
                }
                super.H();
                zu1Var.ja(false, true);
                nt1 nt1Var = zu1Var.m1;
                if (nt1Var != null) {
                    WeakHashMap weakHashMap = ihc.a;
                    ygc.c(nt1Var);
                    return;
                }
                return;
            case 2:
                super.H();
                go1 go1Var = (go1) obj;
                if (go1Var != null) {
                    go1Var.run();
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
        nr1 nr1Var;
        byte b = this.H4;
        Object obj = this.I4;
        switch (b) {
            case 0:
                g41 g41Var = (g41) obj;
                f41 f41Var = g41Var.M;
                if (f41Var != null) {
                    f41Var.w0(false);
                }
                f41 f41Var2 = g41Var.M;
                if (f41Var2 != null && f41Var2.isShowing()) {
                    hl.V2(g41Var.getParentActivity(), g41.d0(g41Var));
                    return;
                }
                return;
            case 1:
                zu1 zu1Var = (zu1) obj;
                boolean z = this.r2;
                boolean N = this.v2.N();
                if (!N) {
                    zu1Var.S3 = false;
                    nr1 nr1Var2 = zu1Var.a0;
                    if (nr1Var2 != null) {
                        if (!z) {
                            nr1Var2.U();
                        }
                        if (zu1Var.a0.getEditField() != null) {
                            zu1Var.a0.getEditField().clearFocus();
                        }
                    }
                }
                if (!z) {
                    f41 f41Var3 = zu1Var.Y1;
                    if (f41Var3 != null) {
                        f41Var3.w0(false);
                    }
                    if (N && (nr1Var = zu1Var.a0) != null && nr1Var.getEditField() != null) {
                        zu1Var.a0.getEditField().requestFocus();
                    }
                    f41 f41Var4 = zu1Var.Y1;
                    if (f41Var4 != null && f41Var4.isShowing()) {
                        hl.V2(zu1Var.getParentActivity(), zu1.U3(zu1Var));
                    }
                    zu1Var.ja(false, false);
                    nt1 nt1Var = zu1Var.m1;
                    if (nt1Var != null) {
                        WeakHashMap weakHashMap = ihc.a;
                        ygc.c(nt1Var);
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                o68 o68Var = (o68) obj;
                f41 f41Var5 = o68Var.s2;
                if (f41Var5 != null) {
                    f41Var5.w0(false);
                }
                g58 g58Var = o68Var.L1;
                if (g58Var != null && g58Var.getEditField() != null) {
                    o68Var.L1.getEditField().requestFocus();
                    return;
                }
                return;
        }
    }

    public f41(e eVar, Activity activity, e eVar2, vnb vnbVar, byte b) {
        super(activity, eVar2, false, false, true, vnbVar);
        this.H4 = b;
        this.I4 = eVar;
    }

    public f41(o68 o68Var, Context context, x53 x53Var) {
        super(context, null, false, false, true, x53Var);
        this.H4 = (byte) 3;
        this.I4 = o68Var;
    }
}
