package defpackage;

import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class dha implements bv9 {
    public final eja a;

    public dha(eja ejaVar) {
        this.a = ejaVar;
    }

    @Override
    public final boolean B0(int i, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        eja ejaVar = this.a;
        e eVar = ejaVar.y1;
        if (eVar != null) {
            boolean m0 = ejaVar.m0();
            if (eja.Y(i, m0) != null) {
                if (m0) {
                    if (xc2.w(5, eVar.getMessagesController().M0(Long.valueOf(ejaVar.g1.id)))) {
                        profileTab = ejaVar.g1.main_tab;
                        if (profileTab != null || (i != eja.Z(profileTab) && ejaVar.V1 != i)) {
                            fu5 I = fu5.I(eVar, view);
                            I.X(aob.b0(hl.L(24.0f), aob.w0(null, aob.d6, false)));
                            I.b(2131232797, ob6.M0(2131746349, null), new t64(this, m0, i, (byte) 4), false);
                            I.a0();
                            return true;
                        }
                    }
                } else if (ejaVar.m1 == eVar.getUserConfig().e() && (userFull = ejaVar.h1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    fu5 I2 = fu5.I(eVar, view);
                    I2.X(aob.b0(hl.L(24.0f), aob.w0(null, aob.d6, false)));
                    I2.b(2131232797, ob6.M0(2131746349, null), new t64(this, m0, i, (byte) 4), false);
                    I2.a0();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void a(float f) {
        zha zhaVar;
        int i;
        int i2;
        zha zhaVar2;
        eja ejaVar = this.a;
        s7 s7Var = ejaVar.q0;
        zha[] zhaVarArr = ejaVar.n0;
        int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (i3 != 0 || zhaVarArr[1].getVisibility() == 0) {
            if (ejaVar.k1) {
                zhaVarArr[0].setTranslationX((-f) * zhaVar2.getMeasuredWidth());
                zhaVarArr[1].setTranslationX(zhaVarArr[0].getMeasuredWidth() - (zhaVarArr[0].getMeasuredWidth() * f));
            } else {
                zhaVarArr[0].setTranslationX(zhaVar.getMeasuredWidth() * f);
                zhaVarArr[1].setTranslationX((zhaVarArr[0].getMeasuredWidth() * f) - zhaVarArr[0].getMeasuredWidth());
            }
            ejaVar.T0(ejaVar.getTabProgress());
            float U = ejaVar.U(f);
            ejaVar.s0 = U;
            ImageView imageView = ejaVar.u0;
            int i4 = 4;
            if (U != 0.0f && ejaVar.q() && !ejaVar.k0()) {
                i = 0;
            } else {
                i = 4;
            }
            imageView.setVisibility(i);
            if (s7Var != null && !ejaVar.q()) {
                if (ejaVar.s0()) {
                    i2 = 8;
                } else {
                    i2 = 4;
                }
                ejaVar.setSearchItemVisibility(i2);
                ejaVar.r0 = 0.0f;
            } else {
                ejaVar.r0 = ejaVar.V(f);
                ejaVar.L1();
            }
            ejaVar.G1(false);
            if (i3 == 0) {
                zha zhaVar3 = zhaVarArr[0];
                zhaVarArr[0] = zhaVarArr[1];
                zhaVarArr[1] = zhaVar3;
                zhaVar3.setVisibility(8);
                if (s7Var != null && ejaVar.A0 == 2) {
                    if (ejaVar.s0()) {
                        i4 = 8;
                    }
                    ejaVar.setSearchItemVisibility(i4);
                }
                ejaVar.A0 = (byte) 0;
                ejaVar.q1();
            }
        }
    }

    @Override
    public final void c(int i, boolean z) {
        eja ejaVar = this.a;
        zha[] zhaVarArr = ejaVar.n0;
        if (zhaVarArr[0].F == i) {
            return;
        }
        fga fgaVar = ejaVar.c0;
        if (fgaVar != null && i == 8) {
            fgaVar.b.g(1.0f, 0);
        }
        zha zhaVar = zhaVarArr[1];
        zhaVar.F = i;
        zhaVar.setVisibility(0);
        ejaVar.g0();
        ejaVar.z1(true);
        ejaVar.k1 = z;
        ejaVar.S0();
        ejaVar.j(!ejaVar.p0(i));
        ejaVar.G1(true);
    }

    @Override
    public final void e() {
        int a;
        int K0;
        eja ejaVar = this.a;
        zha[] zhaVarArr = ejaVar.n0;
        int i = zhaVarArr[0].F;
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            a = hl.L(58.0f);
                        } else {
                            a = hl.L(60.0f);
                        }
                    }
                } else {
                    a = hl.L(100.0f);
                }
            }
            a = hl.L(56.0f);
        } else {
            a = kja.a(1);
        }
        zha zhaVar = zhaVarArr[0];
        int i2 = zhaVar.F;
        hga hgaVar = zhaVar.x;
        if (i2 == 0) {
            K0 = (hgaVar.K0() / ejaVar.p1[0]) * a;
        } else {
            K0 = hgaVar.K0() * a;
        }
        if (K0 >= zhaVarArr[0].h.getMeasuredHeight() * 1.2f) {
            hw6 hw6Var = zhaVarArr[0].E;
            hw6Var.b = 1;
            hw6Var.k(0, 0, false, false);
            return;
        }
        zhaVarArr[0].h.A0(0);
    }
}
