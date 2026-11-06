package li;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import j$.util.Objects;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.k60;
import org.telegram.ui.bg0;
public final class i1 implements View.OnClickListener {
    public final int f18632a;
    public final b2 f18633b;

    public i1(b2 b2Var, int i7) {
        this.f18632a = i7;
        this.f18633b = b2Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        m5 U2;
        p5 q10;
        String str;
        int i7 = this.f18632a;
        TL_iv.pageTableCell pagetablecell = null;
        r5 = null;
        TL_iv.pageBlockMath pageblockmath = null;
        pagetablecell = null;
        final b2 b2Var = this.f18633b;
        switch (i7) {
            case 0:
                b2Var.w0();
                return;
            case 1:
                if (!b2Var.P.I2()) {
                    b2Var.finishFragment();
                    return;
                }
                return;
            case 2:
                f2 f2Var = b2Var.P.Q3;
                if (f2Var != null) {
                    f2Var.k();
                    return;
                }
                return;
            case 3:
                f2 f2Var2 = b2Var.P.Q3;
                if (f2Var2 != null) {
                    f2Var2.i();
                    return;
                }
                return;
            case 4:
                b2.Z(b2Var);
                return;
            case 5:
                b2 b2Var2 = this.f18633b;
                if (b2Var2.B0) {
                    b2Var2.p0(true);
                    g1 S2 = b2Var2.P.S2();
                    if (S2 != null) {
                        S2.N();
                        org.telegram.messenger.g0.K3(S2);
                        return;
                    }
                    return;
                }
                if (b2Var2.A0 == null) {
                    gy gyVar = new gy(b2Var2, true, false, false, b2Var2.getParentActivity(), true, null, b2Var2.O, true, b2Var2.getResourceProvider(), false, false);
                    b2Var2.A0 = gyVar;
                    gyVar.setVisibility(8);
                    gy gyVar2 = b2Var2.A0;
                    gyVar2.f34143x2 = false;
                    gyVar2.setDelegate(new s1(b2Var2));
                    int indexOfChild = b2Var2.O.indexOfChild(b2Var2.f18439a0);
                    if (indexOfChild < 0) {
                        indexOfChild = b2Var2.O.getChildCount();
                    }
                    FrameLayout.LayoutParams e10 = ha.e(-1, b2Var2.o0(), 87);
                    e10.bottomMargin = b2Var2.T0;
                    b2Var2.O.addView(b2Var2.A0, indexOfChild, e10);
                }
                int o02 = b2Var2.o0();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b2Var2.A0.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = ha.e(-1, o02, 87);
                } else {
                    layoutParams.height = o02;
                }
                layoutParams.bottomMargin = b2Var2.T0;
                b2Var2.A0.setLayoutParams(layoutParams);
                b2Var2.A0.setVisibility(0);
                b2Var2.B0 = true;
                b2Var2.D0 = o02 + b2Var2.T0;
                g1 S22 = b2Var2.P.S2();
                if (S22 != null) {
                    org.telegram.messenger.g0.v1(S22);
                }
                b2Var2.m0();
                b2Var2.f18441b0.j(hg.d, true);
                return;
            case 6:
                k60 k60Var = b2Var.f18470x0;
                if (k60Var != null) {
                    k60Var.u();
                    b2Var.f18470x0 = null;
                }
                final k60 H = k60.H(b2Var, view);
                H.Q = true;
                a T2 = b2Var.P.T2();
                if (T2 != null && T2.b()) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                H.j(z9, 2131231069, null, hd.M0(2131753999, null), new l1(b2Var, T2, 5));
                if (T2 != null && T2.b() && !T2.a() && !T2.c()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                H.j(z10, 2131231564, null, hd.M0(2131754005, null), new l1(b2Var, T2, 6));
                if (T2 != null && T2.b() && !T2.a() && T2.c()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.j(z11, 2131231576, null, hd.M0(2131754002, null), new l1(b2Var, T2, 7));
                if (T2 != null && T2.b() && T2.a() && !T2.c()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                H.j(z12, 2131231597, null, hd.M0(2131754004, null), new l1(b2Var, T2, 8));
                if (T2 != null && (T2.f18389b instanceof TL_iv.pageBlockDetails)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                String M0 = hd.M0(2131753987, null);
                t3 t3Var = b2Var.P;
                Objects.requireNonNull(t3Var);
                H.j(z13, 2131231552, null, M0, new b(t3Var, 1));
                boolean p22 = b2Var.P.p2();
                boolean s22 = b2Var.P.s2();
                if (p22 || s22) {
                    H.k();
                    if (p22) {
                        H.c(2131231565, hd.M0(2131754013, null), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        b2Var.P.u3(false);
                                        H.u();
                                        return;
                                    default:
                                        b2Var.P.u3(true);
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
                                        b2Var.P.u3(false);
                                        H.u();
                                        return;
                                    default:
                                        b2Var.P.u3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                b2Var.f18470x0 = H;
                return;
            case 7:
                k60 k60Var2 = b2Var.f18470x0;
                if (k60Var2 != null) {
                    k60Var2.u();
                    b2Var.f18470x0 = null;
                }
                t3 t3Var2 = b2Var.P;
                m5 m5Var = t3Var2.f18889p4;
                if (m5Var == null && (U2 = t3Var2.U2()) != null && U2.getModel() != null) {
                    View findFocus = b2Var.P.findFocus();
                    if ((findFocus instanceof g1) && (q10 = U2.q((g1) findFocus)) != null) {
                        pagetablecell = q10.f18776b;
                    }
                    if (pagetablecell != null) {
                        b2Var.P.j2(U2);
                        if (U2.H.add(pagetablecell)) {
                            U2.f18708w.invalidate();
                            U2.v();
                        }
                        m5Var = U2;
                    }
                }
                if (m5Var != null && m5Var.getModel() != null && !m5Var.H.isEmpty()) {
                    b2Var.P.I4(m5Var);
                    return;
                } else {
                    b2Var.P.V1(a6.u(2, 2));
                    return;
                }
            case 8:
                k60 k60Var3 = b2Var.f18470x0;
                if (k60Var3 != null) {
                    k60Var3.u();
                    b2Var.f18470x0 = null;
                }
                a T22 = b2Var.P.T2();
                if (T22 != null) {
                    TL_iv.PageBlock pageBlock = T22.f18389b;
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
                p.Z(parentActivity, str, new ai.f1(28, b2Var, pageblockmath), b2Var.getResourceProvider());
                return;
            case 9:
                b2Var.P.f18879i4 = null;
                b2Var.t0(90, 0);
                return;
            case 10:
                b2Var.w0();
                bg0 bg0Var = b2Var.O0;
                if (bg0Var != null) {
                    bg0Var.g(true);
                    b2Var.O0 = null;
                    return;
                }
                return;
            case 11:
                b2Var.P.T4();
                b2Var.D0();
                return;
            case 12:
                b2Var.P.c4(view);
                return;
            case 13:
                b2Var.P.d4();
                return;
            case 14:
                b2Var.P.a4();
                return;
            case 15:
                b2Var.P.e4();
                return;
            default:
                b2Var.s0();
                return;
        }
    }
}
