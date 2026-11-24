package defpackage;

import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class mfa implements kt9 {
    public final nha a;

    public mfa(nha nhaVar) {
        this.a = nhaVar;
    }

    @Override
    public final void a(int i, boolean z) {
        nha nhaVar = this.a;
        iga[] igaVarArr = nhaVar.n0;
        if (igaVarArr[0].F == i) {
            return;
        }
        oea oeaVar = nhaVar.c0;
        if (oeaVar != null && i == 8) {
            oeaVar.b.g(1.0f, 0);
        }
        iga igaVar = igaVarArr[1];
        igaVar.F = i;
        igaVar.setVisibility(0);
        nhaVar.g0();
        nhaVar.z1(true);
        nhaVar.k1 = z;
        nhaVar.S0();
        nhaVar.j(!nhaVar.p0(i));
        nhaVar.G1(true);
    }

    @Override
    public final void g(float f) {
        iga igaVar;
        int i;
        int i2;
        iga igaVar2;
        nha nhaVar = this.a;
        r7 r7Var = nhaVar.q0;
        iga[] igaVarArr = nhaVar.n0;
        int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (i3 != 0 || igaVarArr[1].getVisibility() == 0) {
            if (nhaVar.k1) {
                igaVarArr[0].setTranslationX((-f) * igaVar2.getMeasuredWidth());
                igaVarArr[1].setTranslationX(igaVarArr[0].getMeasuredWidth() - (igaVarArr[0].getMeasuredWidth() * f));
            } else {
                igaVarArr[0].setTranslationX(igaVar.getMeasuredWidth() * f);
                igaVarArr[1].setTranslationX((igaVarArr[0].getMeasuredWidth() * f) - igaVarArr[0].getMeasuredWidth());
            }
            nhaVar.T0(nhaVar.getTabProgress());
            float U = nhaVar.U(f);
            nhaVar.s0 = U;
            ImageView imageView = nhaVar.u0;
            int i4 = 4;
            if (U != 0.0f && nhaVar.q() && !nhaVar.k0()) {
                i = 0;
            } else {
                i = 4;
            }
            imageView.setVisibility(i);
            if (r7Var != null && !nhaVar.q()) {
                if (nhaVar.s0()) {
                    i2 = 8;
                } else {
                    i2 = 4;
                }
                nhaVar.setSearchItemVisibility(i2);
                nhaVar.r0 = 0.0f;
            } else {
                nhaVar.r0 = nhaVar.V(f);
                nhaVar.L1();
            }
            nhaVar.G1(false);
            if (i3 == 0) {
                iga igaVar3 = igaVarArr[0];
                igaVarArr[0] = igaVarArr[1];
                igaVarArr[1] = igaVar3;
                igaVar3.setVisibility(8);
                if (r7Var != null && nhaVar.A0 == 2) {
                    if (nhaVar.s0()) {
                        i4 = 8;
                    }
                    nhaVar.setSearchItemVisibility(i4);
                }
                nhaVar.A0 = (byte) 0;
                nhaVar.q1();
            }
        }
    }

    @Override
    public final void s() {
        int a;
        int K0;
        nha nhaVar = this.a;
        iga[] igaVarArr = nhaVar.n0;
        int i = igaVarArr[0].F;
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            a = gm.L(58.0f);
                        } else {
                            a = gm.L(60.0f);
                        }
                    }
                } else {
                    a = gm.L(100.0f);
                }
            }
            a = gm.L(56.0f);
        } else {
            a = tha.a(1);
        }
        iga igaVar = igaVarArr[0];
        int i2 = igaVar.F;
        qea qeaVar = igaVar.x;
        if (i2 == 0) {
            K0 = (qeaVar.K0() / nhaVar.p1[0]) * a;
        } else {
            K0 = qeaVar.K0() * a;
        }
        if (K0 >= igaVarArr[0].h.getMeasuredHeight() * 1.2f) {
            cw6 cw6Var = igaVarArr[0].E;
            cw6Var.b = 1;
            cw6Var.l(0, 0, false, false);
            return;
        }
        igaVarArr[0].h.z0(0);
    }

    @Override
    public final boolean y0(int i, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        nha nhaVar = this.a;
        d dVar = nhaVar.y1;
        if (dVar != null) {
            boolean m0 = nhaVar.m0();
            if (nha.Y(i, m0) != null) {
                if (m0) {
                    if (sd2.w(5, dVar.getMessagesController().L0(Long.valueOf(nhaVar.g1.id)))) {
                        profileTab = nhaVar.g1.main_tab;
                        if (profileTab != null || (i != nha.Z(profileTab) && nhaVar.V1 != i)) {
                            bu5 I = bu5.I(dVar, view);
                            I.X(cmb.b0(gm.L(24.0f), cmb.w0(null, cmb.c6, false)));
                            I.b(2131232791, jb6.M0(2131746355, null), new i74(this, m0, i, (byte) 4), false);
                            I.a0();
                            return true;
                        }
                    }
                } else if (nhaVar.m1 == dVar.getUserConfig().e() && (userFull = nhaVar.h1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    bu5 I2 = bu5.I(dVar, view);
                    I2.X(cmb.b0(gm.L(24.0f), cmb.w0(null, cmb.c6, false)));
                    I2.b(2131232791, jb6.M0(2131746355, null), new i74(this, m0, i, (byte) 4), false);
                    I2.a0();
                    return true;
                }
            }
        }
        return false;
    }
}
