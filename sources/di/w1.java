package di;

import android.app.Activity;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.ui.PremiumPreviewFragment;
public final class w1 implements Runnable {
    public final int f9890a;
    public final j4 f9891b;

    public w1(j4 j4Var, int i7) {
        this.f9890a = i7;
        this.f9891b = j4Var;
    }

    @Override
    public final void run() {
        float f10;
        int i7 = this.f9890a;
        boolean z9 = false;
        j4 j4Var = this.f9891b;
        switch (i7) {
            case 0:
                j4Var.S1.setVisibility(8);
                return;
            case 1:
                if (!j4Var.f9224s0.G0) {
                    j4Var.f9191i3 = null;
                    if (j4Var.f9216q0 == null) {
                        fi.m3 m3Var = new fi.m3(j4Var.getContext(), 3);
                        m3Var.o(1.0f, -22.0f);
                        j4Var.f9216q0 = m3Var;
                        m3Var.j(i0.a.o(i0.a.f(0.13f, -16777216, -1), 240));
                        fi.m3 m3Var2 = j4Var.f9216q0;
                        m3Var2.U = false;
                        m3Var2.u(id.M0(2131746399, null));
                        j4Var.f9216q0.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(1.0f));
                        j3 j3Var = j4Var.L0;
                        fi.m3 m3Var3 = j4Var.f9216q0;
                        if (j4Var.f9182g2) {
                            f10 = 0.0f;
                        } else {
                            f10 = 56.0f;
                        }
                        j3Var.addView(m3Var3, ha.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, f10));
                    }
                    j4Var.f9216q0.w();
                    iz.H(true);
                    return;
                }
                return;
            case 2:
                j4Var.O0();
                return;
            case 3:
                ((h9) j4Var.f9253z1).b(true);
                return;
            case 4:
                j4Var.p0(true);
                return;
            case 5:
                q9 q9Var = j4Var.f9224s0;
                if (q9Var != null) {
                    q9Var.N(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 6:
                j4Var.M0();
                return;
            case 7:
                j4Var.f9235u3 = 0L;
                o2 o2Var = j4Var.K1;
                if (o2Var != null) {
                    o2Var.E(true);
                    j4Var.K1.T1();
                    j4Var.p0(true);
                    return;
                }
                return;
            case 8:
                Activity W = org.telegram.messenger.g0.W(j4Var.getContext());
                if (W != null) {
                    z0 z0Var = new z0(3, j4Var, W);
                    q9 q9Var2 = ((h9) j4Var.f9253z1).d;
                    p9 p9Var = q9Var2.f9649z0;
                    if (p9Var != null) {
                        z9 = p9Var.release(z0Var);
                        q9Var2.f9649z0 = null;
                    }
                    if (!z9) {
                        org.telegram.messenger.g0.i3(z0Var, 80L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                q9 q9Var3 = ((h9) j4Var.f9253z1).d;
                q9Var3.f9614h1 = false;
                q9Var3.V();
                return;
            case 10:
                j4Var.J0(null);
                return;
            case 11:
                j4Var.a1(false);
                qp.e1().edit().putInt("taptostorysoundhint", qp.e1().getInt("taptostorysoundhint", 0) + 1).apply();
                return;
            default:
                j4Var.D3 = true;
                j4Var.setActive(false);
                return;
        }
    }
}
