package defpackage;

import android.app.Activity;
import org.telegram.ui.PremiumPreviewFragment;
public final class h38 implements Runnable {
    public final byte a;
    public final a58 b;

    public h38(a58 a58Var, byte b) {
        this.a = b;
        this.b = a58Var;
    }

    @Override
    public final void run() {
        float f;
        byte b = this.a;
        boolean z = false;
        a58 a58Var = this.b;
        switch (b) {
            case 0:
                a58Var.Z1.setVisibility(8);
                return;
            case 1:
                if (!a58Var.z0.H0) {
                    a58Var.p3 = null;
                    if (a58Var.x0 == null) {
                        hg5 hg5Var = new hg5(a58Var.getContext(), 3);
                        hg5Var.n(1.0f, -22.0f);
                        a58Var.x0 = hg5Var;
                        hg5Var.i(on2.p(on2.f(0.13f, -16777216, -1), 240));
                        hg5 hg5Var2 = a58Var.x0;
                        hg5Var2.V = false;
                        hg5Var2.t(jb6.M0(2131746132, null));
                        a58Var.x0.setPadding(gm.L(8.0f), 0, gm.L(8.0f), gm.L(1.0f));
                        g48 g48Var = a58Var.S0;
                        hg5 hg5Var3 = a58Var.x0;
                        if (a58Var.n2) {
                            f = 0.0f;
                        } else {
                            f = 56.0f;
                        }
                        g48Var.addView(hg5Var3, qoe.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, f));
                    }
                    a58Var.x0.v();
                    gda.G(true);
                    return;
                }
                return;
            case 2:
                a58Var.K0();
                return;
            case 3:
                ((fab) a58Var.G1).b(true);
                return;
            case 4:
                a58Var.h0(true);
                return;
            case 5:
                oab oabVar = a58Var.z0;
                if (oabVar != null) {
                    oabVar.L(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 6:
                a58Var.H0();
                return;
            case 7:
                a58Var.A3 = 0L;
                t38 t38Var = a58Var.R1;
                if (t38Var != null) {
                    t38Var.M(true);
                    a58Var.R1.C2();
                    a58Var.h0(true);
                    return;
                }
                return;
            case 8:
                Activity W = gm.W(a58Var.getContext());
                if (W != null) {
                    a18 a18Var = new a18(a58Var, W, (byte) 2);
                    oab oabVar2 = ((fab) a58Var.G1).d;
                    nab nabVar = oabVar2.A0;
                    if (nabVar != null) {
                        z = nabVar.release(a18Var);
                        oabVar2.A0 = null;
                    }
                    if (!z) {
                        gm.d3(a18Var, 80L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                oab oabVar3 = ((fab) a58Var.G1).d;
                oabVar3.i1 = false;
                oabVar3.U();
                return;
            case 10:
                a58Var.E0(null);
                return;
            case 11:
                a58Var.X0(false);
                oc7.d1().edit().putInt("taptostorysoundhint", oc7.d1().getInt("taptostorysoundhint", 0) + 1).apply();
                return;
            default:
                a58Var.J3 = true;
                a58Var.setActive(false);
                return;
        }
    }
}
