package defpackage;

import android.app.Activity;
import org.telegram.ui.PremiumPreviewFragment;
public final class e18 implements Runnable {
    public final byte a;
    public final y28 b;

    public e18(y28 y28Var, byte b) {
        this.a = b;
        this.b = y28Var;
    }

    @Override
    public final void run() {
        float f;
        byte b = this.a;
        boolean z = false;
        y28 y28Var = this.b;
        switch (b) {
            case 0:
                y28Var.Z1.setVisibility(8);
                return;
            case 1:
                if (!y28Var.z0.H0) {
                    y28Var.p3 = null;
                    if (y28Var.x0 == null) {
                        je5 je5Var = new je5(y28Var.getContext(), 3);
                        je5Var.n(1.0f, -22.0f);
                        y28Var.x0 = je5Var;
                        je5Var.i(bm2.o(bm2.f(0.13f, -16777216, -1), 240));
                        je5 je5Var2 = y28Var.x0;
                        je5Var2.V = false;
                        je5Var2.t(k96.M0(2131746206, null));
                        y28Var.x0.setPadding(gl.L(8.0f), 0, gl.L(8.0f), gl.L(1.0f));
                        d28 d28Var = y28Var.S0;
                        je5 je5Var3 = y28Var.x0;
                        if (y28Var.n2) {
                            f = 0.0f;
                        } else {
                            f = 56.0f;
                        }
                        d28Var.addView(je5Var3, nme.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, f));
                    }
                    y28Var.x0.v();
                    gba.G(true);
                    return;
                }
                return;
            case 2:
                y28Var.K0();
                return;
            case 3:
                ((d8b) y28Var.G1).b(true);
                return;
            case 4:
                y28Var.h0(true);
                return;
            case 5:
                m8b m8bVar = y28Var.z0;
                if (m8bVar != null) {
                    m8bVar.L(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 6:
                y28Var.H0();
                return;
            case 7:
                y28Var.A3 = 0L;
                q18 q18Var = y28Var.R1;
                if (q18Var != null) {
                    q18Var.N(true);
                    y28Var.R1.x2();
                    y28Var.h0(true);
                    return;
                }
                return;
            case 8:
                Activity W = gl.W(y28Var.getContext());
                if (W != null) {
                    h18 h18Var = new h18(y28Var, W, (byte) 1);
                    m8b m8bVar2 = ((d8b) y28Var.G1).d;
                    l8b l8bVar = m8bVar2.A0;
                    if (l8bVar != null) {
                        z = l8bVar.release(h18Var);
                        m8bVar2.A0 = null;
                    }
                    if (!z) {
                        gl.d3(h18Var, 80L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                m8b m8bVar3 = ((d8b) y28Var.G1).d;
                m8bVar3.i1 = false;
                m8bVar3.U();
                return;
            case 10:
                y28Var.E0(null);
                return;
            case 11:
                y28Var.X0(false);
                na7.c1().edit().putInt("taptostorysoundhint", na7.c1().getInt("taptostorysoundhint", 0) + 1).apply();
                return;
            default:
                y28Var.J3 = true;
                y28Var.setActive(false);
                return;
        }
    }
}
