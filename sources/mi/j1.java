package mi;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import j$.util.Objects;
import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fg;
import org.telegram.ui.vf0;
public final class j1 implements View.OnClickListener {
    public final int f19697a;
    public final c2 f19698b;

    public j1(c2 c2Var, int i3) {
        this.f19697a = i3;
        this.f19698b = c2Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        n5 U2;
        q5 q10;
        String str;
        int i3 = this.f19697a;
        TL_iv.pageTableCell pagetablecell = null;
        r6 = null;
        TL_iv.pageBlockMath pageblockmath = null;
        pagetablecell = null;
        final c2 c2Var = this.f19698b;
        switch (i3) {
            case 0:
                c2Var.w0();
                return;
            case 1:
                if (!c2Var.Q.I2()) {
                    c2Var.finishFragment();
                    return;
                }
                return;
            case 2:
                g2 g2Var = c2Var.Q.R3;
                if (g2Var != null) {
                    g2Var.k();
                    return;
                }
                return;
            case 3:
                g2 g2Var2 = c2Var.Q.R3;
                if (g2Var2 != null) {
                    g2Var2.i();
                    return;
                }
                return;
            case 4:
                c2.Z(c2Var);
                return;
            case 5:
                c2 c2Var2 = this.f19698b;
                if (c2Var2.C0) {
                    c2Var2.p0(true);
                    h1 S2 = c2Var2.Q.S2();
                    if (S2 != null) {
                        S2.N();
                        org.telegram.messenger.g0.K3(S2);
                        return;
                    }
                    return;
                }
                if (c2Var2.B0 == null) {
                    ey eyVar = new ey(c2Var2, true, false, false, c2Var2.getParentActivity(), true, null, c2Var2.P, true, c2Var2.getResourceProvider(), false, false);
                    c2Var2.B0 = eyVar;
                    eyVar.setVisibility(8);
                    ey eyVar2 = c2Var2.B0;
                    eyVar2.f33598y2 = false;
                    eyVar2.setDelegate(new t1(c2Var2));
                    int indexOfChild = c2Var2.P.indexOfChild(c2Var2.f19510b0);
                    if (indexOfChild < 0) {
                        indexOfChild = c2Var2.P.getChildCount();
                    }
                    FrameLayout.LayoutParams e10 = mf.e(-1, c2Var2.o0(), 87);
                    e10.bottomMargin = c2Var2.U0;
                    c2Var2.P.addView(c2Var2.B0, indexOfChild, e10);
                }
                int o02 = c2Var2.o0();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var2.B0.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = mf.e(-1, o02, 87);
                } else {
                    layoutParams.height = o02;
                }
                layoutParams.bottomMargin = c2Var2.U0;
                c2Var2.B0.setLayoutParams(layoutParams);
                c2Var2.B0.setVisibility(0);
                c2Var2.C0 = true;
                c2Var2.E0 = o02 + c2Var2.U0;
                h1 S22 = c2Var2.Q.S2();
                if (S22 != null) {
                    org.telegram.messenger.g0.v1(S22);
                }
                c2Var2.m0();
                c2Var2.f19512c0.j(fg.d, true);
                return;
            case 6:
                f60 f60Var = c2Var.f19541y0;
                if (f60Var != null) {
                    f60Var.u();
                    c2Var.f19541y0 = null;
                }
                final f60 H = f60.H(c2Var, view);
                H.Q = true;
                a T2 = c2Var.Q.T2();
                if (T2 != null && T2.b()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                H.j(z10, 2131231069, null, bd.M0(2131753999, null), new m1(c2Var, T2, 5));
                if (T2 != null && T2.b() && !T2.a() && !T2.c()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.j(z11, 2131231564, null, bd.M0(2131754005, null), new m1(c2Var, T2, 6));
                if (T2 != null && T2.b() && !T2.a() && T2.c()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                H.j(z12, 2131231576, null, bd.M0(2131754002, null), new m1(c2Var, T2, 7));
                if (T2 != null && T2.b() && T2.a() && !T2.c()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                H.j(z13, 2131231597, null, bd.M0(2131754004, null), new m1(c2Var, T2, 8));
                if (T2 != null && (T2.f19431b instanceof TL_iv.pageBlockDetails)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                String M0 = bd.M0(2131753987, null);
                t3 t3Var = c2Var.Q;
                Objects.requireNonNull(t3Var);
                H.j(z14, 2131231552, null, M0, new b(t3Var, 1));
                boolean p22 = c2Var.Q.p2();
                boolean s22 = c2Var.Q.s2();
                if (p22 || s22) {
                    H.k();
                    if (p22) {
                        H.c(2131231565, bd.M0(2131754013, null), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        c2Var.Q.u3(false);
                                        H.u();
                                        return;
                                    default:
                                        c2Var.Q.u3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                    if (s22) {
                        H.c(2131231566, bd.M0(2131753998, null), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        c2Var.Q.u3(false);
                                        H.u();
                                        return;
                                    default:
                                        c2Var.Q.u3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                c2Var.f19541y0 = H;
                return;
            case 7:
                f60 f60Var2 = c2Var.f19541y0;
                if (f60Var2 != null) {
                    f60Var2.u();
                    c2Var.f19541y0 = null;
                }
                t3 t3Var2 = c2Var.Q;
                n5 n5Var = t3Var2.f19919q4;
                if (n5Var == null && (U2 = t3Var2.U2()) != null && U2.getModel() != null) {
                    View findFocus = c2Var.Q.findFocus();
                    if ((findFocus instanceof h1) && (q10 = U2.q((h1) findFocus)) != null) {
                        pagetablecell = q10.f19843b;
                    }
                    if (pagetablecell != null) {
                        c2Var.Q.j2(U2);
                        if (U2.I.add(pagetablecell)) {
                            U2.f19771w.invalidate();
                            U2.v();
                        }
                        n5Var = U2;
                    }
                }
                if (n5Var != null && n5Var.getModel() != null && !n5Var.I.isEmpty()) {
                    c2Var.Q.I4(n5Var);
                    return;
                } else {
                    c2Var.Q.V1(b6.u(2, 2));
                    return;
                }
            case 8:
                f60 f60Var3 = c2Var.f19541y0;
                if (f60Var3 != null) {
                    f60Var3.u();
                    c2Var.f19541y0 = null;
                }
                a T22 = c2Var.Q.T2();
                if (T22 != null) {
                    TL_iv.PageBlock pageBlock = T22.f19431b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                Activity parentActivity = c2Var.getParentActivity();
                if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                    str = pageblockmath.source;
                } else {
                    str = "";
                }
                p.Z(parentActivity, str, new f(2, c2Var, pageblockmath), c2Var.getResourceProvider());
                return;
            case 9:
                c2Var.Q.f19909j4 = null;
                c2Var.t0(90, 0);
                return;
            case 10:
                c2Var.w0();
                vf0 vf0Var = c2Var.P0;
                if (vf0Var != null) {
                    vf0Var.g(true);
                    c2Var.P0 = null;
                    return;
                }
                return;
            case 11:
                c2Var.Q.T4();
                c2Var.D0();
                return;
            case 12:
                c2Var.Q.c4(view);
                return;
            case 13:
                c2Var.Q.d4();
                return;
            case 14:
                c2Var.Q.a4();
                return;
            case 15:
                c2Var.Q.e4();
                return;
            default:
                c2Var.s0();
                return;
        }
    }
}
