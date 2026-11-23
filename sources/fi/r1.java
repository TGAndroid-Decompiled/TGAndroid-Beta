package fi;

import android.app.Activity;
import c8.na;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.ui.PremiumPreviewFragment;
public final class r1 implements Runnable {
    public final int f12485a;
    public final z3 f12486b;

    public r1(z3 z3Var, int i7) {
        this.f12485a = i7;
        this.f12486b = z3Var;
    }

    @Override
    public final void run() {
        float f10;
        int i7 = this.f12485a;
        boolean z10 = false;
        z3 z3Var = this.f12486b;
        switch (i7) {
            case 0:
                z3Var.T1.setVisibility(8);
                return;
            case 1:
                if (!z3Var.f12878t0.H0) {
                    z3Var.j3 = null;
                    if (z3Var.f12870r0 == null) {
                        hi.u3 u3Var = new hi.u3(z3Var.getContext(), 3);
                        u3Var.o(1.0f, -22.0f);
                        z3Var.f12870r0 = u3Var;
                        u3Var.j(i0.a.o(i0.a.f(0.13f, -16777216, -1), 240));
                        hi.u3 u3Var2 = z3Var.f12870r0;
                        u3Var2.V = false;
                        u3Var2.v(gd.N0(2131746203, null));
                        z3Var.f12870r0.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(1.0f));
                        c3 c3Var = z3Var.M0;
                        hi.u3 u3Var3 = z3Var.f12870r0;
                        if (z3Var.f12836h2) {
                            f10 = 0.0f;
                        } else {
                            f10 = 56.0f;
                        }
                        c3Var.addView(u3Var3, na.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, f10));
                    }
                    z3Var.f12870r0.x();
                    bz.H(true);
                    return;
                }
                return;
            case 2:
                z3Var.O0();
                return;
            case 3:
                ((w8) z3Var.A1).b(true);
                return;
            case 4:
                z3Var.p0(true);
                return;
            case 5:
                f9 f9Var = z3Var.f12878t0;
                if (f9Var != null) {
                    f9Var.N(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 6:
                z3Var.M0();
                return;
            case 7:
                z3Var.f12889v3 = 0L;
                i2 i2Var = z3Var.L1;
                if (i2Var != null) {
                    i2Var.P(true);
                    z3Var.L1.B2();
                    z3Var.p0(true);
                    return;
                }
                return;
            case 8:
                Activity W = org.telegram.messenger.g0.W(z3Var.getContext());
                if (W != null) {
                    di.f2 f2Var = new di.f2(28, z3Var, W);
                    f9 f9Var2 = ((w8) z3Var.A1).d;
                    e9 e9Var = f9Var2.A0;
                    if (e9Var != null) {
                        z10 = e9Var.release(f2Var);
                        f9Var2.A0 = null;
                    }
                    if (!z10) {
                        org.telegram.messenger.g0.h3(f2Var, 80L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                f9 f9Var3 = ((w8) z3Var.A1).d;
                f9Var3.f11980i1 = false;
                f9Var3.V();
                return;
            case 10:
                z3Var.J0(null);
                return;
            case 11:
                z3Var.a1(false);
                mp.g1().edit().putInt("taptostorysoundhint", mp.g1().getInt("taptostorysoundhint", 0) + 1).apply();
                return;
            default:
                z3Var.E3 = true;
                z3Var.setActive(false);
                return;
        }
    }
}
