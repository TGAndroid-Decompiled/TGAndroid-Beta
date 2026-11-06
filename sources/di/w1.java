package di;

import android.app.Activity;
import c8.ha;
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.ui.PremiumPreviewFragment;
public final class w1 implements Runnable {
    public final int f9896a;
    public final i4 f9897b;

    public w1(i4 i4Var, int i7) {
        this.f9896a = i7;
        this.f9897b = i4Var;
    }

    @Override
    public final void run() {
        float f10;
        int i7 = this.f9896a;
        boolean z9 = false;
        i4 i4Var = this.f9897b;
        switch (i7) {
            case 0:
                i4Var.S1.setVisibility(8);
                return;
            case 1:
                if (!i4Var.f9192s0.G0) {
                    i4Var.f9159i3 = null;
                    if (i4Var.f9184q0 == null) {
                        fi.m3 m3Var = new fi.m3(i4Var.getContext(), 3);
                        m3Var.o(1.0f, -22.0f);
                        i4Var.f9184q0 = m3Var;
                        m3Var.j(i0.a.o(i0.a.f(0.13f, -16777216, -1), 240));
                        fi.m3 m3Var2 = i4Var.f9184q0;
                        m3Var2.U = false;
                        m3Var2.u(hd.M0(2131746398, null));
                        i4Var.f9184q0.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(1.0f));
                        j3 j3Var = i4Var.L0;
                        fi.m3 m3Var3 = i4Var.f9184q0;
                        if (i4Var.f9150g2) {
                            f10 = 0.0f;
                        } else {
                            f10 = 56.0f;
                        }
                        j3Var.addView(m3Var3, ha.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, f10));
                    }
                    i4Var.f9184q0.w();
                    iz.H(true);
                    return;
                }
                return;
            case 2:
                i4Var.O0();
                return;
            case 3:
                ((g9) i4Var.f9221z1).b(true);
                return;
            case 4:
                i4Var.p0(true);
                return;
            case 5:
                p9 p9Var = i4Var.f9192s0;
                if (p9Var != null) {
                    p9Var.N(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 6:
                i4Var.M0();
                return;
            case 7:
                i4Var.f9203u3 = 0L;
                o2 o2Var = i4Var.K1;
                if (o2Var != null) {
                    o2Var.E(true);
                    i4Var.K1.T1();
                    i4Var.p0(true);
                    return;
                }
                return;
            case 8:
                Activity W = org.telegram.messenger.g0.W(i4Var.getContext());
                if (W != null) {
                    z0 z0Var = new z0(3, i4Var, W);
                    p9 p9Var2 = ((g9) i4Var.f9221z1).d;
                    o9 o9Var = p9Var2.f9584z0;
                    if (o9Var != null) {
                        z9 = o9Var.release(z0Var);
                        p9Var2.f9584z0 = null;
                    }
                    if (!z9) {
                        org.telegram.messenger.g0.i3(z0Var, 80L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                p9 p9Var3 = ((g9) i4Var.f9221z1).d;
                p9Var3.f9549h1 = false;
                p9Var3.V();
                return;
            case 10:
                i4Var.J0(null);
                return;
            case 11:
                i4Var.a1(false);
                qp.e1().edit().putInt("taptostorysoundhint", qp.e1().getInt("taptostorysoundhint", 0) + 1).apply();
                return;
            default:
                i4Var.D3 = true;
                i4Var.setActive(false);
                return;
        }
    }
}
