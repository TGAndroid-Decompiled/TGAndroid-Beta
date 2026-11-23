package oi;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import j$.util.Objects;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.yg;
import org.telegram.ui.eg0;
public final class h1 implements View.OnClickListener {
    public final int f22157a;
    public final b2 f22158b;

    public h1(b2 b2Var, int i7) {
        this.f22157a = i7;
        this.f22158b = b2Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        m5 U2;
        p5 q10;
        String str;
        int i7 = this.f22157a;
        TL_iv.pageTableCell pagetablecell = null;
        r6 = null;
        TL_iv.pageBlockMath pageblockmath = null;
        pagetablecell = null;
        final b2 b2Var = this.f22158b;
        switch (i7) {
            case 0:
                b2Var.w0();
                return;
            case 1:
                if (!b2Var.Q.I2()) {
                    b2Var.finishFragment();
                    return;
                }
                return;
            case 2:
                g2 g2Var = b2Var.Q.R3;
                if (g2Var != null) {
                    g2Var.k();
                    return;
                }
                return;
            case 3:
                g2 g2Var2 = b2Var.Q.R3;
                if (g2Var2 != null) {
                    g2Var2.i();
                    return;
                }
                return;
            case 4:
                b2.Z(b2Var);
                return;
            case 5:
                b2 b2Var2 = this.f22158b;
                if (b2Var2.C0) {
                    b2Var2.p0(true);
                    f1 S2 = b2Var2.Q.S2();
                    if (S2 != null) {
                        S2.O();
                        org.telegram.messenger.g0.I3(S2);
                        return;
                    }
                    return;
                }
                if (b2Var2.B0 == null) {
                    ty tyVar = new ty(b2Var2, true, false, false, b2Var2.getParentActivity(), true, null, b2Var2.P, true, b2Var2.getResourceProvider(), false, false);
                    b2Var2.B0 = tyVar;
                    tyVar.setVisibility(8);
                    ty tyVar2 = b2Var2.B0;
                    tyVar2.f40160y2 = false;
                    tyVar2.setDelegate(new s1(b2Var2));
                    int indexOfChild = b2Var2.P.indexOfChild(b2Var2.f21991b0);
                    if (indexOfChild < 0) {
                        indexOfChild = b2Var2.P.getChildCount();
                    }
                    FrameLayout.LayoutParams e10 = ma.e(-1, b2Var2.o0(), 87);
                    e10.bottomMargin = b2Var2.U0;
                    b2Var2.P.addView(b2Var2.B0, indexOfChild, e10);
                }
                int o02 = b2Var2.o0();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b2Var2.B0.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = ma.e(-1, o02, 87);
                } else {
                    layoutParams.height = o02;
                }
                layoutParams.bottomMargin = b2Var2.U0;
                b2Var2.B0.setLayoutParams(layoutParams);
                b2Var2.B0.setVisibility(0);
                b2Var2.C0 = true;
                b2Var2.E0 = o02 + b2Var2.U0;
                f1 S22 = b2Var2.Q.S2();
                if (S22 != null) {
                    org.telegram.messenger.g0.v1(S22);
                }
                b2Var2.m0();
                b2Var2.f21993c0.j(yg.d, true);
                return;
            case 6:
                a70 a70Var = b2Var.f22022y0;
                if (a70Var != null) {
                    a70Var.v();
                    b2Var.f22022y0 = null;
                }
                final a70 I = a70.I(b2Var, view);
                I.T = true;
                a T2 = b2Var.Q.T2();
                if (T2 != null && T2.b()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                I.j(z10, 2131231069, null, hd.N0(2131753996, null), new l1(b2Var, T2, 5));
                if (T2 != null && T2.b() && !T2.a() && !T2.c()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                I.j(z11, 2131231565, null, hd.N0(2131754002, null), new l1(b2Var, T2, 6));
                if (T2 != null && T2.b() && !T2.a() && T2.c()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                I.j(z12, 2131231577, null, hd.N0(2131753999, null), new l1(b2Var, T2, 7));
                if (T2 != null && T2.b() && T2.a() && !T2.c()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                I.j(z13, 2131231598, null, hd.N0(2131754001, null), new l1(b2Var, T2, 8));
                if (T2 != null && (T2.f21935b instanceof TL_iv.pageBlockDetails)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                String N0 = hd.N0(2131753984, null);
                t3 t3Var = b2Var.Q;
                Objects.requireNonNull(t3Var);
                I.j(z14, 2131231553, null, N0, new b(t3Var, 1));
                boolean p22 = b2Var.Q.p2();
                boolean s22 = b2Var.Q.s2();
                if (p22 || s22) {
                    I.k();
                    if (p22) {
                        I.c(2131231566, hd.N0(2131754010, null), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        b2Var.Q.u3(false);
                                        I.v();
                                        return;
                                    default:
                                        b2Var.Q.u3(true);
                                        I.v();
                                        return;
                                }
                            }
                        }, false);
                    }
                    if (s22) {
                        I.c(2131231567, hd.N0(2131753995, null), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        b2Var.Q.u3(false);
                                        I.v();
                                        return;
                                    default:
                                        b2Var.Q.u3(true);
                                        I.v();
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                I.X = true;
                I.a0();
                b2Var.f22022y0 = I;
                return;
            case 7:
                a70 a70Var2 = b2Var.f22022y0;
                if (a70Var2 != null) {
                    a70Var2.v();
                    b2Var.f22022y0 = null;
                }
                t3 t3Var2 = b2Var.Q;
                m5 m5Var = t3Var2.f22431q4;
                if (m5Var == null && (U2 = t3Var2.U2()) != null && U2.getModel() != null) {
                    View findFocus = b2Var.Q.findFocus();
                    if ((findFocus instanceof f1) && (q10 = U2.q((f1) findFocus)) != null) {
                        pagetablecell = q10.f22316b;
                    }
                    if (pagetablecell != null) {
                        b2Var.Q.j2(U2);
                        if (U2.I.add(pagetablecell)) {
                            U2.f22248w.invalidate();
                            U2.v();
                        }
                        m5Var = U2;
                    }
                }
                if (m5Var != null && m5Var.getModel() != null && !m5Var.I.isEmpty()) {
                    b2Var.Q.I4(m5Var);
                    return;
                } else {
                    b2Var.Q.V1(a6.u(2, 2));
                    return;
                }
            case 8:
                a70 a70Var3 = b2Var.f22022y0;
                if (a70Var3 != null) {
                    a70Var3.v();
                    b2Var.f22022y0 = null;
                }
                a T22 = b2Var.Q.T2();
                if (T22 != null) {
                    TL_iv.PageBlock pageBlock = T22.f21935b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                Activity parentActivity = b2Var.getParentActivity();
                if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                    str = pageblockmath.source;
                } else {
                    str = "";
                }
                o.Z(parentActivity, str, new li.d(5, b2Var, pageblockmath), b2Var.getResourceProvider());
                return;
            case 9:
                b2Var.Q.f22421j4 = null;
                b2Var.t0(90, 0);
                return;
            case 10:
                b2Var.w0();
                eg0 eg0Var = b2Var.P0;
                if (eg0Var != null) {
                    eg0Var.h(true);
                    b2Var.P0 = null;
                    return;
                }
                return;
            case 11:
                b2Var.Q.T4();
                b2Var.D0();
                return;
            case 12:
                b2Var.Q.c4(view);
                return;
            case 13:
                b2Var.Q.d4();
                return;
            case 14:
                b2Var.Q.a4();
                return;
            case 15:
                b2Var.Q.e4();
                return;
            default:
                b2Var.s0();
                return;
        }
    }
}
