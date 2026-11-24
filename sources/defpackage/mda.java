package defpackage;

import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class mda implements ir9 {
    public final nfa a;

    public mda(nfa nfaVar) {
        this.a = nfaVar;
    }

    @Override
    public final void B() {
        int a;
        int K0;
        nfa nfaVar = this.a;
        iea[] ieaVarArr = nfaVar.n0;
        int i = ieaVarArr[0].F;
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            a = gl.L(58.0f);
                        } else {
                            a = gl.L(60.0f);
                        }
                    }
                } else {
                    a = gl.L(100.0f);
                }
            }
            a = gl.L(56.0f);
        } else {
            a = rfa.a(1);
        }
        iea ieaVar = ieaVarArr[0];
        int i2 = ieaVar.F;
        qca qcaVar = ieaVar.x;
        if (i2 == 0) {
            K0 = (qcaVar.K0() / nfaVar.p1[0]) * a;
        } else {
            K0 = qcaVar.K0() * a;
        }
        if (K0 >= ieaVarArr[0].h.getMeasuredHeight() * 1.2f) {
            cu6 cu6Var = ieaVarArr[0].E;
            cu6Var.b = 1;
            cu6Var.k(0, 0, false, false);
            return;
        }
        ieaVarArr[0].h.z0(0);
    }

    @Override
    public final void a(int i, boolean z) {
        nfa nfaVar = this.a;
        iea[] ieaVarArr = nfaVar.n0;
        if (ieaVarArr[0].F == i) {
            return;
        }
        oca ocaVar = nfaVar.c0;
        if (ocaVar != null && i == 8) {
            ocaVar.b.g(1.0f, 0);
        }
        iea ieaVar = ieaVarArr[1];
        ieaVar.F = i;
        ieaVar.setVisibility(0);
        nfaVar.g0();
        nfaVar.z1(true);
        nfaVar.k1 = z;
        nfaVar.S0();
        nfaVar.j(!nfaVar.p0(i));
        nfaVar.G1(true);
    }

    @Override
    public final void g(float f) {
        iea ieaVar;
        int i;
        int i2;
        iea ieaVar2;
        nfa nfaVar = this.a;
        r7 r7Var = nfaVar.q0;
        iea[] ieaVarArr = nfaVar.n0;
        int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (i3 != 0 || ieaVarArr[1].getVisibility() == 0) {
            if (nfaVar.k1) {
                ieaVarArr[0].setTranslationX((-f) * ieaVar2.getMeasuredWidth());
                ieaVarArr[1].setTranslationX(ieaVarArr[0].getMeasuredWidth() - (ieaVarArr[0].getMeasuredWidth() * f));
            } else {
                ieaVarArr[0].setTranslationX(ieaVar.getMeasuredWidth() * f);
                ieaVarArr[1].setTranslationX((ieaVarArr[0].getMeasuredWidth() * f) - ieaVarArr[0].getMeasuredWidth());
            }
            nfaVar.T0(nfaVar.getTabProgress());
            float U = nfaVar.U(f);
            nfaVar.s0 = U;
            ImageView imageView = nfaVar.u0;
            int i4 = 4;
            if (U != 0.0f && nfaVar.q() && !nfaVar.k0()) {
                i = 0;
            } else {
                i = 4;
            }
            imageView.setVisibility(i);
            if (r7Var != null && !nfaVar.q()) {
                if (nfaVar.s0()) {
                    i2 = 8;
                } else {
                    i2 = 4;
                }
                nfaVar.setSearchItemVisibility(i2);
                nfaVar.r0 = 0.0f;
            } else {
                nfaVar.r0 = nfaVar.V(f);
                nfaVar.L1();
            }
            nfaVar.G1(false);
            if (i3 == 0) {
                iea ieaVar3 = ieaVarArr[0];
                ieaVarArr[0] = ieaVarArr[1];
                ieaVarArr[1] = ieaVar3;
                ieaVar3.setVisibility(8);
                if (r7Var != null && nfaVar.A0 == 2) {
                    if (nfaVar.s0()) {
                        i4 = 8;
                    }
                    nfaVar.setSearchItemVisibility(i4);
                }
                nfaVar.A0 = (byte) 0;
                nfaVar.q1();
            }
        }
    }

    @Override
    public final boolean q2(int i, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        nfa nfaVar = this.a;
        d dVar = nfaVar.y1;
        if (dVar != null) {
            boolean m0 = nfaVar.m0();
            if (nfa.Y(i, m0) != null) {
                if (m0) {
                    if (hc2.w(5, dVar.getMessagesController().K0(Long.valueOf(nfaVar.g1.id)))) {
                        profileTab = nfaVar.g1.main_tab;
                        if (profileTab != null || (i != nfa.Z(profileTab) && nfaVar.V1 != i)) {
                            cs5 I = cs5.I(dVar, view);
                            I.X(bkb.b0(gl.L(24.0f), bkb.w0(null, bkb.c6, false)));
                            I.b(2131232778, k96.M0(2131746429, null), new z54(this, m0, i, (byte) 4), false);
                            I.a0();
                            return true;
                        }
                    }
                } else if (nfaVar.m1 == dVar.getUserConfig().e() && (userFull = nfaVar.h1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    cs5 I2 = cs5.I(dVar, view);
                    I2.X(bkb.b0(gl.L(24.0f), bkb.w0(null, bkb.c6, false)));
                    I2.b(2131232778, k96.M0(2131746429, null), new z54(this, m0, i, (byte) 4), false);
                    I2.a0();
                    return true;
                }
            }
        }
        return false;
    }
}
