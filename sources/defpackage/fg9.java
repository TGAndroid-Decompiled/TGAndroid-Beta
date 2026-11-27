package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.tgnet.tl.TL_iv;
public final class fg9 implements View.OnClickListener {
    public final byte a;
    public final yg9 b;

    public fg9(yg9 yg9Var, byte b) {
        this.a = b;
        this.b = yg9Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        xl9 O2;
        am9 q;
        String str;
        byte b = this.a;
        TL_iv.pageTableCell pagetablecell = null;
        r6 = null;
        TL_iv.pageBlockMath pageblockmath = null;
        pagetablecell = null;
        final yg9 yg9Var = this.b;
        switch (b) {
            case 0:
                yg9Var.n0();
                return;
            case 1:
                yg9Var.u0();
                return;
            case 2:
                if (!yg9Var.Q.C2()) {
                    yg9Var.finishFragment();
                    return;
                }
                return;
            case 3:
                ch9 ch9Var = yg9Var.Q.R3;
                if (ch9Var != null) {
                    ch9Var.k();
                    return;
                }
                return;
            case 4:
                ch9 ch9Var2 = yg9Var.Q.R3;
                if (ch9Var2 != null) {
                    ch9Var2.i();
                    return;
                }
                return;
            case 5:
                yg9Var.k0();
                return;
            case 6:
                yg9 yg9Var2 = this.b;
                if (yg9Var2.C0) {
                    yg9Var2.g0(true);
                    dg9 M2 = yg9Var2.Q.M2();
                    if (M2 != null) {
                        M2.O();
                        hl.E3(M2);
                        return;
                    }
                    return;
                }
                if (yg9Var2.B0 == null) {
                    o24 o24Var = new o24(yg9Var2, true, false, false, yg9Var2.getParentActivity(), true, null, yg9Var2.P, true, yg9Var2.getResourceProvider(), false, false);
                    yg9Var2.B0 = o24Var;
                    o24Var.setVisibility(8);
                    o24 o24Var2 = yg9Var2.B0;
                    o24Var2.x2 = false;
                    o24Var2.setDelegate(new qg9(yg9Var2));
                    int indexOfChild = yg9Var2.P.indexOfChild(yg9Var2.b0);
                    if (indexOfChild < 0) {
                        indexOfChild = yg9Var2.P.getChildCount();
                    }
                    FrameLayout.LayoutParams e = tre.e(-1, yg9Var2.f0(), 87);
                    e.bottomMargin = yg9Var2.U0;
                    yg9Var2.P.addView(yg9Var2.B0, indexOfChild, e);
                }
                int f0 = yg9Var2.f0();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yg9Var2.B0.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = tre.e(-1, f0, 87);
                } else {
                    layoutParams.height = f0;
                }
                layoutParams.bottomMargin = yg9Var2.U0;
                yg9Var2.B0.setLayoutParams(layoutParams);
                yg9Var2.B0.setVisibility(0);
                yg9Var2.C0 = true;
                yg9Var2.E0 = f0 + yg9Var2.U0;
                dg9 M22 = yg9Var2.Q.M2();
                if (M22 != null) {
                    hl.t1(M22);
                }
                yg9Var2.d0();
                yg9Var2.c0.j(gz1.d, true);
                return;
            case 7:
                fu5 fu5Var = yg9Var.y0;
                if (fu5Var != null) {
                    fu5Var.u();
                    yg9Var.y0 = null;
                }
                final fu5 I = fu5.I(yg9Var, view);
                I.W = true;
                mk0 N2 = yg9Var.Q.N2();
                if (N2 != null && N2.b()) {
                    z = false;
                } else {
                    z = true;
                }
                I.i(z, 2131231071, null, ob6.M0(2131753992, null), new eg9(yg9Var, N2, (byte) 6));
                if (N2 != null && N2.b() && !N2.a() && !N2.c()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                I.i(z2, 2131231568, null, ob6.M0(2131753998, null), new eg9(yg9Var, N2, (byte) 7));
                if (N2 != null && N2.b() && !N2.a() && N2.c()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                I.i(z3, 2131231580, null, ob6.M0(2131753995, null), new eg9(yg9Var, N2, (byte) 8));
                if (N2 != null && N2.b() && N2.a() && !N2.c()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                I.i(z4, 2131231601, null, ob6.M0(2131753997, null), new eg9(yg9Var, N2, (byte) 9));
                if (N2 != null && (N2.b instanceof TL_iv.pageBlockDetails)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                String M0 = ob6.M0(2131753980, null);
                pi9 pi9Var = yg9Var.Q;
                Objects.requireNonNull(pi9Var);
                I.i(z5, 2131231556, null, M0, new m72(pi9Var, (byte) 1));
                boolean i2 = yg9Var.Q.i2();
                boolean l2 = yg9Var.Q.l2();
                if (i2 || l2) {
                    I.j();
                    if (i2) {
                        I.b(2131231569, ob6.M0(2131754006, null), new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r3;
                                fu5 fu5Var2 = I;
                                yg9 yg9Var3 = yg9Var;
                                switch (b2) {
                                    case 0:
                                        yg9Var3.Q.o3(false);
                                        fu5Var2.u();
                                        return;
                                    default:
                                        yg9Var3.Q.o3(true);
                                        fu5Var2.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                    if (l2) {
                        I.b(2131231570, ob6.M0(2131753991, null), new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r3;
                                fu5 fu5Var2 = I;
                                yg9 yg9Var3 = yg9Var;
                                switch (b2) {
                                    case 0:
                                        yg9Var3.Q.o3(false);
                                        fu5Var2.u();
                                        return;
                                    default:
                                        yg9Var3.Q.o3(true);
                                        fu5Var2.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                I.a0 = true;
                I.a0();
                yg9Var.y0 = I;
                return;
            case 8:
                fu5 fu5Var2 = yg9Var.y0;
                if (fu5Var2 != null) {
                    fu5Var2.u();
                    yg9Var.y0 = null;
                }
                pi9 pi9Var2 = yg9Var.Q;
                xl9 xl9Var = pi9Var2.q4;
                if (xl9Var == null && (O2 = pi9Var2.O2()) != null && O2.getModel() != null) {
                    View findFocus = yg9Var.Q.findFocus();
                    if ((findFocus instanceof dg9) && (q = O2.q((dg9) findFocus)) != null) {
                        pagetablecell = q.b;
                    }
                    if (pagetablecell != null) {
                        yg9Var.Q.c2(O2);
                        if (O2.I.add(pagetablecell)) {
                            O2.w.invalidate();
                            O2.v();
                        }
                        xl9Var = O2;
                    }
                }
                if (xl9Var != null && xl9Var.getModel() != null && !xl9Var.I.isEmpty()) {
                    yg9Var.Q.I4(xl9Var);
                    return;
                } else {
                    yg9Var.Q.O1(km9.t(2, 2));
                    return;
                }
            case 9:
                fu5 fu5Var3 = yg9Var.y0;
                if (fu5Var3 != null) {
                    fu5Var3.u();
                    yg9Var.y0 = null;
                }
                mk0 N22 = yg9Var.Q.N2();
                if (N22 != null) {
                    TL_iv.PageBlock pageBlock = N22.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                Activity parentActivity = yg9Var.getParentActivity();
                if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                    str = pageblockmath.source;
                } else {
                    str = "";
                }
                v72.W(parentActivity, str, new v35(yg9Var, pageblockmath, (byte) 27), yg9Var.getResourceProvider());
                return;
            case 10:
                yg9Var.u0();
                q67 q67Var = yg9Var.P0;
                if (q67Var != null) {
                    q67Var.f(true);
                    yg9Var.P0 = null;
                    return;
                }
                return;
            case 11:
                yg9Var.Q.j4 = null;
                yg9Var.p0(90, 0);
                return;
            case 12:
                yg9Var.Q.U4();
                yg9Var.D0();
                return;
            case 13:
                yg9Var.Q.a4(view);
                return;
            case 14:
                yg9Var.Q.b4();
                return;
            case 15:
                yg9Var.Q.Y3();
                return;
            default:
                yg9Var.Q.c4();
                return;
        }
    }
}
