package oi;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import j$.util.Objects;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.y60;
import org.telegram.ui.fg0;
public final class g1 implements View.OnClickListener {
    public final int f22067a;
    public final z1 f22068b;

    public g1(z1 z1Var, int i7) {
        this.f22067a = i7;
        this.f22068b = z1Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        l5 U2;
        o5 q10;
        String str;
        int i7 = this.f22067a;
        TL_iv.pageTableCell pagetablecell = null;
        r6 = null;
        TL_iv.pageBlockMath pageblockmath = null;
        pagetablecell = null;
        final z1 z1Var = this.f22068b;
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
                e2 e2Var = z1Var.Q.R3;
                if (e2Var != null) {
                    e2Var.k();
                    return;
                }
                return;
            case 3:
                e2 e2Var2 = z1Var.Q.R3;
                if (e2Var2 != null) {
                    e2Var2.i();
                    return;
                }
                return;
            case 4:
                z1.Z(z1Var);
                return;
            case 5:
                z1 z1Var2 = this.f22068b;
                if (z1Var2.C0) {
                    z1Var2.p0(true);
                    e1 S2 = z1Var2.Q.S2();
                    if (S2 != null) {
                        S2.O();
                        org.telegram.messenger.g0.I3(S2);
                        return;
                    }
                    return;
                }
                if (z1Var2.B0 == null) {
                    ry ryVar = new ry(z1Var2, true, false, false, z1Var2.getParentActivity(), true, null, z1Var2.P, true, z1Var2.getResourceProvider(), false, false);
                    z1Var2.B0 = ryVar;
                    ryVar.setVisibility(8);
                    ry ryVar2 = z1Var2.B0;
                    ryVar2.f39413y2 = false;
                    ryVar2.setDelegate(new q1(z1Var2));
                    int indexOfChild = z1Var2.P.indexOfChild(z1Var2.f22515b0);
                    if (indexOfChild < 0) {
                        indexOfChild = z1Var2.P.getChildCount();
                    }
                    FrameLayout.LayoutParams e10 = ma.e(-1, z1Var2.o0(), 87);
                    e10.bottomMargin = z1Var2.U0;
                    z1Var2.P.addView(z1Var2.B0, indexOfChild, e10);
                }
                int o02 = z1Var2.o0();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z1Var2.B0.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = ma.e(-1, o02, 87);
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
                z1Var2.f22517c0.j(wg.d, true);
                return;
            case 6:
                y60 y60Var = z1Var.f22546y0;
                if (y60Var != null) {
                    y60Var.v();
                    z1Var.f22546y0 = null;
                }
                final y60 I = y60.I(z1Var, view);
                I.T = true;
                a T2 = z1Var.Q.T2();
                if (T2 != null && T2.b()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                I.j(z10, 2131231069, null, gd.M0(2131753997, null), new j1(z1Var, T2, 5));
                if (T2 != null && T2.b() && !T2.a() && !T2.c()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                I.j(z11, 2131231565, null, gd.M0(2131754003, null), new j1(z1Var, T2, 6));
                if (T2 != null && T2.b() && !T2.a() && T2.c()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                I.j(z12, 2131231577, null, gd.M0(2131754000, null), new j1(z1Var, T2, 7));
                if (T2 != null && T2.b() && T2.a() && !T2.c()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                I.j(z13, 2131231598, null, gd.M0(2131754002, null), new j1(z1Var, T2, 8));
                if (T2 != null && (T2.f21907b instanceof TL_iv.pageBlockDetails)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                String M0 = gd.M0(2131753985, null);
                s3 s3Var = z1Var.Q;
                Objects.requireNonNull(s3Var);
                I.j(z14, 2131231553, null, M0, new b(s3Var, 1));
                boolean p22 = z1Var.Q.p2();
                boolean s22 = z1Var.Q.s2();
                if (p22 || s22) {
                    I.k();
                    if (p22) {
                        I.c(2131231566, gd.M0(2131754011, null), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        z1Var.Q.u3(false);
                                        I.v();
                                        return;
                                    default:
                                        z1Var.Q.u3(true);
                                        I.v();
                                        return;
                                }
                            }
                        }, false);
                    }
                    if (s22) {
                        I.c(2131231567, gd.M0(2131753996, null), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        z1Var.Q.u3(false);
                                        I.v();
                                        return;
                                    default:
                                        z1Var.Q.u3(true);
                                        I.v();
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                I.X = true;
                I.a0();
                z1Var.f22546y0 = I;
                return;
            case 7:
                y60 y60Var2 = z1Var.f22546y0;
                if (y60Var2 != null) {
                    y60Var2.v();
                    z1Var.f22546y0 = null;
                }
                s3 s3Var2 = z1Var.Q;
                l5 l5Var = s3Var2.f22337q4;
                if (l5Var == null && (U2 = s3Var2.U2()) != null && U2.getModel() != null) {
                    View findFocus = z1Var.Q.findFocus();
                    if ((findFocus instanceof e1) && (q10 = U2.q((e1) findFocus)) != null) {
                        pagetablecell = q10.f22224b;
                    }
                    if (pagetablecell != null) {
                        z1Var.Q.j2(U2);
                        if (U2.I.add(pagetablecell)) {
                            U2.f22165w.invalidate();
                            U2.v();
                        }
                        l5Var = U2;
                    }
                }
                if (l5Var != null && l5Var.getModel() != null && !l5Var.I.isEmpty()) {
                    z1Var.Q.I4(l5Var);
                    return;
                } else {
                    z1Var.Q.V1(z5.u(2, 2));
                    return;
                }
            case 8:
                y60 y60Var3 = z1Var.f22546y0;
                if (y60Var3 != null) {
                    y60Var3.v();
                    z1Var.f22546y0 = null;
                }
                a T22 = z1Var.Q.T2();
                if (T22 != null) {
                    TL_iv.PageBlock pageBlock = T22.f21907b;
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
                o.Z(parentActivity, str, new li.d(5, z1Var, pageblockmath), z1Var.getResourceProvider());
                return;
            case 9:
                z1Var.Q.f22327j4 = null;
                z1Var.t0(90, 0);
                return;
            case 10:
                z1Var.w0();
                fg0 fg0Var = z1Var.P0;
                if (fg0Var != null) {
                    fg0Var.h(true);
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
