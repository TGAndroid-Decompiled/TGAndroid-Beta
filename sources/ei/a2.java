package ei;

import android.app.Activity;
import b8.mf;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.ui.PremiumPreviewFragment;
public final class a2 implements Runnable {
    public final int f10077a;
    public final j4 f10078b;

    public a2(j4 j4Var, int i3) {
        this.f10077a = i3;
        this.f10078b = j4Var;
    }

    @Override
    public final void run() {
        float f10;
        int i3 = this.f10077a;
        boolean z10 = false;
        j4 j4Var = this.f10078b;
        switch (i3) {
            case 0:
                j4Var.T1.setVisibility(8);
                return;
            case 1:
                if (!j4Var.f10506t0.I0) {
                    j4Var.f10472j3 = null;
                    if (j4Var.f10498r0 == null) {
                        gi.l3 l3Var = new gi.l3(j4Var.getContext(), 3);
                        l3Var.o(1.0f, -22.0f);
                        j4Var.f10498r0 = l3Var;
                        l3Var.j(i0.a.o(i0.a.f(0.13f, -16777216, -1), 240));
                        gi.l3 l3Var2 = j4Var.f10498r0;
                        l3Var2.V = false;
                        l3Var2.u(bd.M0(2131746407, null));
                        j4Var.f10498r0.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(1.0f));
                        m3 m3Var = j4Var.M0;
                        gi.l3 l3Var3 = j4Var.f10498r0;
                        if (j4Var.f10464h2) {
                            f10 = 0.0f;
                        } else {
                            f10 = 56.0f;
                        }
                        m3Var.addView(l3Var3, mf.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, f10));
                    }
                    j4Var.f10498r0.w();
                    az.H(true);
                    return;
                }
                return;
            case 2:
                j4Var.O0();
                return;
            case 3:
                ((i9) j4Var.A1).b(true);
                return;
            case 4:
                j4Var.p0(true);
                return;
            case 5:
                r9 r9Var = j4Var.f10506t0;
                if (r9Var != null) {
                    r9Var.V(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 6:
                j4Var.M0();
                return;
            case 7:
                j4Var.f10517v3 = 0L;
                s2 s2Var = j4Var.L1;
                if (s2Var != null) {
                    s2Var.E(true);
                    j4Var.L1.S1();
                    j4Var.p0(true);
                    return;
                }
                return;
            case 8:
                Activity W = org.telegram.messenger.g0.W(j4Var.getContext());
                if (W != null) {
                    b0 b0Var = new b0(6, j4Var, W);
                    r9 r9Var2 = ((i9) j4Var.A1).d;
                    q9 q9Var = r9Var2.A0;
                    if (q9Var != null) {
                        z10 = q9Var.release(b0Var);
                        r9Var2.A0 = null;
                    }
                    if (!z10) {
                        org.telegram.messenger.g0.i3(b0Var, 80L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                r9 r9Var3 = ((i9) j4Var.A1).d;
                r9Var3.f10932j1 = false;
                r9Var3.d0();
                return;
            case 10:
                j4Var.J0(null);
                return;
            case 11:
                j4Var.a1(false);
                hp.e1().edit().putInt("taptostorysoundhint", hp.e1().getInt("taptostorysoundhint", 0) + 1).apply();
                return;
            default:
                j4Var.E3 = true;
                j4Var.setActive(false);
                return;
        }
    }
}
