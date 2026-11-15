package oi;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import j$.util.Objects;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.ng;
import org.telegram.ui.bg0;
public final class g1 implements View.OnClickListener {
    public final int f21707a;
    public final z1 f21708b;

    public g1(z1 z1Var, int i7) {
        this.f21707a = i7;
        this.f21708b = z1Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        k5 U2;
        n5 q10;
        String str;
        int i7 = this.f21707a;
        TL_iv.pageTableCell pagetablecell = null;
        r5 = null;
        TL_iv.pageBlockMath pageblockmath = null;
        pagetablecell = null;
        final z1 z1Var = this.f21708b;
        switch (i7) {
            case 0:
                z1Var.w0();
                return;
            case 1:
                if (!z1Var.Q.I2()) {
                    z1Var.finishFragment();
                    return;
                }
                return;
            case 2:
                d2 d2Var = z1Var.Q.R3;
                if (d2Var != null) {
                    d2Var.k();
                    return;
                }
                return;
            case 3:
                d2 d2Var2 = z1Var.Q.R3;
                if (d2Var2 != null) {
                    d2Var2.i();
                    return;
                }
                return;
            case 4:
                z1.Z(z1Var);
                return;
            case 5:
                z1 z1Var2 = this.f21708b;
                if (z1Var2.C0) {
                    z1Var2.p0(true);
                    e1 S2 = z1Var2.Q.S2();
                    if (S2 != null) {
                        S2.O();
                        org.telegram.messenger.g0.J3(S2);
                        return;
                    }
                    return;
                }
                if (z1Var2.B0 == null) {
                    ly lyVar = new ly(z1Var2, true, false, false, z1Var2.getParentActivity(), true, null, z1Var2.P, true, z1Var2.getResourceProvider(), false, false);
                    z1Var2.B0 = lyVar;
                    lyVar.setVisibility(8);
                    ly lyVar2 = z1Var2.B0;
                    lyVar2.f37009y2 = false;
                    lyVar2.setDelegate(new q1(z1Var2));
                    int indexOfChild = z1Var2.P.indexOfChild(z1Var2.f22159b0);
                    if (indexOfChild < 0) {
                        indexOfChild = z1Var2.P.getChildCount();
                    }
                    FrameLayout.LayoutParams e10 = ja.e(-1, z1Var2.o0(), 87);
                    e10.bottomMargin = z1Var2.U0;
                    z1Var2.P.addView(z1Var2.B0, indexOfChild, e10);
                }
                int o02 = z1Var2.o0();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z1Var2.B0.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = ja.e(-1, o02, 87);
                } else {
                    layoutParams.height = o02;
                }
                layoutParams.bottomMargin = z1Var2.U0;
                z1Var2.B0.setLayoutParams(layoutParams);
                z1Var2.B0.setVisibility(0);
                z1Var2.C0 = true;
                z1Var2.E0 = o02 + z1Var2.U0;
                e1 S22 = z1Var2.Q.S2();
                if (S22 != null) {
                    org.telegram.messenger.g0.v1(S22);
                }
                z1Var2.m0();
                z1Var2.f22161c0.j(ng.d, true);
                return;
            case 6:
                m60 m60Var = z1Var.f22190y0;
                if (m60Var != null) {
                    m60Var.u();
                    z1Var.f22190y0 = null;
                }
                final m60 H = m60.H(z1Var, view);
                H.Q = true;
                a T2 = z1Var.Q.T2();
                if (T2 != null && T2.b()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                H.j(z10, 2131231069, null, hd.M0(2131753999, null), new j1(z1Var, T2, 5));
                if (T2 != null && T2.b() && !T2.a() && !T2.c()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.j(z11, 2131231564, null, hd.M0(2131754005, null), new j1(z1Var, T2, 6));
                if (T2 != null && T2.b() && !T2.a() && T2.c()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                H.j(z12, 2131231576, null, hd.M0(2131754002, null), new j1(z1Var, T2, 7));
                if (T2 != null && T2.b() && T2.a() && !T2.c()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                H.j(z13, 2131231597, null, hd.M0(2131754004, null), new j1(z1Var, T2, 8));
                if (T2 != null && (T2.f21544b instanceof TL_iv.pageBlockDetails)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                String M0 = hd.M0(2131753987, null);
                q3 q3Var = z1Var.Q;
                Objects.requireNonNull(q3Var);
                H.j(z14, 2131231552, null, M0, new b(q3Var, 1));
                boolean p22 = z1Var.Q.p2();
                boolean s22 = z1Var.Q.s2();
                if (p22 || s22) {
                    H.k();
                    if (p22) {
                        H.c(2131231565, hd.M0(2131754013, null), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        z1Var.Q.u3(false);
                                        H.u();
                                        return;
                                    default:
                                        z1Var.Q.u3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                    if (s22) {
                        H.c(2131231566, hd.M0(2131753998, null), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        z1Var.Q.u3(false);
                                        H.u();
                                        return;
                                    default:
                                        z1Var.Q.u3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                z1Var.f22190y0 = H;
                return;
            case 7:
                m60 m60Var2 = z1Var.f22190y0;
                if (m60Var2 != null) {
                    m60Var2.u();
                    z1Var.f22190y0 = null;
                }
                q3 q3Var2 = z1Var.Q;
                k5 k5Var = q3Var2.f21934q4;
                if (k5Var == null && (U2 = q3Var2.U2()) != null && U2.getModel() != null) {
                    View findFocus = z1Var.Q.findFocus();
                    if ((findFocus instanceof e1) && (q10 = U2.q((e1) findFocus)) != null) {
                        pagetablecell = q10.f21846b;
                    }
                    if (pagetablecell != null) {
                        z1Var.Q.j2(U2);
                        if (U2.I.add(pagetablecell)) {
                            U2.f21778w.invalidate();
                            U2.v();
                        }
                        k5Var = U2;
                    }
                }
                if (k5Var != null && k5Var.getModel() != null && !k5Var.I.isEmpty()) {
                    z1Var.Q.I4(k5Var);
                    return;
                } else {
                    z1Var.Q.V1(y5.u(2, 2));
                    return;
                }
            case 8:
                m60 m60Var3 = z1Var.f22190y0;
                if (m60Var3 != null) {
                    m60Var3.u();
                    z1Var.f22190y0 = null;
                }
                a T22 = z1Var.Q.T2();
                if (T22 != null) {
                    TL_iv.PageBlock pageBlock = T22.f21544b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                Activity parentActivity = z1Var.getParentActivity();
                if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                    str = pageblockmath.source;
                } else {
                    str = "";
                }
                o.Z(parentActivity, str, new li.v(3, z1Var, pageblockmath), z1Var.getResourceProvider());
                return;
            case 9:
                z1Var.Q.f21924j4 = null;
                z1Var.t0(90, 0);
                return;
            case 10:
                z1Var.w0();
                bg0 bg0Var = z1Var.P0;
                if (bg0Var != null) {
                    bg0Var.h(true);
                    z1Var.P0 = null;
                    return;
                }
                return;
            case 11:
                z1Var.Q.T4();
                z1Var.D0();
                return;
            case 12:
                z1Var.Q.c4(view);
                return;
            case 13:
                z1Var.Q.d4();
                return;
            case 14:
                z1Var.Q.a4();
                return;
            case 15:
                z1Var.Q.e4();
                return;
            default:
                z1Var.s0();
                return;
        }
    }
}
