package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.tgnet.tl.TL_iv;
public final class pe9 implements View.OnClickListener {
    public final byte a;
    public final jf9 b;

    public pe9(jf9 jf9Var, byte b) {
        this.a = b;
        this.b = jf9Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        kk9 N2;
        nk9 q;
        String str;
        byte b = this.a;
        TL_iv.pageTableCell pagetablecell = null;
        r5 = null;
        TL_iv.pageBlockMath pageblockmath = null;
        pagetablecell = null;
        final jf9 jf9Var = this.b;
        switch (b) {
            case 0:
                jf9Var.v0();
                return;
            case 1:
                if (!jf9Var.Q.B2()) {
                    jf9Var.finishFragment();
                    return;
                }
                return;
            case 2:
                of9 of9Var = jf9Var.Q.R3;
                if (of9Var != null) {
                    of9Var.k();
                    return;
                }
                return;
            case 3:
                of9 of9Var2 = jf9Var.Q.R3;
                if (of9Var2 != null) {
                    of9Var2.i();
                    return;
                }
                return;
            case 4:
                jf9Var.l0();
                return;
            case 5:
                jf9 jf9Var2 = this.b;
                if (jf9Var2.C0) {
                    jf9Var2.h0(true);
                    ne9 L2 = jf9Var2.Q.L2();
                    if (L2 != null) {
                        L2.O();
                        gm.E3(L2);
                        return;
                    }
                    return;
                }
                if (jf9Var2.B0 == null) {
                    e34 e34Var = new e34(jf9Var2, true, false, false, jf9Var2.getParentActivity(), true, null, jf9Var2.P, true, jf9Var2.getResourceProvider(), false, false);
                    jf9Var2.B0 = e34Var;
                    e34Var.setVisibility(8);
                    e34 e34Var2 = jf9Var2.B0;
                    e34Var2.x2 = false;
                    e34Var2.setDelegate(new af9(jf9Var2));
                    int indexOfChild = jf9Var2.P.indexOfChild(jf9Var2.b0);
                    if (indexOfChild < 0) {
                        indexOfChild = jf9Var2.P.getChildCount();
                    }
                    FrameLayout.LayoutParams e = qoe.e(-1, jf9Var2.g0(), 87);
                    e.bottomMargin = jf9Var2.U0;
                    jf9Var2.P.addView(jf9Var2.B0, indexOfChild, e);
                }
                int g0 = jf9Var2.g0();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jf9Var2.B0.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = qoe.e(-1, g0, 87);
                } else {
                    layoutParams.height = g0;
                }
                layoutParams.bottomMargin = jf9Var2.U0;
                jf9Var2.B0.setLayoutParams(layoutParams);
                jf9Var2.B0.setVisibility(0);
                jf9Var2.C0 = true;
                jf9Var2.E0 = g0 + jf9Var2.U0;
                ne9 L22 = jf9Var2.Q.L2();
                if (L22 != null) {
                    gm.t1(L22);
                }
                jf9Var2.e0();
                jf9Var2.c0.j(b02.d, true);
                return;
            case 6:
                bu5 bu5Var = jf9Var.y0;
                if (bu5Var != null) {
                    bu5Var.u();
                    jf9Var.y0 = null;
                }
                final bu5 I = bu5.I(jf9Var, view);
                I.T = true;
                ll0 M2 = jf9Var.Q.M2();
                if (M2 != null && M2.b()) {
                    z = false;
                } else {
                    z = true;
                }
                I.i(z, 2131231072, null, jb6.M0(2131753964, null), new te9(jf9Var, M2, (byte) 5));
                if (M2 != null && M2.b() && !M2.a() && !M2.c()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                I.i(z2, 2131231569, null, jb6.M0(2131753970, null), new te9(jf9Var, M2, (byte) 6));
                if (M2 != null && M2.b() && !M2.a() && M2.c()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                I.i(z3, 2131231581, null, jb6.M0(2131753967, null), new te9(jf9Var, M2, (byte) 7));
                if (M2 != null && M2.b() && M2.a() && !M2.c()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                I.i(z4, 2131231602, null, jb6.M0(2131753969, null), new te9(jf9Var, M2, (byte) 8));
                if (M2 != null && (M2.b instanceof TL_iv.pageBlockDetails)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                String M0 = jb6.M0(2131753952, null);
                ch9 ch9Var = jf9Var.Q;
                Objects.requireNonNull(ch9Var);
                I.i(z5, 2131231557, null, M0, new b82(ch9Var, (byte) 1));
                boolean h2 = jf9Var.Q.h2();
                boolean k2 = jf9Var.Q.k2();
                if (h2 || k2) {
                    I.j();
                    if (h2) {
                        I.b(2131231570, jb6.M0(2131753978, null), new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r3;
                                bu5 bu5Var2 = I;
                                jf9 jf9Var3 = jf9Var;
                                switch (b2) {
                                    case 0:
                                        jf9Var3.Q.n3(false);
                                        bu5Var2.u();
                                        return;
                                    default:
                                        jf9Var3.Q.n3(true);
                                        bu5Var2.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                    if (k2) {
                        I.b(2131231571, jb6.M0(2131753963, null), new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r3;
                                bu5 bu5Var2 = I;
                                jf9 jf9Var3 = jf9Var;
                                switch (b2) {
                                    case 0:
                                        jf9Var3.Q.n3(false);
                                        bu5Var2.u();
                                        return;
                                    default:
                                        jf9Var3.Q.n3(true);
                                        bu5Var2.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                I.X = true;
                I.a0();
                jf9Var.y0 = I;
                return;
            case 7:
                bu5 bu5Var2 = jf9Var.y0;
                if (bu5Var2 != null) {
                    bu5Var2.u();
                    jf9Var.y0 = null;
                }
                ch9 ch9Var2 = jf9Var.Q;
                kk9 kk9Var = ch9Var2.q4;
                if (kk9Var == null && (N2 = ch9Var2.N2()) != null && N2.getModel() != null) {
                    View findFocus = jf9Var.Q.findFocus();
                    if ((findFocus instanceof ne9) && (q = N2.q((ne9) findFocus)) != null) {
                        pagetablecell = q.b;
                    }
                    if (pagetablecell != null) {
                        jf9Var.Q.b2(N2);
                        if (N2.I.add(pagetablecell)) {
                            N2.w.invalidate();
                            N2.v();
                        }
                        kk9Var = N2;
                    }
                }
                if (kk9Var != null && kk9Var.getModel() != null && !kk9Var.I.isEmpty()) {
                    jf9Var.Q.H4(kk9Var);
                    return;
                } else {
                    jf9Var.Q.N1(xk9.t(2, 2));
                    return;
                }
            case 8:
                bu5 bu5Var3 = jf9Var.y0;
                if (bu5Var3 != null) {
                    bu5Var3.u();
                    jf9Var.y0 = null;
                }
                ll0 M22 = jf9Var.Q.M2();
                if (M22 != null) {
                    TL_iv.PageBlock pageBlock = M22.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                Activity parentActivity = jf9Var.getParentActivity();
                if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                    str = pageblockmath.source;
                } else {
                    str = "";
                }
                p82.X(parentActivity, str, new u35(jf9Var, pageblockmath, (byte) 27), jf9Var.getResourceProvider());
                return;
            case 9:
                jf9Var.Q.j4 = null;
                jf9Var.q0(90, 0);
                return;
            case 10:
                jf9Var.v0();
                j67 j67Var = jf9Var.P0;
                if (j67Var != null) {
                    j67Var.f(true);
                    jf9Var.P0 = null;
                    return;
                }
                return;
            case 11:
                jf9Var.Q.T4();
                jf9Var.D0();
                return;
            case 12:
                jf9Var.Q.Z3(view);
                return;
            case 13:
                jf9Var.Q.a4();
                return;
            case 14:
                jf9Var.Q.X3();
                return;
            case 15:
                jf9Var.Q.b4();
                return;
            default:
                jf9Var.o0();
                return;
        }
    }
}
