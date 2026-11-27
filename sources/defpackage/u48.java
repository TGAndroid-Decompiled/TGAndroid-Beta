package defpackage;

import android.app.Activity;
import org.telegram.ui.PremiumPreviewFragment;
public final class u48 implements Runnable {
    public final byte a;
    public final o68 b;

    public u48(o68 o68Var, byte b) {
        this.a = b;
        this.b = o68Var;
    }

    @Override
    public final void run() {
        float f;
        byte b = this.a;
        boolean z = false;
        o68 o68Var = this.b;
        switch (b) {
            case 0:
                o68Var.h0(true);
                return;
            case 1:
                o68Var.X0(false);
                uc7.e1().edit().putInt("taptostorysoundhint", uc7.e1().getInt("taptostorysoundhint", 0) + 1).apply();
                return;
            case 2:
                o68Var.T1.setVisibility(8);
                return;
            case 3:
                if (!o68Var.t0.H0) {
                    o68Var.j3 = null;
                    if (o68Var.r0 == null) {
                        kg5 kg5Var = new kg5(o68Var.getContext(), 3);
                        kg5Var.n(1.0f, -22.0f);
                        o68Var.r0 = kg5Var;
                        kg5Var.i(vm2.o(vm2.f(0.13f, -16777216, -1), 240));
                        kg5 kg5Var2 = o68Var.r0;
                        kg5Var2.V = false;
                        kg5Var2.t(ob6.M0(2131746126, null));
                        o68Var.r0.setPadding(hl.L(8.0f), 0, hl.L(8.0f), hl.L(1.0f));
                        u58 u58Var = o68Var.M0;
                        kg5 kg5Var3 = o68Var.r0;
                        if (o68Var.h2) {
                            f = 0.0f;
                        } else {
                            f = 56.0f;
                        }
                        u58Var.addView(kg5Var3, tre.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, f));
                    }
                    o68Var.r0.v();
                    xea.G(true);
                    return;
                }
                return;
            case 4:
                o68Var.K0();
                return;
            case 5:
                ((ccb) o68Var.A1).b(true);
                return;
            case 6:
                o68Var.H0();
                return;
            case 7:
                o68Var.u3 = 0L;
                h58 h58Var = o68Var.L1;
                if (h58Var != null) {
                    h58Var.P(true);
                    o68Var.L1.K2();
                    o68Var.h0(true);
                    return;
                }
                return;
            case 8:
                Activity W = hl.W(o68Var.getContext());
                if (W != null) {
                    a58 a58Var = new a58(o68Var, W, (byte) 0);
                    lcb lcbVar = ((ccb) o68Var.A1).d;
                    kcb kcbVar = lcbVar.A0;
                    if (kcbVar != null) {
                        z = kcbVar.release(a58Var);
                        lcbVar.A0 = null;
                    }
                    if (!z) {
                        hl.d3(a58Var, 80L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                lcb lcbVar2 = ((ccb) o68Var.A1).d;
                lcbVar2.i1 = false;
                lcbVar2.U();
                return;
            case 10:
                o68Var.E0(null);
                return;
            case 11:
                lcb lcbVar3 = o68Var.t0;
                if (lcbVar3 != null) {
                    lcbVar3.L(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            default:
                o68Var.D3 = true;
                o68Var.setActive(false);
                return;
        }
    }
}
