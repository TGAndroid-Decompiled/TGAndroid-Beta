package oi;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import j$.util.Objects;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.yg;
import org.telegram.ui.eg0;
public final class g1 implements View.OnClickListener {
    public final int f22096a;
    public final a2 f22097b;

    public g1(a2 a2Var, int i7) {
        this.f22096a = i7;
        this.f22097b = a2Var;
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
        int i7 = this.f22096a;
        TL_iv.pageTableCell pagetablecell = null;
        r6 = null;
        TL_iv.pageBlockMath pageblockmath = null;
        pagetablecell = null;
        final a2 a2Var = this.f22097b;
        switch (i7) {
            case 0:
                a2Var.w0();
                return;
            case 1:
                if (!a2Var.Q.I2()) {
                    a2Var.finishFragment();
                    return;
                }
                return;
            case 2:
                e2 e2Var = a2Var.Q.R3;
                if (e2Var != null) {
                    e2Var.k();
                    return;
                }
                return;
            case 3:
                e2 e2Var2 = a2Var.Q.R3;
                if (e2Var2 != null) {
                    e2Var2.i();
                    return;
                }
                return;
            case 4:
                a2.Z(a2Var);
                return;
            case 5:
                a2 a2Var2 = this.f22097b;
                if (a2Var2.C0) {
                    a2Var2.p0(true);
                    e1 S2 = a2Var2.Q.S2();
                    if (S2 != null) {
                        S2.O();
                        org.telegram.messenger.g0.I3(S2);
                        return;
                    }
                    return;
                }
                if (a2Var2.B0 == null) {
                    ty tyVar = new ty(a2Var2, true, false, false, a2Var2.getParentActivity(), true, null, a2Var2.P, true, a2Var2.getResourceProvider(), false, false);
                    a2Var2.B0 = tyVar;
                    tyVar.setVisibility(8);
                    ty tyVar2 = a2Var2.B0;
                    tyVar2.f40142y2 = false;
                    tyVar2.setDelegate(new r1(a2Var2));
                    int indexOfChild = a2Var2.P.indexOfChild(a2Var2.f21928b0);
                    if (indexOfChild < 0) {
                        indexOfChild = a2Var2.P.getChildCount();
                    }
                    FrameLayout.LayoutParams e10 = na.e(-1, a2Var2.o0(), 87);
                    e10.bottomMargin = a2Var2.U0;
                    a2Var2.P.addView(a2Var2.B0, indexOfChild, e10);
                }
                int o02 = a2Var2.o0();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a2Var2.B0.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = na.e(-1, o02, 87);
                } else {
                    layoutParams.height = o02;
                }
                layoutParams.bottomMargin = a2Var2.U0;
                a2Var2.B0.setLayoutParams(layoutParams);
                a2Var2.B0.setVisibility(0);
                a2Var2.C0 = true;
                a2Var2.E0 = o02 + a2Var2.U0;
                e1 S22 = a2Var2.Q.S2();
                if (S22 != null) {
                    org.telegram.messenger.g0.v1(S22);
                }
                a2Var2.m0();
                a2Var2.f21930c0.j(yg.d, true);
                return;
            case 6:
                a70 a70Var = a2Var.f21959y0;
                if (a70Var != null) {
                    a70Var.v();
                    a2Var.f21959y0 = null;
                }
                final a70 I = a70.I(a2Var, view);
                I.T = true;
                a T2 = a2Var.Q.T2();
                if (T2 != null && T2.b()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                I.j(z10, 2131231069, null, hd.N0(2131753996, null), new k1(a2Var, T2, 5));
                if (T2 != null && T2.b() && !T2.a() && !T2.c()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                I.j(z11, 2131231565, null, hd.N0(2131754002, null), new k1(a2Var, T2, 6));
                if (T2 != null && T2.b() && !T2.a() && T2.c()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                I.j(z12, 2131231577, null, hd.N0(2131753999, null), new k1(a2Var, T2, 7));
                if (T2 != null && T2.b() && T2.a() && !T2.c()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                I.j(z13, 2131231598, null, hd.N0(2131754001, null), new k1(a2Var, T2, 8));
                if (T2 != null && (T2.f21901b instanceof TL_iv.pageBlockDetails)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                String N0 = hd.N0(2131753984, null);
                s3 s3Var = a2Var.Q;
                Objects.requireNonNull(s3Var);
                I.j(z14, 2131231553, null, N0, new b(s3Var, 1));
                boolean p22 = a2Var.Q.p2();
                boolean s22 = a2Var.Q.s2();
                if (p22 || s22) {
                    I.k();
                    if (p22) {
                        I.c(2131231566, hd.N0(2131754010, null), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        a2Var.Q.u3(false);
                                        I.v();
                                        return;
                                    default:
                                        a2Var.Q.u3(true);
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
                                        a2Var.Q.u3(false);
                                        I.v();
                                        return;
                                    default:
                                        a2Var.Q.u3(true);
                                        I.v();
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                I.X = true;
                I.a0();
                a2Var.f21959y0 = I;
                return;
            case 7:
                a70 a70Var2 = a2Var.f21959y0;
                if (a70Var2 != null) {
                    a70Var2.v();
                    a2Var.f21959y0 = null;
                }
                s3 s3Var2 = a2Var.Q;
                l5 l5Var = s3Var2.f22368q4;
                if (l5Var == null && (U2 = s3Var2.U2()) != null && U2.getModel() != null) {
                    View findFocus = a2Var.Q.findFocus();
                    if ((findFocus instanceof e1) && (q10 = U2.q((e1) findFocus)) != null) {
                        pagetablecell = q10.f22254b;
                    }
                    if (pagetablecell != null) {
                        a2Var.Q.j2(U2);
                        if (U2.I.add(pagetablecell)) {
                            U2.f22186w.invalidate();
                            U2.v();
                        }
                        l5Var = U2;
                    }
                }
                if (l5Var != null && l5Var.getModel() != null && !l5Var.I.isEmpty()) {
                    a2Var.Q.I4(l5Var);
                    return;
                } else {
                    a2Var.Q.V1(z5.u(2, 2));
                    return;
                }
            case 8:
                a70 a70Var3 = a2Var.f21959y0;
                if (a70Var3 != null) {
                    a70Var3.v();
                    a2Var.f21959y0 = null;
                }
                a T22 = a2Var.Q.T2();
                if (T22 != null) {
                    TL_iv.PageBlock pageBlock = T22.f21901b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                Activity parentActivity = a2Var.getParentActivity();
                if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                    str = pageblockmath.source;
                } else {
                    str = "";
                }
                o.Z(parentActivity, str, new li.d(5, a2Var, pageblockmath), a2Var.getResourceProvider());
                return;
            case 9:
                a2Var.Q.f22358j4 = null;
                a2Var.t0(90, 0);
                return;
            case 10:
                a2Var.w0();
                eg0 eg0Var = a2Var.P0;
                if (eg0Var != null) {
                    eg0Var.h(true);
                    a2Var.P0 = null;
                    return;
                }
                return;
            case 11:
                a2Var.Q.T4();
                a2Var.D0();
                return;
            case 12:
                a2Var.Q.c4(view);
                return;
            case 13:
                a2Var.Q.d4();
                return;
            case 14:
                a2Var.Q.a4();
                return;
            case 15:
                a2Var.Q.e4();
                return;
            default:
                a2Var.s0();
                return;
        }
    }
}
